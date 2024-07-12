package runner.demo;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String val = "aabbcdde";
        HashMap<String, Integer> count = new HashMap<>();
        for (String str : val.split("")) {
           if(count.containsKey(str)) {
               count.put(str, count.get(str) + 1);
           }else {
               count.put(str, 1);
           }
        }
        System.out.println(count);
    }
}