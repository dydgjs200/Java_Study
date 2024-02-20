package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();

        list.add(new Book("제목" , "지은이"));
        list.add(new Book("제목2" , "지은이2"));
        list.add(new Book("제목3" , "지은이3"));
        list.add(new Book("제목4" , "지은이4"));

        System.out.println("list size : " + list.size());
        System.out.println("list get(0) : " + list.get(0));
        System.out.println("list remove : " + list.remove(0));

        for(Book b : list){
            System.out.println("객체  : " + b) ;
        }

    }


}
