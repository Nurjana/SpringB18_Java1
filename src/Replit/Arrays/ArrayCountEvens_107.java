package Replit.Arrays;

import Replit.Replit;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ArrayCountEvens_107 {
    /*
    Instructions from your teacher:
Given an array nums, calculate count of even numbers in nums and print out to console.

nums → [2, 1, 2, 3, 4]) → 3
nums → [2, 2, 0, 3, 5]) → 3
nums → [1, 3, 5, 7, 9]) → 0
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: Write your code below

        int even = 0;
        for (int each : nums) {
            if (each % 2 == 0) {
                even++;


            }
        }System.out.println(even);
    }}