class Solution {
    public boolean isPalindrome(int x) {

        int original = x;
        int reversed_number = 0;

        if (x < 0) {
            return false;
        }

        while (x > 0) {

            int remainder = x % 10;

            reversed_number = reversed_number * 10 + remainder;

            x = x / 10;
        }

        if (reversed_number == original) {
            return true;
        } else {
            return false;
        }
    }
}
