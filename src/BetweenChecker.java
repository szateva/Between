import java.io.*;
import java.util.*;

public class BetweenChecker {
    public static void main( String[] args )    {
        String s = "";
        String snippet = "";

        String[] t = { "", "5", "5 7 9", "5", "9 7 5" };

        for( int i = 0; i < 5; i++ )
        {
            if( i == 0 ) {
                { s = Between.between( 3, 5 ); }
                snippet = "{ s = Between.between( 3, 5 ); }";
            }
            if( i == 1 ) {
                { s = Between.between( 3, 7 ); }
                snippet = "{ s = Between.between( 3, 7 ); }";
            }
            if( i == 2 ) {
                { s = Between.between( 3, 10 ); }
                snippet = "{ s = Between.between( 3, 10 ); }";
            }
            if( i == 3 ) {
                { s = Between.between( 7, 3 ); }
                snippet = "{ s = Between.between( 7, 3 ); }";
            }
            if( i == 4 ) {
                { s = Between.between( 10, 3 ); }
                snippet = "{ s = Between.between( 10, 3 ); }";
            }


            if( !s.equals( t[i]))
            {
                System.out.println( "---- On code snippet:" );
                System.out.println( snippet );
                System.out.println( "---- Expected value of String s:" );
                System.out.println( t[i] );
                System.out.println( "---- Actual value of String s:" );
                System.out.println( s );
                return;
            }
        }
        System.out.println( "Passed all tests." );

    }
}