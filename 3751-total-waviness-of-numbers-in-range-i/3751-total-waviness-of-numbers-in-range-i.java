class Solution {
    public int check(int num) {
        String s = Integer.toString(num);
        int n = s.length();
        int cnt = 0;
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i - 1) < s.charAt(i) && s.charAt(i) > s.charAt(i + 1)
                    || s.charAt(i - 1) > s.charAt(i) && s.charAt(i) < s.charAt(i + 1))
                cnt++;
        }
        return cnt;
    }

    public int totalWaviness(int num1, int num2) {
        int cnt = 0;
        for (int i = num1; i <= num2; i++) {
            cnt += check(i);
        }
        return cnt;
    }
}