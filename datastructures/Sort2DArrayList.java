import java.util.*;
import java.util.stream.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(4);
		
		sort(list).forEach(el -> {
		    System.out.println(el.toString());
		});
	}
	
	public static List<List<Integer>> sort(List<Integer> array) { 
	    HashMap<Integer, Integer> map = new HashMap<>();
	    List<List<Integer>> result = new ArrayList<>();
	    
        array.forEach(num -> {
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        });
        
       Map <Integer,Integer> sorted =
        map.entrySet().stream()
           .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
           .collect(Collectors.toMap(
            Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        sorted.forEach((el, val) ->{
            List<Integer> res = new ArrayList<>();
            res.add(el);
            res.add(val);
            result.add(res);
        });

        return result;
	}
}
