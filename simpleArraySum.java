import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int arCount = in.nextInt();
       int sum = 0;
       for (int i = 0; i < arCount; i++) {
           sum += in.nextInt();
       }
       System.out.println(sum);
    }
}
