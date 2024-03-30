class Solution {
    public boolean isPalindrome(int x)

    {
        if (x < 0)
            return false;
        int rev = 0;
        int org = x;

        while (x != 0) {

            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return org == rev;

    }

    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        Solution s = new Solution();
        if (s.isPalindrome(j)) {

            System.out.print("true");
        } else {
            System.out.print("false");
        }

    }

}
