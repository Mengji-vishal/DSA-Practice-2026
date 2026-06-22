class Solution {
    public boolean check(int arr[], int mid) {
        if (arr['b' - 'a'] >= mid && arr['a' - 'a'] >= mid && arr['l' - 'a']/2 >= mid
                && arr['o' - 'a']/2 >= mid && arr['n' - 'a'] >= mid) {
            return true;
        }else{
            return false;
        }
    }

    public int maxNumberOfBalloons(String text) {
        int arr[] = new int[26];
        for (int num : text.toCharArray()) {
            int index = num - 'a';
            arr[index]++;
        }
        int low = 0;
        int high = text.length();
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (check(arr, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}