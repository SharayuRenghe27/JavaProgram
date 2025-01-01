package Task.Nov.map_collection_framework;

import java.util.HashMap;
import java.util.Map;

public class mapex2 {
    public static void main(String[] args) {
//        HashMap<String,Integer> map1=new HashMap<String,Integer>();--> old method
//        HashMap<String,Integer> map1=new HashMap<>();
        HashMap<String,Integer> map=new HashMap();
        map.put("id",123);
        map.put("id",222);
        map.put("id2",9090);
        map.put("id3",3344);
        map.put("id6",0001);
        map.put("id4",null);
        map.put("id5",null);
        map.put(null,102);
        map.put(null,103);//double null not allowed

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));


        System.out.println(map.keySet());//headers
        System.out.println(map.values());//values

        System.out.println(map.get("id3"));

        for(Map.Entry<String,Integer> iteam:map.entrySet()){
            System.out.println(iteam.getKey()+"->"+iteam.getValue());
        }

    }
}
