package day21_MultiDimensionalArrays;

public class LongestAndShortest {
    public static void main(String[] args) {
        String[] names = {"Nurjana", "Begimai", "Aijan", "Askat", "Dmitriiiy"};
        int maxLenghtString = names[0].length();
        int minLenghtSttring = names[0].length();
        String longestWord = "";
        String shortestWord = "";

            for (int i = 0; i < names.length; i++) {

                if (names[i].length() > maxLenghtString) {
                    maxLenghtString = names[i].length();
                    longestWord = names[i];
                }

                if (names[i].length() < minLenghtSttring) {
                    minLenghtSttring = names[i].length();
                    shortestWord = names[i];
                }
            }
            System.out.println("Longest word is: " + longestWord);
            System.out.println("Shortest word is : " + shortestWord);

        }
    }

