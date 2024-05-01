public class Armstrong {
    public static void main(String[] args) {
        int low = 100;
        int high = 1000;

        System.out.println("Armstrong numbers between " + low + " and " + high + ":");
        for (int i = low; i <= high; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNum;
    }
}
