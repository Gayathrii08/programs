class SubArray {
    
    // Function to find all subarrays of an array
    public static void findSubArrays(int[] arr) {
        int n = arr.length;
        
        // Pick starting point
        for (int i = 0; i < n; i++) {
            // Pick ending point
            for (int j = i; j < n; j++) {
                // Print subarray between current starting
                // and ending points
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        findSubArrays(array);
    }
}