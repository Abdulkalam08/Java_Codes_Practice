package main.trainings.CollectionFrameworks;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {
//        TreeMap<Character,Integer> tm = new TreeMap<>();
//        String str = "abdul kalam";
//        for(int i = 0;i<str.length();i++){
//            if((str.charAt(i) != ' ')){
//                if((tm.containsKey(str.charAt(i)))){
//                   int val =  tm.get(str.charAt(i));
//                   val++;
//                   tm.replace(str.charAt(i),val);
//                }
//                else{
//                    tm.put(str.charAt(i), 1);
//                }
//            }
//        }
//        System.out.println(tm);
        HashMap<Character,Integer> tm = new HashMap<>();
        String str = "abdul kalam";
        for(int i = 0;i<str.length();i++){
            if((str.charAt(i) != ' ')){
                if((tm.containsKey(str.charAt(i)))){
                    int val =  tm.get(str.charAt(i));
                    val++;
                    tm.replace(str.charAt(i),val);
                }
                else{
                    tm.put(str.charAt(i), 1);
                }
            }
        }
        //System.out.println(tm);
        LinkedHashMap <Integer,String> lhm = new LinkedHashMap<>(5,.75f,true);
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(4,"D");
        lhm.put(5,"E");
        String s = lhm.get(2);
        s=lhm.get(1);
        s=lhm.get(5);
        System.out.println(lhm);

        LinkedHashMap <Integer,String> lhm2 = new LinkedHashMap<>(5){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size()>5;
            }
        };
        lhm2.put(1,"A");
        lhm2.put(2,"B");
        lhm2.put(3,"C");
        lhm2.put(4,"D");
        lhm2.put(5,"E");
        String ss = lhm.get(2);
        ss=lhm.get(1);
        ss=lhm.get(5);
        lhm2.put(6,"V");
        System.out.println(lhm2);
    }
}