package DP;

//Longest Common Subsequence
class LCSTraditional {
    public static void main(String[] args) {
        String s1 = "XYZABXCX";
        String s2 = "XA BCXXX";
        
        int counter = 0;
        int l = s1.length();
        for(int i = 0; i < l; i++)
        {
            System.out.println("For loop starting with i = " + i);
            char a = s1.charAt(i);
            System.out.println(a);
            int b = s2.indexOf(a);
            System.out.println(b);
            if(b != -1)
            {
                counter++;
                StringBuilder sb = new StringBuilder(s2);
                sb.deleteCharAt(b);
                s2 = sb.toString();
            } else {
                //do nothing
            }
            
            System.out.println("For loop ending \n" + "Value of s1 = " + s1);
            System.out.println("Value of s2 = " + s2);
        }
        
        System.out.println("Winner winner chicken dinner: " + counter);
    }
}