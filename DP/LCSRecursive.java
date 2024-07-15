package DP;

//Longest Common Subsequence
public class LCSRecursive {
    public static void main(String[] args) {
        String s1 = "XYZABXCX";
        String s2 = "XA BCXXX";

        int ans = calculateLCS(s1, s2, 0);
        System.out.println(ans);
    }

    public static int calculateLCS(String s1, String s2, int counter)
    {
        char a = s1.charAt(0);
        int b = s2.indexOf(a);
        if (b != -1) {
            counter++;
        }
        
        if (s1.length() > 1) {
            return calculateLCS(s1.substring(1), s2, counter);
        } else
        {
            return counter;
        }
        
    }
}
