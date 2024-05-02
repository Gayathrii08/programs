class MaxArray {
  public static void main(String[] args) {
    int[] arr = {4, 2, 5, 3, 6};
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      max = Math.max(max, arr[i]);
}

    System.out.println("Maximum Value: " + max);
  }
}