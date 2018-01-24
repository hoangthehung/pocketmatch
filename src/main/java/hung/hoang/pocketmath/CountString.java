/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung.hoang.pocketmath;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author hoanghung
 */
public class CountString {
    public Map<String, Integer> printOrderString(String[] input){
        
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (String s: input){
            if(result.containsKey(s))
                result.put(s, result.get(s)+1);
            else
                result.put(s, 1);
        }
        result = result.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        return result;
    }
}
