// 13021326
// e.szatmari@bbk.ac.uk

import java.io.*;
import java.util.*;

    public class Between {

            public static String between( int a, int b )
            {
                String odds = "";
               if (a < b) {
                   int c = a;
                   for (int i = 1; i < b - a; i++) {
                       c += 1;
                       if (c % 2 == 1) {
                           odds += c + " ";
                       }
                   }
               }
               else if (a > b){
                   int c = a;
                   for (int i =1; 0 < i & i < a-b; i++) {
                       c -= 1;
                       if (c % 2 == 1) {
                           odds += c + " ";
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
