class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);

        int ans = 0;

        for (int ele : arr1) {
            int idx = lowerBound(arr2, ele - d);

            if (idx == arr2.length || arr2[idx] > ele + d) {
                ans++;
            }
        }

        return ans;
    }

    int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < target) {
                // ans = mid;
               low=mid+1;
            } else {
              high=mid-1;
            }
        }

        return low;
    }
}