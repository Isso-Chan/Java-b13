package PART_II_OOP.Day48_CollectionFactory;

import PART_II_OOP.Day46_collections_Part1.Product;

import java.util.*;

public class LoopMap {

	public static void main(String[] args) {
		
		Map<String, String> dataMap=new HashMap<>();
		
		dataMap.put("url", "qa3.vytrack");
		dataMap.put("username", "user66");
		dataMap.put("password", "abc66");
		dataMap.put("browser", "chrome");
		dataMap.put("truckdriver", "Bob");
		dataMap.put("storemanager", "John");
		
		//keySet -> returns set with all the keys in the map
		//values -> returns with all the values in the map
		
		System.out.println("++++++KEYS+++++++++++");
		for(String key : dataMap.keySet()) {
			//gives us all keys (soldakiler: url vs) 
			System.out.println(key);
		}
		System.out.println("++++++VALUES+++++++++++");
		for(String values : dataMap.values()) {
			//gives us all values (sağdakileri) 
			System.out.println(values);
		}
		
		System.out.println("+++++KEY  |  VALUES+++++");
		
		for(String key : dataMap.keySet()) {
			System.out.println(key+" | "+dataMap.get(key));
			/*3 satır yukarıdakinin çıktısında key'lerin 
			/*başında "key" yazıyor, ama burada key yazınca hata vermiyor!!*/
		}
		
		//Looping by using for each method()
		System.out.println("---------for each method()-------");
		dataMap.forEach((k,v)->System.out.println(k+" | "+v));
		
		Map<Integer, Product> studentMap=new HashMap<>();
		Map<String, String[]> data=new HashMap<>();
		Map<Integer, List<String>> data2=new HashMap<>();
		Map<Integer, List<String[]>> data3=new HashMap<>();
		Map<String, Map<Integer,Integer>> data4=new HashMap<>();
		Map<String, Map<Integer,Product>> data5=new HashMap<>();
		
		
		
		
	}

}
