package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {
        Predicate<Integer> oddNum=x->x%2!=0;


        ArrayList <Integer > list=new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7));
        list.removeIf(oddNum);

        System.out.println(list);

        System.out.println("==========================");

        Predicate<Integer> less5=p-> p <= 5;

        ArrayList<Integer> list2= new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,4,5,6,5));
        list2.removeIf(less5);//removes if num is more than 5
        System.out.println(list2);

        System.out.println("============================");

        Predicate<String> startsWith=s->s.startsWith("b");
        Predicate<String> notStartA=n->n.startsWith("N");
        ArrayList<String> names =new ArrayList<>();
        names.addAll(Arrays.asList("Nurjana","Askat","Aylin", "Amir", "bombk"));
        names.removeIf(startsWith);
        System.out.println(names);

        names.removeIf(notStartA);
        System.out.println(names);
        System.out.println("===============================");


        Predicate<Character> digits=c->Character.isDigit(c);
        ArrayList<Character> listofChars= new ArrayList<>();

        listofChars.addAll(Arrays.asList('A','B','C','T','4','&','1','*'));
        listofChars.removeIf(digits);// removes all number characters from the list
        System.out.println(listofChars);


        System.out.println("================================");

        ArrayList<Integer> nums =new ArrayList<>(Arrays.asList(1,2,7,8,5,4,9,6,5,1,5));
        nums.removeIf(p->p>5);
        System.out.println(nums);


    }
}
