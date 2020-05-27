package Replit.Arrays;

public class nestedLoop {
    public static void main(String[] args) {
        for (int j=0; j<2; j++){

            for (int k=0; k<10;k++){
                System.out.print(j+"j"+" "+k+"k");
                if (k==5){
                    break;
                }
            }
        }
} }
/*
 int[] nums = {1, 2, 3, 4, 5, 6, 7}, int k = 3. Output {4, 5, 6, 7, 1, 2, 3}. При решении задачи нельзя!!! использовать другой массив или коллекции.
2:22
int[] rotateArray(int[] nums, int k) {

	return nums;
}
 */