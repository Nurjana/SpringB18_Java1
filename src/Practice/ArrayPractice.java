package Practice;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
       // descending array
//        int arr[] ={3,-15,200,155,5,80};
//        int arrDesc[]=new int[arr.length];
//        Arrays.sort(arr);//[-15, 3, 5, 80, 155, 200]
//        System.out.println(Arrays.toString(arr));//
//
//        int k=0;
//        for (int i=arr.length-1;i>=0;i--){
//            arrDesc[k]=arr[i];
//            k++;
//        }
//        System.out.println(Arrays.toString(arrDesc));
//        System.out.println("==========================");
//
//        int []arr1={1,2,3};
//        int []arr2={4,5,6,7};
//        int[] newArr = new int[arr1.length + arr2.length];
//        int i = 0;
//        for(int each: arr1) {
//            newArr[i] = each;
//            i++;
//        }
//        for(int each: arr2) {
//            newArr[i] =each;
//            i++;
//        }
//        System.out.println(Arrays.toString(newArr));
//
//        System.out.println("==============================");



/*
 int[] nums = {1, 2, 3, 4, 5, 6, 7}, int k = 3. Output {4, 5, 6, 7, 1, 2, 3}. При решении задачи нельзя!!! использовать другой массив или коллекции.
2:22
int[] rotateArray(int[] nums, int k) {

	return nums;
}
 */
            int[] nums ={1,2,3,4,5,6,7};

            int n = 3;
            if (n>0){
            for(int m=n;m<nums.length;m++) {
               // for (int o=)

                nums[0]=nums[m++];


                    }System.out.println(Arrays.toString(nums));

            }



    }
}
