package com.core.practice.objectexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MyClass {
	
	private Integer flag = 10;
	
	public Integer add(Integer a,Integer b) {
		return a + b;
	}
	
	public Integer add(Integer a,Integer b,Integer c,Integer d) {
		return a + b + c + d;
	}
	
	public Integer sum(Integer... sree) {
		Integer result = 0;
		for(int i=0;i < sree.length ; i ++) {
			result = result + sree[i];
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		// way 1
		String value = (obj.flag != null ? (obj.flag).toString() : null);
		// way 2 
		String value1 = String.valueOf(obj.flag);
		// way 3
		String value2 = obj.flag + "";
		
		String num = "1234";
		Integer intNum = Integer.parseInt(num);
		System.out.println("num: "+ num + 1);
		System.out.println("intNum: "+ (intNum + 1));
		
		Long longNum = Long.parseLong(num);
		System.out.println("intNum: "+ (longNum + 1));
		
		Long valL = 1L;
		
		Double valD = 12.34;
		Integer intvalD = valD.intValue();
		System.out.println("intvalD: "+ (intvalD));
		
		
		Double valDb = 12.34;
		
		System.out.println("ceil:" +Math.ceil(valDb));
		System.out.println("floor:" +Math.floor(valDb));
		
		Integer x=2;
		Integer y=3;
		System.out.println("pow:" +Math.pow(x, y));

		Double intva = x.doubleValue();
		
		Map<Integer,String> hm = new HashMap<>();
		hm.put(1, "A");
		hm.put(2, "A");
		hm.put(3, "B");
		hm.put(3, "C");
		hm.put(null, "D");
		hm.put(null, "V");
		
		for (Entry<Integer,String> e:hm.entrySet()) {
			System.out.println("key: "+ e.getKey() + " Value: "+ e.getValue() );
			
		}
		
		
		
		System.out.println("add:"+obj.add(1, 2));
		
		System.out.println("sum:"+obj.sum(1,2,3,4,5,6,7,8));
		
	}
	
	

}
