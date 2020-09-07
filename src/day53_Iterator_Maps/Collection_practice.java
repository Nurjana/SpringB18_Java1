package day53_Iterator_Maps;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Collection_practice {
    // when creating method we give access -modifiers, specifiers, return type, method name(parameter)
    //specifier: static, final, abstract, synchronized

    public static void main(String[] args) {
        List<String> list =  new ArrayList(Arrays.asList(1,2,3,4,5));
        list=Collections.synchronizedList(list);// if I need to synchronize the "list",
        // I assign it as above, it is now thread safe
        System.out.println(list);


        Set<Integer> set =new HashSet<>();
        set=Collections.synchronizedSet(set);

        System.out.println("============================");

        String[] arr = {"E", "B", "A", "D", "D", "C", "A"};  //EBADC
        LinkedHashSet<String> st = new LinkedHashSet<>( Arrays.asList(arr) );
        System.out.println(st);

       /*
        for(String each: arr){
            st.add(each);
        }
        */

        ArrayList<String> arraylist = new ArrayList<>(Arrays.asList("E", "B", "A", "D", "D", "C", "A"));
        LinkedHashSet<String> st2 = new LinkedHashSet<>(arraylist);


        System.out.println(st2);

    }


    public synchronized void append(){

    }
}
