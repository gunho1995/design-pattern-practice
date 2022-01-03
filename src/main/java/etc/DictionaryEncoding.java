package etc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryEncoding {
    private Integer key;
    private Map<Integer, String> dictionary;
    private Map<String, Integer> reversed;

    public DictionaryEncoding(){
        dictionary = new HashMap<>();
        reversed = new HashMap<>();
    }

    public DictionaryEncoding(Map<Integer, String> dictionary){
        this.dictionary = dictionary;
        this.reversed = new HashMap<>();
    }

    Integer encode(String v){
        if(!reversed.containsKey(v)){
            reversed.put(v, key);
            dictionary.put(key, v);
            key += 1;
            return key;
        } else
            return reversed.get(v);
    }

    List<Integer> encode(List<String> list){
        List<Integer> res = null;
        for(String str: list){
            res.add(encode(str));
        }
        return res;
    }

    String decode(Integer i){
        if(!dictionary.containsKey(i)){
            return null;
        } else
            return dictionary.get(i);
    }

    List<String> decode(List<Integer> list){
        List<String> res = null;
        for(Integer i : list){
            res.add(decode(i));
        }
        return res;
    }

    public static void main(String[] args) {
        DictionaryEncoding de = new DictionaryEncoding();
        System.out.println(de.encode("a"));
    }

}
