class arrayWorker {

  //sort an array in ascending order
  public int[] sort(int[] arr) {

  }

  //returns the index of target in arr if it exists,
  // returns -1 otherwise
  public int[] search(int[] arr, int target) {

  }

  public int centeredAverage(int[] nums) {
    boolean sorted = false;
    int placeholder;

    while (!sorted) {
      sorted = true;
      for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] > nums[i+1]) {
          sorted = false;
          placeholder = nums[i];
          nums[i] = nums[i+1];
          nums[i+1] = placeholder;
        }
      }
    }

    int total = 0;
    for (int i = 1; i < nums.length - 1; i++) {
      total += nums[i];
    }
    return total / (nums.length - 2);
  }

}
