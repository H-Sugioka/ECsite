package com.internousdev.mars.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.mars.dao.MCategoryDAO;
import com.internousdev.mars.dto.MCategoryDTO;
import com.internousdev.mars.util.CommonUtility;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{

	private List<MCategoryDTO> mCategoryList = new ArrayList<MCategoryDTO>();
	private Map<String, Object> session;

	public String execute(){

		if(!(session.containsKey("tempUserId"))){	//session内に仮ユーザーIDがないとき。ランダムな値で自動生成する
			CommonUtility comUtil = new CommonUtility();
			session.put("tempUserId", comUtil.getRamdomValue());
		}

		if(!(session.containsKey("loginFlg"))){	//session内にログイン状態フラグがないとき。0で自動生成する
			session.put("loginFlg", 0);
		}

		if(!(session.containsKey("mCategoryList"))){	//session内にmCategoryListがないとき。テーブルm_categoryの内容(List)を入れる
			MCategoryDAO mCategoryDao = new MCategoryDAO();
			mCategoryList =  mCategoryDao.getCategoryInfo();
			session.put("mCategoryList", mCategoryList);
		}
		return SUCCESS;
	}

	public List<MCategoryDTO> getmCategoryList() {
		return mCategoryList;
	}

	public void setmCategoryList(List<MCategoryDTO> mCategoryList) {
		this.mCategoryList = mCategoryList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
