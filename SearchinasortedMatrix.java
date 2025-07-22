class Solution {
    // Function to search a given number in a row-wise sorted matrix
    public boolean searchMatrix(int[][] mat, int x) {
        int n = mat.length;
        int m = mat[0].length;

        int low = 0, high = n * m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int temp = mat[mid / m][mid % m];

            if (temp == x) {
                return true;
            } else if (temp < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
