// 13021326
// e.szatmari@bbk.ac.uk

import java.io.*;
import java.util.*;

    public class Between {

            public static String between( int a, int b )
            {
                String odds = "";
               if (a < b) {
                   int temp = a;
                   for (int i = 1; i < b - a; i++) {
                       temp += 1;
                       if (temp % 2 == 1) {
                           odds += temp + " ";
                       }
                   }
               }
               else if (a > b){
                   int temp = a;
                   for (int i =1; 0 < i & i < a-b; i++) {
                       temp -= 1;
                       if (temp % 2 == 1) {
                           odds += temp + " ";
                       }
                   }

               }
               if(odds.length() !=0) {odds = odds.substring(0, odds.length()-1);}
            return odds;
            }


        public static void main( String[] args )
        {

        }
    }
