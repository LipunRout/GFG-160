class Solution {
    public int countTriangles(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length, ans = 0;

        for (int i = n - 1; i >= 2; i--) {
            int j = 0, k = i - 1;

            while (j < k) {
                int two = arr[j] + arr[k];
                if (two > arr[i]) {
                    ans += (k - j);
                    k--;
                } else {
                    j++;
                }
            }
        }

        return ans;
    }
}
