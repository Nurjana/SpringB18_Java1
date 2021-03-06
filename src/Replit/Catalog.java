package Replit;
import java.util.ArrayList;
import java.util.Arrays;

public class Catalog {





        public ArrayList<String> items = new ArrayList<>();
        public ArrayList<Double> prices = new ArrayList<>();
        public ArrayList<Double> monthlyPayments = new ArrayList<>();

        /**
         * This method adds all listed items to <items> arraylist
         * that is already declared above
         */
        public void loadItems() {
            //TODO
            items.addAll(Arrays.asList("iPhone 6s","iPhone 6s Plus","iPhone X","MacbookPro","ThumbDrive",
                    "Beats HeadPhones","Mouse","Charger","iPad","Dyson Vacuum","TV","Apple Watch"));
//            items.add("iPhone 6s");
//            items.add("iPhone 6s Plus");
//            items.add("iPhone X");
//            items.add("MacbookPro");
//            items.add("ThumbDrive");
//            items.add("Beats HeadPhones");
//            items.add("Mouse");
//            items.add("Charger");
//            items.add("iPad");
//            items.add("Dyson Vacuum");
//            items.add("TV");
//            items.add("Apple Watch");

      /*
        "iPhone 6s"
		"iPhone 6s Plus"
		"iPhone X"
		"MacbookPro"
		"ThumbDrive"
		"Beats HeadPhones"
		"Mouse"
		"Charger"
		"iPad"
		"Dyson Vacuum"
		"TV"
		"Apple Watch"
       */
        }
        /**
         * This method adds all listed prices to <prices> arraylist
         * that is already declared above
         */
        public void loadPrices() {
            //TODO
            prices.addAll(Arrays.asList(449.0,549.0,1149.0,1499.99,39.99, 349.99,79.99, 39.99,429.0, 399.0, 2199.0,559.0));
        }
        /**
         * This method adds all listed monthly payments to <monthlyPayments> arraylist
         * that is already declared above
         */

        public void loadMonthlyPayments() {
            //TODO
            monthlyPayments.addAll(Arrays.asList(18.71,22.88,56.16,79.49,2.68, 15.12,8.98,4.56, 18.31, 16.25, 89.49, 21.18));
		        }
        /**
         * This method will load whole catalog data - <items>,<prices>,<monthlyPayments>
         * Call loadItems(),loadPrices(),loadMonthlyPayments() that you created above
         */

        public void loadWholeCatalog() {
            //TODO
           loadItems();
           loadPrices();
           loadMonthlyPayments();

        }

        /**
         do not change the method below
         */
        public StringBuilder getWholeCatalog() {
            loadWholeCatalog();
            StringBuilder str = new StringBuilder();
            for (int i=0; i<items.size(); i++) {
                str.append(items.get(i)+"-"+prices.get(i)+ "-" +monthlyPayments.get(i)+"\n");
            }
            return str;
        }


        /**
         * write a method that an item name and returns all details for it. If item
         * is not in the list then returns null
         *  ex:
         * getItemDetails("ThumbDrive") -->ThumbDrive-39.99-2.68
         * getItemDetails("Charger") --> Charger-39.99-4.56
         * getItemDetails("Potato") --> null
         *
         * @param item
         * @return
         */

        public String getItemDetails(String item) {
            //LOAD WHOLE CATALOG HERE FIRST:

            //TODO:
        loadWholeCatalog();
            for (int i=0; i<items.size(); i++) {
                if (item.equalsIgnoreCase(items.get(i))) {
                    return items.get(i)+"-"+prices.get(i)+"-"+monthlyPayments.get(i);}}

            return null;
        }

        /*
         * write a method that accepts a price and returns a ArrayList<String> with
         * items with all detail that have less than or equal monthly payments
         *
         * getItemsLessThanAMonthlyPrice(5.99) --> ThumbDrive-39.99-2.68
         * 										  Charger-39.99-4.56
         * getItemsLessThanAMonthlyPrice(1.99) --> ""
         *
         * @param double price
         * @return ArrayList<String>
         */

        public ArrayList<String> getItemsLessThanAMonthlyPrice(double price) {
            //LOAD WHOLE CATALOG HERE FIRST
            loadWholeCatalog();
            //TODO
            ArrayList<String> list=new ArrayList<>();
            for (int j=0; j<monthlyPayments.size(); j++){
                if (price>=monthlyPayments.get(j)){
                  list.add(items.get(j)+"-"+prices.get(j)+"-"+monthlyPayments.get(j));
                }
            }

            return list;
        }

        /**
         * Method accepts a item name and updates total Price and monthly payments
         * for that item in <items>,<prices>,<monthlyPayments> arrayLists
         * When assigning monthlyPayments do =>  newPrice/12 <= to get monthly payments
         *
         * @param item name
         * @param newPrice
         */

        public void updatePrice(String item, double newPrice) {
            //LOAD WHOLE CATALOG HERE FIRST
            loadWholeCatalog();
            //TODO
            for (int i=0; i<items.size();i++){
                if(items.get(i).equals(item)){
                    prices.set(i,newPrice);
                    monthlyPayments.set(i,prices.get(i)/12);
                } } }

        /**
         * Method looks for an item in the catalog and removes
         * all details for that item including item name, price, monthlypayments
         *
         *
         * @param item
         */

        public void deleteItemFromCatalog(String item) {
            //LOAD WHOLE CATALOG HERE FIRST
                loadWholeCatalog();
            //TODO
            for (int n=0;n<items.size();n++){
                        if (item.equalsIgnoreCase(items.get(n))){
                            items.remove(n);
                            prices.remove(n);
                            monthlyPayments.remove(n);

                }
            }
        }


    }

/*
Catalog Project based on Catalog custom class.

Each instance ArrayList will contain relative product information.
items => all items
prices => prices for each item
monthlyPayments => monthly payments if you decide to finance

Each piece of information matches by index in ArrayLists.

index of "iPhone 6s Plus" is 1 in items ArrayList, to find its price I need to look at index 1 in prices and monthlyPayments ArrayLists.

Carefully Follow instructions on top/inside of each instance method and  and run the unit tests until you pass all of them.
 */