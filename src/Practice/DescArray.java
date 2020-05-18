package Practice;

import java.util.Arrays;

public class DescArray {
    public static void main(String[] args) {

    int num[]={789,65,321,45,3,5443,45};
    Arrays.sort(num);
    int [] descNum= new int[num.length];
    int k=0;
    for (int i=num.length-1;i>=0;i-- ){
        descNum[k]=num[i];
        k++;
    }
        System.out.println(Arrays.toString(descNum));
        System.out.println(Arrays.toString(num));

        System.out.println("===========");
        String name="Nurjana";
        char [] ch= name.toCharArray();
        System.out.println(Arrays.toString(ch));


        System.out.println("===================");

       /*
        Warmup tasks:1.  write a program that can find the maximum number
        from any given int arrayNOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS2.

         */
        int num2 []= {456,546,45,456,43,4,5,};
        Arrays.sort(num2);
       // Arrays.toString(num2);

        System.out.println(num2[num2.length-1]);// will print out sorted numbers

        System.out.println(num2[0]);
        System.out.println("========================");
        /*

         write a program that can find the minimum number from any given int array
         NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE
         */


        /*
        warmup tasks:1.  write a program that can return the average number from an
        array of integersex:[1,2,3]average: 2[10, 15, 5, 6]average: 9[4, 5, 6, 7, 8, 10, 20, 30, 0]
        average: 102.

         */
        int [] num3={1,2,3,4,5,6,7,8,9};
        int length=num3.length;// this will print out number of indexes in the array
        int sum=0;
        for (int i=0; i<num3.length;i++){
            double eachNum=num3[i];// this will assign each num of the array to eachNum
            sum+=eachNum; //this will add every single num in the array to each other

        }

        System.out.println(sum);
        int average=sum/length;
        System.out.println(average);
        System.out.println("=========================");

//        write a program that can return the logest string of text from an array3.
//                write a program that can return the shortest string of text from an array

        String str[]={"Nurjana","Askat","Klara","Bakytbek","Begimai","Aijana","Dmitryi"};
        int MaxLength=str[0].length();// this will return the length of the first indes, Nurjana-7
        String longestWord=" ";
        for (int e=0;e<str.length-1;e++){
            if (str[e].length()>MaxLength){
                MaxLength=str[e].length();
                longestWord=str[e];
            }
        }
        System.out.println(longestWord);

    }


    }