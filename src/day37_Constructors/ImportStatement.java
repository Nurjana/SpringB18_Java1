package day37_Constructors;


import java.util.*; // imports all the classes from java util

/*
import static day37_Constructors.Data.staticVariable;
import static day37_Constructors.Data.staticMethod;
 */

import static day37_Constructors.Data.*;

    public class ImportStatement {

        // import java.util.Arrays; // only imports Arrays class from java util
        public static void main(String[] args) {
            int[] arr = {4,3,2,1};
            Arrays.sort(arr);

            System.out.println( staticVariable );

            staticMethod();

        }

    }
