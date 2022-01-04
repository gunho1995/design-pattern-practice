package etc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicInteger;

public class DictionaryEncoding {
    private AtomicInteger key;
    private Map<AtomicInteger, String> dictionary;
    private Map<String, AtomicInteger> reversed;

    public DictionaryEncoding(){
        dictionary = new HashMap<>();
        reversed = new HashMap<>();
    }

    public DictionaryEncoding(Map<AtomicInteger, String> dictionary){
        this.dictionary = dictionary;
        this.reversed = new HashMap<>();
    }

    AtomicInteger encode(String v){
        if(!reversed.containsKey(v)){
            reversed.put(v, key);
            dictionary.put(key, v);
            key.addAndGet(1);
            return key;
        } else
            return reversed.get(v);
    }

    List<AtomicInteger> encode(List<String> list){
        List<AtomicInteger> res = null;
        for(String str: list){
            res.add(encode(str));
        }
        return res;
    }

    String decode(AtomicInteger i){
        if(!dictionary.containsKey(i)){
            return null;
        } else
            return dictionary.get(i);
    }

    List<String> decode(List<AtomicInteger> list){
        List<String> res = null;
        for(AtomicInteger i : list){
            res.add(decode(i));
        }
        return res;
    }

    public static void main(String[] args) {
        DictionaryEncoding de = new DictionaryEncoding();
        System.out.println(de.encode("a"));
    }

}
