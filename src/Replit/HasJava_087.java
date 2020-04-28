package Replit;
import java.util.Scanner;
public class HasJava_087 {

        public static void main(String[] args) {
            boolean exists = false;
            Scanner scan = new Scanner(System.in);
            String word = scan.next();

            if(word.indexOf("java")==0||word.indexOf("java")==1){
                exists=true;
                System.out.println(exists);

            }else{
                System.out.println("false");
            }
        }
    }
