package kr.or.bit.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class MyUtils {
private static JsonParser jsonParser = new JsonParser();
	
	public static JsonElement parseStringToJson(String strJson) {
		return jsonParser.parse(strJson);
	}
}
