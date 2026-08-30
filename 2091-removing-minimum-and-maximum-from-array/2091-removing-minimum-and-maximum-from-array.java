class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n == 1 || n == 2)
            return n;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        if(n%2!=0){
            for (int i = 0; i < n; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        int left = 0;
        int right = 0;
        int c = 0;
        for (int i = 0; i < n / 2; i++) {
            if (max == nums[i]) {
                left = i + 1;
                c++;
            } else if (min == nums[i]) {
                left = i + 1;
                c++;
            }
        }
        if (c == 2) {
            return left;
        }
        c = 0;
        for (int i = n - 1; i >= n / 2; i--) {
            if (max == nums[i]) {
                right = n - i;
                c++;
            } else if (min == nums[i]) {
                right = n - i;
                c++;
            }
        }
        if (c == 2) {
            return right;
        }
        int both=left+right;
        int leftSide=(n/2)+(n/2-right+2);
        int rightSide=n/2+1+(n/2-left+1);
        return both>leftSide?(leftSide>rightSide?rightSide:leftSide):(both>rightSide?rightSide:both);
        }
        for (int i = 0; i < n; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        int left = 0;
        int right = 0;
        int c = 0;
        for (int i = 0; i < n / 2; i++) {
            if (max == nums[i]) {
                left = i + 1;
                c++;
            } else if (min == nums[i]) {
                left = i + 1;
                c++;
            }
        }
        if (c == 2) {
            return left;
        }
        c = 0;
        for (int i = n - 1; i >= n / 2; i--) {
            if (max == nums[i]) {
                right = n - i;
                c++;
            } else if (min == nums[i]) {
                right = n - i;
                c++;
            }
        }
        if (c == 2) {
            return right;
        }
        int both=left+right;
        int leftSide=(n/2)+(n/2-right+1);
        int rightSide=n/2+(n/2-left+1);
        return both>leftSide?(leftSide>rightSide?rightSide:leftSide):(both>rightSide?rightSide:both);
    }
}