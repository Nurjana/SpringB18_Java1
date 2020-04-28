package Replit;

import java.util.Scanner;

public class OnlineBookMerchants_080 {
//    Instructions from your teacher:
//    Online Book Merchants offers premium customers 1 free book with every purchase of 5 or more
//    books and offers 2 free books with every purchase of 8 or more books.
//    It offers regular customers 1 free book with every purchase of 7 or more books,
//    and offers 2 free books with every purchase of 12 or more books.
//    Write a program that assigns freeBooks the appropriate value based on the values of the
//    boolean variable isPremiumCustomer and the int variable nbooksPurchased. Print amount of freeBooks into the console.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int freeBooks=0;

        System.out.println("Enter how many books purchased?");
        int booksPurchased=scan.nextInt();

        System.out.println("Are you Premium  Customer");
        boolean isPremium=scan.nextBoolean();

        if (booksPurchased>5){
            if(isPremium==true){
                freeBooks=1;
                System.out.println("You get 1 free book");
            }if(booksPurchased>8){
                freeBooks=2;
                System.out.println("You get 2 free books");
            }else if(booksPurchased>8) {
                freeBooks = 1;
                System.out.println("you get 1 free book");
                {
                    if (booksPurchased > 12) {
                        freeBooks = 2;
                        System.out.println("You get 2 free books");
                    }
                }
            }}}}


