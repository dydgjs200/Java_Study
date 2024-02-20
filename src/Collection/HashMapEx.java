package Collection;

import java.util.HashMap;
import java.util.Map;


// map = key, value로 구성된 entry 객체
// 동기화 된 메소드로 구성되어 있어 멀티 스레드가 동시에 hashTable 메소드를 실행할 수 없음.
// 멀티스레드 환경에서 안전하게 객체 추가

//map 종류로 properties 가 있는데, 그건 프로퍼티 읽을 때 사용.
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("DDDD", "DDDZz");
        map.put("DmmmmmDDD", "DnjnjDDZz");
        map.put("DDnknonDD", "DDDino Zz");
        map.put("DDnononbhbhbbibiDD", "DDDZz");


        for(Map.Entry<String, String> entry:map.entrySet()){
            System.out.println(entry);
        }
    }
}
