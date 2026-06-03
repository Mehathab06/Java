package Collections;

import java.util.HashMap;
import java.util.Map;

public class Example2OnMap {
    public static void main(String[] args){
        String sentence = "java is easy java is powerful";

        String[] words = sentence.split(" ");

        Map<String,Integer> map = new HashMap<>();
        for(String word : words){
            if(map.containsKey(word)){
                map.put(word,map.get(word) + 1);
            }
            else{
                map.put(word, 1);
            }
        }

        System.out.println(map);
    }
}
