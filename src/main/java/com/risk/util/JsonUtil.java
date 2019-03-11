package com.risk.util;

import java.io.InputStream;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//Referenced classes of package com.yst.m2.sdk.util:
//         IntegerTypeAdapter, DoubleTypeAdapter, LongTypeAdapter, DateTypeAdapter, 
//         InputStreamUtils

public class JsonUtil
{

 public JsonUtil()
 {
 }

 public static Gson get_gson()
 {
     return (new GsonBuilder()).disableHtmlEscaping().serializeNulls()
    		 /*.registerTypeAdapter(java/lang/Integer, new IntegerTypeAdapter())
    		 .registerTypeAdapter(java/lang/Double, new DoubleTypeAdapter())
    		 .registerTypeAdapter(java/lang/Long, new LongTypeAdapter())
    		 .registerTypeAdapter(java/util/Date, new DateTypeAdapter())*/.create();
	 //return new Gson();
 }
 
 public static String to_json(Object obj)
 {
     if(obj == null)
         return null;
     else
         return get_gson().toJson(obj);
 }
 
 public static Object json_2_bean(String json, Class obj_class)
 {
     return get_gson().fromJson(json, obj_class);
 }

 
}


/*
	DECOMPILATION REPORT

	Decompiled from: D:\repo\com\yst\m2_sdk\1.8.2\m2_sdk-1.8.2.jar
	Total time: 141 ms
	Jad reported messages/errors:
	Exit status: 0
	Caught exceptions:
*/
