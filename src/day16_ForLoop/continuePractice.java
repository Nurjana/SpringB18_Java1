package day16_ForLoop;

public class continuePractice {
    public static void main(String[] args) {
        for(char ch ='Z';ch>='A';ch--){
            if (ch=='N'||ch=='U'||ch=='R'||ch=='J'||ch=='A'){
                continue;
            }
            System.out.print(ch+" ");
        }
        System.out.println();

        for (int i=1;i<=100; i++){
           if(i%3==0||i%5==0){
               continue;
           }
            System.out.print(i+" ");
        }
    }
}
