package OfficeHours2.day2_StringAndLoops;

public class nTwice {
    public static void main(String[] args) {
        String str ="java cs java pro";
        System.out.println(str.replace("java","c#"));
        System.out.println(str.replaceAll("java","c#"));
    }


}

      /*
       Given a string, return a string where for every char in the original, there are two chars.

                doubleChar("The") → "TThhee"
        doubleChar("AAbb") → "AAAAbbbb"
        doubleChar("Hi-There") → "HHii--TThheerree"

        public String doubleChar(String str) {
            String word="";
            for(int i=0;i<str.length();i++){
                // word+= ""+str.charAt(i)+str.charAt(i);
                word+=str.substring(i,i+1)+str.substring(i,i+1);
            }
            return word;
        }

            }
        }

        */


