/* This comes from hackerrank */
import java.io.*;
import java.util.*;

public class IPTest {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
        String str = sc.next();
        myRegex(str);   
        }
        
    }
    
    private static void myRegex(String str) {
        String octet = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String ip = octet + "\\." + octet + "\\." + octet + "\\." + octet;
        
        System.out.println(str.matches(ip));
    }
}
