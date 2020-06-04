package Replit.Methods;

public class Stock {
    String tickerSymbol;
    String companyName;
    int price;
    double percentChange;
    int totalShares;
    long marketCap;

    public Stock(String tickerSymbol,String companyName,int price, int totalShares){
        this.tickerSymbol=tickerSymbol;
        this.companyName=companyName;
        this.price=price;
        this.totalShares=totalShares;
        this.marketCap=totalShares * price;
    }

    // DO NOT CHANGE THE METHOD BELOW
    public void adjustPrice(int value){
        int temp=price;
        price=price+(value);
        percentChange=((double)(price-temp))/temp;
        marketCap=totalShares*price;
    }
    public String toString(){
        return "Ticker Symbol: "+tickerSymbol+"\n Company: "+companyName
                +"\nCurrent Price: "+price+"\nMarket Cap: "+marketCap;
    }

}
