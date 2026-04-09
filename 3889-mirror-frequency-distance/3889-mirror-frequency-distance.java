class Solution {
    public int mirrorFrequency(String s) {
        int arr[] = new int[26];
        int arr2[] = new int[10];
        for (int num : s.toCharArray()) {
            if (num >= 'a' && num <= 'z') {
                int index = num - 'a';
                arr[index]++;
            } else {
                int indexx = num - '0';
                arr2[indexx]++;
            }
        }
        int cnt = 0;
        for (int num : s.toCharArray()) {
            if (num >= 'a' && num <= 'z') {
                int index = num - 'a';
                int find = Math.abs('z' - num);
                cnt += Math.abs(arr[index] - arr[find]);
                arr[find] = 0;
                arr[index] = 0;
            } else {
                int indexx = num - '0';
                int findd = Math.abs('9' - num);
                cnt += Math.abs(arr2[indexx] - arr2[findd]);
                arr2[findd] = 0;
                arr2[indexx] = 0;
            }
        }
        return cnt;

    }
}