import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        if(n%2!=0)
        {
            System.out.println("Weird");
        }
        else
        {
            if(n>1 && n<6)
            {
                System.out.println("Not Weird");
            }

            else if(n>7 && n<21)
            {
                System.out.println("Weird");
            }

            else if(n>=20)
            {
                System.out.println("Not Weird");
            }
        }
    }
}
