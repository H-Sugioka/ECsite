package com.internousdev.mars.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.mars.dto.CartInfoDTO;

public class CartInfoDTOTest {

	@Test
	public void testGetId1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);	}

	@Test
	public void testGetId4()throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax =
					Integer.parseInt("2147483647");
			dto.setId(postalMax);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string:\"2147483648\"");
		}
	}

	@Test
	public void testGetId5()throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin =
					Integer.parseInt("-2147483647");
			dto.setId(postalMin);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string:\"-2147483648\"");
		}
	}

	//setId

	@Test
	public void testSetId1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);	}

	@Test
	public void testSetId4(){
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax =
					Integer.parseInt("2147483647");
			dto.setId(postalMax);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string:\"2147483648\"");
		}
	}

	@Test
	public void testSetId5(){
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin =
					Integer.parseInt("-2147483647");
			dto.setId(postalMin);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string:\"-2147483648\"");
		}
	}

	//getUserId

	@Test
	public void testGetUserId1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void testGetUserId9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void testGetUserId10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void testGetUserId11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void testGetUserId12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//setUserId

	@Test
	public void testSetUserId1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserId8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void testSetUserId9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void testSetUserId10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void testSetUserId11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void testSetUserId12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//getTempUserIdのテスト

	@Test
	public void testGetTempUserId1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTempUserId8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void testGetTempUserId9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void testGetTempUserId10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void testGetTempUserId11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void testGetTempUserId12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//setTempUserId

	@Test
	public void testSetTempUserId1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTempUserId8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void testSetTempUserId9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void testSetTempUserId10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void testSetTempUserId11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void testSetTempUserId12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//getProductId test

	@Test
	public void testGetProductId1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId4()throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setProductId(postalMax);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductId5()throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483648");
			dto.setProductId(postalMin);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//setProductId test

	@Test
	public void testSetProductId1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductId4()throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setProductId(postalMax);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductId5()throws Exception {
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483648");
			dto.setProductId(postalMin);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//getProductCount test

	@Test
	public void testGetProductCount1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setProductCount(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetProductCount5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483648");
			dto.setProductCount(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//SetProductCount test

	@Test
	public void testSetProductCount1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -2147483647;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setProductCount(postalMax);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProductCount5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483648");
			dto.setProductCount(postalMin);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483648\"");
		}
	}

	//get Price test

	@Test
	public void testGetPrice1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 9999999;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -9999999;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("10000000");
			dto.setProductCount(postalMax);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testGetPrice5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-10000000");
			dto.setProductCount(postalMin);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	//set Price test
	@Test
	public void testSetPrice1() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 0;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice2() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = 9999999;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice3() {
		CartInfoDTO dto = new CartInfoDTO();
		int expected = -9999999;

		dto.setProductCount(expected);
		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice4() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMax = Integer.parseInt("10000000");
			dto.setProductCount(postalMax);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"10000000.00\"");
		}
	}

	@Test
	public void testSetPrice5() throws Exception{
		CartInfoDTO dto = new CartInfoDTO();
		try{
			int postalMin = Integer.parseInt("-10000000");
			dto.setProductCount(postalMin);
		}catch (RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-10000000.00\"");
		}
	}

	//get ProductName test

	@Test
	public void GetProductName1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void GetProductName2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void GetProductName3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void GetProductName4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void GetProductName5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void GetProductName6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void GetProductName7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void GetProductName8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void GetProductName9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void GetProductName10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void GetProductName11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void GetProductName12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	//set ProductName test

	@Test
	public void SetProductName1() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "0";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void SetProductName2() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void SetProductName3() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "-2147483647";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void SetProductName4() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "null";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void SetProductName5() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void SetProductName6() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = " ";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void SetProductName7() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "　";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void SetProductName8() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void SetProductName9() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void SetProductName10() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void SetProductName11() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	public void SetProductName12() {
		CartInfoDTO dto = new CartInfoDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setUserId(expected);
		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

//Namekana ProductNameKana //18個目から @だと131個目から
	@Test	//18@131
	public void testGetProductNamekana1() {
		CartInfoDTO dto= new CartInfoDTO();
		String expected = "0";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNamekana2() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "2147483647";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNamekana3() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "-2147483647";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNamekana4() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "null";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNamekana5() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNamekana6() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = " ";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNamekana7() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "　";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNamekana8() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "abc123";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNamekana9() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "あいう１２３";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNamekana10() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "abc123あいう１２３";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNamekana11() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNamekana12() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "ａｂｃあいう１２３漢字";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}
	//set ProductNamekana test 19
	@Test
	public void testSetProductNameKana1() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "0";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana2() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "2147483647";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana3() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "-2147483647";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana4() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "null";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana5() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana6() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = " ";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana7() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "　";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana8() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "abc123";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana9() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "あいう１２３";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana10() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "abc123あいう１２３";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana11() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana12() {
	CartInfoDTO dto= new CartInfoDTO();
	String expected = "ａbｃあいう１２３漢字";

	dto.setProductNameKana(expected);
	String actual = dto.getProductNameKana();
	assertEquals(expected, actual);
	}

//get ImageFilePath test
@Test
public void testGetImageFilePath1() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "0";
	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected,actual);
}
@Test
public void testGetImageFilePath2() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "2147483647";
	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected,actual);
}
@Test
public void testGetImageFilePath3() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "-2147483647";
	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected,actual);
}
@Test
public void testGetImageFilePath4() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "null";
	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected,actual);
}
@Test
public void testGetImageFilePath5() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "";
	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected,actual);
}
@Test
public void testGetImageFilePath6() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = " ";
	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected,actual);
}
@Test
public void testGetImageFilePath7() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "　";
	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected,actual);
}
@Test
public void testGetImageFilePath8() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123";
	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected,actual);
}
@Test
public void testGetImageFilePath9() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "あいう１２３";
	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected,actual);
}
@Test
public void testGetImageFilePath10() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123あいう１２３";
	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected,actual);
}
@Test
public void testGetImageFilePath11() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123あいう１２３漢字";
	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected,actual);
}
@Test
public void testGetImageFilePath12() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "ａｂｃあいう１２３";
	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected,actual);
}
//set ImageFilePath test 1を消すと写経
@Test
public void testSetImageFilePath1() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "0";

	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected, actual);
}
@Test
public void testSetImageFilePath2() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "2147483647";

	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected, actual);
}
@Test
public void testSetImageFilePath3() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "-2147483647";

	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected, actual);
}
@Test
public void testSetImageFilePath4() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "null";

	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected, actual);
}
@Test
public void testSetImageFilePath5() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "";

	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected, actual);
}
@Test
public void testSetImageFilePath6() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = " ";

	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected, actual);
}
@Test
public void testSetImageFilePath7() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "　";

	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected, actual);
}
@Test
public void testSetImageFilePath8() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123";

	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected, actual);
}
@Test
public void testSetImageFilePath9() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "あいう１２３";

	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected, actual);
}
@Test
public void testSetImageFilePath10() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123あいう１２３";

	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected, actual);
}
@Test
public void testSetImageFilePath11() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected, actual);
}
@Test
public void testSetImageFilePath12() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "ａｂｃあいう１２３漢字";

	dto.setImageFilePath(expected);
	String actual = dto.getImageFilePath();
	assertEquals(expected, actual);
}
//get ImageFileName test 26
@Test
public void testGetImageFileName1() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "0";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void testGetImageFileName2() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "2147483647";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void testGetImageFileName3() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "-2147483647";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void testGetImageFileName4() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "null";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void testGetImageFileName5() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void testGetImageFileName6() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = " ";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void testGetImageFileName7() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "　";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void testGetImageFileName8() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void testGetImageFileName9() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "あいう１２３";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void testGetImageFileName10() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123ａｂｃ１２３";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void testGetImageFileName11() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void testGetImageFileName12() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "ａｂｃあいう１２３漢字";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
//set ImageFileName test 27
@Test
public void tesSetImageFileName1() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "0";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void tesSetImageFileName2() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "2147483647";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void tesSetImageFileName3() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "-2147483647";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void tesSetImageFileName4() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "null";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void tesSetImageFileName5() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void tesSetImageFileName6() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = " ";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void tesSetImageFileName7() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "　";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void tesSetImageFileName8() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void tesSetImageFileName9() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "あいう１２３";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void tesSetImageFileName10() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123あいう１２３";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void tesSetImageFileName11() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
@Test
public void tesSetImageFileName12() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "ａｂｃあいう１２３漢字";

	dto.setImageFileName(expected);
	String actual = dto.getImageFileName();
	assertEquals(expected, actual);
}
//get ReleaseDate test 28
@Test
public void tesGetReleaseDate1() {
	CartInfoDTO dto = new CartInfoDTO();
	Date expected = null;

	dto.setReleaseDate(expected);
	Date actual = dto.getReleaseDate();
	assertEquals(expected, actual);
}
@Test
public void tesGetReleaseDate2() throws ParseException {
	CartInfoDTO dto = new CartInfoDTO();

	SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMddHH:mm:ss");
	Date expected = sdf.parse("20180420 12:00:00");
	dto.setReleaseDate(expected);
	assertEquals(expected, dto.getReleaseDate());
}
//set ReleaseDate test 29
@Test
public void tesSetReleaseDate1() {
	CartInfoDTO dto = new CartInfoDTO();
	Date expected = null;

	dto.setReleaseDate(expected);
	Date actual = dto.getReleaseDate();
	assertEquals(expected, actual);
}
@Test
public void tesSetReleaseDate2() throws ParseException {
	CartInfoDTO dto = new CartInfoDTO();

	SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMddHH:mm:ss");
	Date expected = sdf.parse("20180420 12:00:00");
	dto.setReleaseDate(expected);;
	assertEquals(expected, dto.getReleaseDate());
}
// getReleaseCompany test 30
@Test
public void tesGetReleaseCompany1() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "0";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesGetReleaseCompany2() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "2147483647";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesGetReleaseCompany3() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "-2147483647";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesGetReleaseCompany4() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "null";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesGetReleaseCompany5() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesGetReleaseCompany6() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = " ";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesGetReleaseCompany7() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "　";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesGetReleaseCompany8() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesGetReleaseCompany9() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "あいう１２３";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesGetReleaseCompany10() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123あいう１２３";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesGetReleaseCompany11() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesGetReleaseCompany12() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "ａｂｃあいう１２３漢字";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
// set ReleaseCompany test 31
@Test
public void tesSetReleaseCompany1() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "0";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesSetReleaseCompany2() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "2147483647";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesSetReleaseCompany3() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "-2147483647";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesSetReleaseCompany4() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "null";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesSetReleaseCompany5() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesSetReleaseCompany6() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = " ";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesSetReleaseCompany7() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "　";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesSetReleaseCompany8() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesSetReleaseCompany9() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "あいう１２３";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesSetReleaseCompany10() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123あいう１２３";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesSetReleaseCompany11() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
@Test
public void tesSetReleaseCompany12() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "ａｂｃあいう１２３漢字";

	dto.setReleaseCompany(expected);
	String actual = dto.getReleaseCompany();
	assertEquals(expected, actual);
}
// get Status test 32
@Test
public void tesgetSubtotal1() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "0";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesGetStatus2() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "2147483647";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesGetStatus3() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "-2147483647";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesGetStatus4() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "null";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesGetStatus5() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesGetStatus6() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = " ";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesGetStatus7() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "　";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesGetStatus8() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesGetStatus9() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "あいう１２３";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesGetStatus10() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123あいう１２３";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesGetStatus11() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesGetStatus12() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "ａｂｃあいう１２３漢字";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
// set Status test33
@Test
public void tesSetStatus1() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "0";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesSetStatus2() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "2147483647";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesSetStatus3() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "-2147483647";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesSetStatus4() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "null";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesSetStatus5() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesSetStatus6() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = " ";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesSetStatus7() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "　";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesSetStatus8() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesSetStatus9() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "あいう１２３";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesSetStatus10() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123あいう１２３";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesSetStatus11() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "abc123あいう１２３漢字";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
@Test
public void tesSetStatus12() {
	CartInfoDTO dto = new CartInfoDTO();
	String expected = "ａｂｃあいう１２３漢字";

	dto.setStatus(expected);
	String actual = dto.getStatus();
	assertEquals(expected, actual);
}
//getSubtotal test34
@Test
public void tesGetStatusl1() {
	CartInfoDTO dto = new CartInfoDTO();
	int expected = 0;

	dto.setSubtotal(expected);
	int actual = dto.getSubtotal();
	assertEquals(expected, actual);
}
@Test
public void tesGetSubtotal2() {
	CartInfoDTO dto = new CartInfoDTO();
	int expected = 2147483647;

	dto.setSubtotal(expected);
	int actual = dto.getSubtotal();
	assertEquals(expected, actual);
}
@Test
public void tesGetSubtotal3() {
	CartInfoDTO dto = new CartInfoDTO();
	int expected = -2147483647;

	dto.setSubtotal(expected);
	int actual = dto.getSubtotal();
	assertEquals(expected, actual);
}
@Test
public void tesGetSubtotal4() throws Exception {
	CartInfoDTO dto = new CartInfoDTO();
	try{
		int
postalMax=Integer.parseInt("2147483648");
		dto.setSubtotal(postalMax);

	}catch(RuntimeException e){
	assertEquals(e.getMessage(),"For input string: \"2147483648\"");
	}
}
@Test
public void tesGetSubtotal5() throws Exception {
	CartInfoDTO dto = new CartInfoDTO();
	try{
		int
postalMax=Integer.parseInt("-2147483648");
		dto.setSubtotal(postalMax);

	}catch(RuntimeException e){
	assertEquals(e.getMessage(),"For input string:\"-2147483648\"");
	}
}
//SetSubtotal test35
@Test
public void tesSetSubtotal1() {
	CartInfoDTO dto = new CartInfoDTO();
	int expected = 0;

	dto.setSubtotal(expected);
	int actual = dto.getSubtotal();
	assertEquals(expected, actual);
}
@Test
public void tesGetSetSubtotal2() {
	CartInfoDTO dto = new CartInfoDTO();
	int expected = 2147483647;

	dto.setSubtotal(expected);
	int actual = dto.getSubtotal();
	assertEquals(expected, actual);
}
@Test
public void tesGetSetSubtotal3() {
	CartInfoDTO dto = new CartInfoDTO();
	int expected = -2147483647;

	dto.setSubtotal(expected);
	int actual = dto.getSubtotal();
	assertEquals(expected, actual);
}
@Test
public void testSetSubtotal4() throws Exception {
	CartInfoDTO dto = new CartInfoDTO();
	try{
		int postalMax=
Integer.parseInt("2147483648");
		dto.setSubtotal(postalMax);

	}catch(RuntimeException e){
	assertEquals(e.getMessage(),"For input string: \"2147483648\"");
	}
}
@Test
public void testSetSubtotal5() throws Exception {
	CartInfoDTO dto = new CartInfoDTO();
	try{
		int postalMin=
Integer.parseInt("-2147483648");
		dto.setSubtotal(postalMin);

	}catch(RuntimeException e){
	assertEquals(e.getMessage(),"For input string: \"-2147483648\"");
	}
}
}