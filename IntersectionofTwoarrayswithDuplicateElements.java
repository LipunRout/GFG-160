class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> mm = new HashMap<>();

        // Store elements of first array in the map
        for (int x : a) {
            mm.put(x, 1);
        }

        // Check elements of second array
        for (int x : b) {
            if (mm.get(x) != null && mm.get(x) != 0) {
                ans.add(x);
                mm.put(x, 0); // To avoid duplicates in the result
            }
        }

        return ans;
    }
}
