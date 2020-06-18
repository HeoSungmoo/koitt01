package com.koitt.jardin.controller.Data_controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Data_controller {
	// 공공데이터를 받아오는 메소드
	@RequestMapping("dataList")
	@ResponseBody // json파일 형태로 변형해서 뿌려준다.
	public Map<String, Object> DataList() throws IOException {

		StringBuilder urlBuilder = new StringBuilder(
				"http://api.visitkorea.or.kr/openapi/service/rest/GreenTourService/areaCode"); /* URL */
		urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
				+ "=U0%2FKQZb7fpJjbYps0N%2BreG9ZzSyBZfuSi0RhdpkiMgn7TXr3S3WYAJVLCqcr1KZl%2FWFrkhMAhir05jWv0pslFA%3D%3D"); /*
																															 * Service
																															 * Key
																															 */
		urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
				+ URLEncoder.encode("10", "UTF-8")); /* 한 페이지 결과 수 */
		urlBuilder.append(
				"&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 현재 페이지 번호 */
		urlBuilder.append("&" + URLEncoder.encode("MobileOS", "UTF-8") + "="
				+ URLEncoder.encode("ETC", "UTF-8")); /* IOS(아이폰),AND(안드로이드),WIN(원도우폰),ETC */
		urlBuilder.append("&" + URLEncoder.encode("MobileApp", "UTF-8") + "="
				+ URLEncoder.encode("AppTest", "UTF-8")); /* 서비스명=어플명 */
		urlBuilder.append(
				"&" + URLEncoder.encode("areaCode", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 지역코드,시군구코드 */
		urlBuilder.append("&" + URLEncoder.encode("ServiceKey", "UTF-8") + "="
				+ URLEncoder.encode("SERVICE_KEY", "UTF-8")); /* 서비스 인증 */
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(sb.toString());
		map.put("dataList", sb.toString());

		return null;
	}

	// 공공데이터 출력 jsp
	@RequestMapping
	public String DataPage() {
		Map<String, Object> map = new HashMap<String, Object>();

		return null;
	}
}
