package hillel.tolist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static <V> List <V> toList(V [] arr){
        List <V> list = new ArrayList<>();
        for(V i : arr){
            list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        String [] arr = {"Slava","Roma","Andrew","Ira","John"};
        for (int i =0; i< arr.length; i++)
        System.out.print(" "+ arr[i]);

        System.out.println();

        List<String> list = toList(arr);
        System.out.println(list);







    }
}
