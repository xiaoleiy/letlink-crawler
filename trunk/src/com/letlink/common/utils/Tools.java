package com.letlink.common.utils;

import java.util.Map;

public class Tools {
	
	public static boolean notEmpty(String str){
		return str == null ? false : (str.length() == 0 ? false : true);
	}
	
	public static String getParam(Map<String, String[]> params, String key){
		if(key == null || "".equals(key))
			return null;
		return params.get(key)[0];
	}
}
