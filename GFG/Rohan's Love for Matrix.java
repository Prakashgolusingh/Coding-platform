//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.firstElement(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static int firstElement(int n) 
    {
        long a=0l;
        long b=1l;
        for(int i=2;i<=n;i++)
        {
            long c=(a+b)%1000000007;
            a=b;
            b=c;
        }
        return (int)b;
    }
}

