//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int m = Integer.parseInt(S[0]);
            int n = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.squaresInMatrix(m,n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static long squaresInMatrix(int m, int n) {
        long total=0;
        // First method using loop
        /*while(m>0 && n>0)
        {
            total=total+(m*n);
        m--;
        n--;
        }
        return total;*/
        // Second method using formula.
        long x=Math.min(m,n);
        total =x*(x+1)*(2*x+1)/6 + Math.abs(m-n)*x*(x+1)/2;
        return total;
    }
};
