import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int s,i;
        for(i=1;i<=10;i++)
        {
            s=n*i;
            System.out.println(n + " x " +i+" = "+s);
        }

        scanner.close();
    }
}
