import java.util.*;

public class PrimeSquare {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 46, 78, 88, 99, 100};
        List<Integer> ans = primesqrfind(arr);
        List<Integer> sqr = new ArrayList<>();
        for(int k: ans){
            int j = k*k;
            sqr.add(j);
        }for(Integer i:sqr){
            System.out.print(i+", ");
        }
    }

    public static List<Integer> primesqrfind(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isprime(arr[i])) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    public static boolean isprime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
