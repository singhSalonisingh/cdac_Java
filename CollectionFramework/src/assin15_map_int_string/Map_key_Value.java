package assin15_map_int_string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_key_Value {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<>();
	map.put(10, "static");
	map.put(20, "default");
	map.put(30, "public");
	map.put(40, "private");
	map.put(50, "protected");
	map.put(60, "try");
	map.put(70, "catch");
	map.put(80, "finally");
	map.put(90, "throw");
	map.put(10, "throws");
	map.put(100, null);
	map.put(200, null);
	map.put(300, null);
	map.put(null, null);//
	map.put(null, "sj");//
	map.put(null, "sjjj");//it will print only 1 time
	System.out.println(map);
	System.out.println("value at null:"+map.get(20));
	
	//it will give exception NullPointerException
	/*Set<Integer> findkey=map.keySet();
	for(int n: findkey)
		System.out.println(n+":"+map.get(n));*/
	
	Set<Map.Entry<Integer, String>> _set= map.entrySet();
	for(Map.Entry<Integer, String>me:_set) {
		System.out.println(me.getKey()+":"+me.getValue());
	}
	
	
}
}
