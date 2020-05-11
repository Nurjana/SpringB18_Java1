package Replit;

public class ProfitLoss_159 {
    /*
    c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"

for example:
c_profis(100,1500)
returns : "profit"

c_profis(20,5)
returns : "loss"

c_profis(100,100)
returns : "no loss"
     */
    public static void main(String[] args) {
        c_profits(100,1500);
    }

    public static String c_profits (int buyPrice,int sellPrice){
        //your code here
        String str="";
if (buyPrice<=sellPrice){
    str="profit";
}else if (buyPrice>=sellPrice){
    str= "loss";
}else {
    str= "no loss";
}
        return str;
    }

/*
 String result= (buyPrice<sellPrice)? "profit": (buyPrice>sellPrice)? "loss":"no loss";
         return result;
    }
 */



}
