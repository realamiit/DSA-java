class Solution {
    public int reverse(int num) {
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;

            // Overflow check this is the game changer
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }
}