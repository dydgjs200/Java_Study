package Generic;

import java.util.ArrayList;

public class GenericList<T> {
    public ArrayList<T> list = new ArrayList<T>();
    public GenericList(){
        // 생성자를 통해 T로 들어온 타입을 다시 명확하게 하기 위함.
        this.list = new ArrayList<>();
    }
    public void add(T element){         // list에 원소 추가
        list.add(element);
    }
    public T get(int index){
        return list.get(index);
    }
    public static void main(String[] args) {
        GenericList<String> list = new GenericList<>();
        list.add("GGGG");
        System.out.println(list.get(0));

        GenericList<Integer> list2 = new GenericList<>();
        list2.add(123);
        System.out.println(list2.get(0));
    }
}
