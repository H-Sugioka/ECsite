package com.internousdev.mars.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.mars.dao.ProductInfoDAO;
import com.internousdev.mars.dto.ProductInfoDTO;
import com.internousdev.mars.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class SearchItemAction extends ActionSupport implements SessionAware{

	private String categoryId;
	private String keywords;
	private List<String> keywordsErrorMessageList = new ArrayList<String>();
	private List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();
	private Map<String,Object> session;

	public String execute(){
		//セッションタイムアウト確認
				if(session.isEmpty()){
					return "sessionError";
				}
		String result = ERROR;
		session.remove("keywordsErrorMessageList");
		InputChecker inputChecker = new InputChecker();

		String tempKeywords = null;

		if(StringUtils.isBlank(keywords)){
			tempKeywords = "";					//入力値(検索ワード)が空なら空白をtempに代入
		}else{
			tempKeywords = keywords.replaceAll("　", " ").replaceAll("\\s{2,}", " ");	//そうでなければ全角スペースと2つ以上のスペースを半角スペース1個に置き換えたものをtempに代入
		}

		if(!(tempKeywords.equals(""))){		//キーワードが空でなければ。規定内かのチェックをして違反があれば結果をキーワードエラーメッセージリストに入れる
			keywordsErrorMessageList = inputChecker.doCheck("検索ワード", keywords, 0, 50, true, true, true, true, false, true, true);

			if(!(keywordsErrorMessageList.isEmpty())){		//エラーメッセージが存在していれば遷移させる。
				return SUCCESS;
			}
		}

		ProductInfoDAO productInfoDAO = new ProductInfoDAO();

		try{
			switch(categoryId){
				case "1"://全商品
					productInfoDtoList = productInfoDAO.getProductInfoListAll(tempKeywords.split(" "));
					result = SUCCESS;
					break;

				default://カテゴリ選択時
					productInfoDtoList = productInfoDAO.getProductInfoListBykeywords(tempKeywords.split(" "), categoryId);
					result = SUCCESS;
					break;
			}
		}catch(NullPointerException e){							//categoryIdがnullならばエラーページに遷移させる
			return "sessionError";
		}

			Iterator<ProductInfoDTO> iterator = productInfoDtoList.iterator();
			if(!(iterator.hasNext())){								//該当する商品情報がない場合はnull値を代入する
				productInfoDtoList=null;
			}

			return result;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public List<String> getKeywordsErrorMessageList() {
		return keywordsErrorMessageList;
	}

	public void setKeywordsErrorMessageList(List<String> keywordsErrorMessageList) {
		this.keywordsErrorMessageList = keywordsErrorMessageList;
	}

	public List<ProductInfoDTO> getProductInfoDtoList() {
		return productInfoDtoList;
	}

	public void setProductInfoDtoList(List<ProductInfoDTO> productInfoDtoList) {
		this.productInfoDtoList = productInfoDtoList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
