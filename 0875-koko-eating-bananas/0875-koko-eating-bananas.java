class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(pile, high);
        }
        while (low <= high) {
            long hours = 0;
            int mid = low + (high - low) / 2;
            for (int pile : piles) {
                hours += (pile / mid);
                if (pile % mid != 0)
                    hours += 1;
            }
            if (hours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}