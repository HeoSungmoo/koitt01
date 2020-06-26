package com.koitt.jardin.batis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Data_controller1 {

	@RequestMapping("/json_test1")
	@ResponseBody
	public Map<String, Object> json_test1() {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("dataList", "dataList");
		map.put("response", "response");
		map.put("body", "body");

		return map;

	}

	// 공공데이터를 받아오는 메소드
	@RequestMapping("/dataList")
	@ResponseBody
	public Map<String, Object> DataList() throws IOException, ParseException {
		Map<String, Object> map = new HashMap<String, Object>();
		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst"); /* URL */
		urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")
				+ "=gYFAbs%2BMmYhL3i0VkjWo63puQuYKkKBd1nbXJ2UKvhGq7iJdMG6KP1wnOnj40YAisn8JdipNcOYw5C4e0bTWCQ%3D%3D"); /*
																														 * Service
																														 * Key
																														 */
		urlBuilder.append("&" + URLEncoder.encode("ServiceKey", "UTF-8") + "="
				+ URLEncoder.encode("-", "UTF-8")); /* 공공데이터포털에서 받은 인증키 */
		urlBuilder
				.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 페이지번호 */
		urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
				+ URLEncoder.encode("10", "UTF-8")); /* 한 페이지 결과 수 */
		urlBuilder.append("&" + URLEncoder.encode("dataType", "UTF-8") + "="
				+ URLEncoder.encode("XML", "UTF-8")); /* 요청자료형식(XML/JSON) */
		urlBuilder.append("&" + URLEncoder.encode("CURRENT_DATE", "UTF-8") + "="
				+ URLEncoder.encode("2019122010", "UTF-8")); /* 2016-12-01 01시부터 조회 */
		urlBuilder.append("&" + URLEncoder.encode("HOUR", "UTF-8") + "="
				+ URLEncoder.encode("24", "UTF-8")); /* CURRENT_DATE부터 24시간 후까지의 자료 호출 */
		urlBuilder.append(
				"&" + URLEncoder.encode("COURSE_ID", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 관광 코스ID */
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
		System.out.println(sb.toString());

		JSONParser parser = new JSONParser();
		JSONObject jsonObject = (JSONObject) parser.parse(sb.toString());
		JSONObject json1 = (JSONObject) jsonObject.get("response");
		JSONObject json2 = (JSONObject) json1.get("body");
		JSONObject json3 = (JSONObject) json2.get("items");
		JSONArray array = (JSONArray) json3.get("item");

		for (int i = 0; i < array.size(); i++) {
			// e 배열에 담긴 item 1개를 데이터 값을 추출
			JSONObject arr = (JSONObject) array.get(i);
			String courseAreaId = (String) arr.get("courseAreaId");
			String courseAreaName = (String) arr.get("courseAreaName");
			System.out.println("courseAreaId" + courseAreaId);
			System.out.println("courseAreaName;" + courseAreaName);

			map.put("courseAreaId", courseAreaId);
			map.put("courseAreaName", courseAreaName);

		}

		map.put("dataList", sb.toString());
		map.put("array", array);
		return map;
	}

	// 공공데이터 출력 jsp
	@RequestMapping("/dataPage")
	public String DataPage() {

		return null;
	}

}
