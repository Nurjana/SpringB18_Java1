package day53_Iterator_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterating_Collection {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(11,22,4,5,3,2,8,6,4,2,2,1,18));
        //remove all numbers that are smaller than 4
        // old lood way

        for (int i=0; i<list.size();i++){
            if (list.get(i)<4){
                list.remove(i);
            }
        }
        System.out.println(list);//[11, 22, 4, 5, 2, 8, 6, 4, 2, 18] not accurate removal

        //without the itirator, there is no other way to remove all desired from the collections

        System.out.println("=================================================");

    ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(11,22,4,5,3,2,8,6,4,2,2,1,18));
    list2.removeIf(p -> p<4);// removeIf is using Iterator internally/lambda
        System.out.println(list2);//[11, 22, 4, 5, 8, 6, 4, 18]

        System.out.println("====================================");

    ArrayList<Integer> list3= new ArrayList<>(Arrays.asList(11,22,4,5,3,2,8,6,4,2,2,1,18)) ;
    Iterator<Integer> iteratorlist =list3.iterator();


       // System.out.println(iteratorlist.hasNext()); true
       // System.out.println(iteratorlist.next());//only works if hasNext is true

        while (iteratorlist.hasNext()){// only while loop can accept boolean
           if (iteratorlist.next()<4){
               iteratorlist.remove();
           }
        }
        System.out.println(list3                                                                                  );
        System.out.println("==========================");

        ArrayList<Integer> list4= new ArrayList<>(Arrays.asList(11,22,4,5,3,2,8,6,4,2,2,1,18));

        for (Iterator<Integer> I=list4.iterator(); I.hasNext();){// we don't have to use itirator i++, since hasNext() is playing ssame role
            int num =I.next();
            if (num<4){
                I.remove();
            }
        }
        System.out.println(list4);

    }
}
