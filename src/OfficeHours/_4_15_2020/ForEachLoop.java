package OfficeHours._4_15_2020;

public class ForEachLoop {
      /*
    for each loop:
            for(DataType  variableName :  ArrayName ){
            }
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        for( int each : arr ){
            if(each ==3){
                //continue;
                break;
            }
            System.out.println(each);//will print all except for declared 3-> 1 2
        }

        System.out.println("=====================================");

        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};

        for(int  each : arr2 ){
            if(each % 2 == 0){
                System.out.println(each);
            }
        }







    }

}
