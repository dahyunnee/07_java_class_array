package step7_01.classArray;

import java.util.HashMap;


/*

# HashMap

- HashMap은 K(Key)에 V(Value)를 할당하는 방식으로 데이터가 저장된다.

*/

public class ClassArrayEx20 {

	public static void main(String[] args) {

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		// put(key, value) : HashMap에 데이터를 추가한다.
		// 순서 없음
		hmap.put("data1", 1000);
		hmap.put("data2", 2000);
		hmap.put("data3", 3000);
		
		// put() 메소드는 존재하지 않는 key를 넣어주면 데이터가 추가되고
		// 존재하는 key값을 넣어주면 데이터가 수정된다.
		hmap.put("data1", 10000);
		hmap.put("data2", 20000);
		System.out.println(hmap);
		System.out.println("====================================");
		
		// size() : Hashmap의 데이터 개수를 반환한다.
		System.out.println(hmap.size());
		
		// get(key) : Hashmap의 key에 해당하는 value를 얻어온다.
		System.out.println(hmap.get("data1"));
		System.out.println(hmap.get("data2"));
		System.out.println(hmap.get("data3"));
		System.out.println("====================================");
		
		// keySet() : Hashmap의 key만 얻어온다. 배열형태로 
		System.out.println(hmap.keySet());
		

		for (String key : hmap.keySet()) {
	
			System.out.println(hmap.get(key));
		}
		
		
		// remove(key) : HashMap의 key에 해당되는 값을 제거한다.
		hmap.remove("data1");
		hmap.remove("data2");
		System.out.println(hmap);
		System.out.println("====================================");

		
		// clear() : HashMap의 모든 값을 제거한다.
		hmap.clear();
		
	}

}
