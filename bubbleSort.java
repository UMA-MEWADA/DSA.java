package vscode.algo;
public class bubbleSort implements SortingAlgo {

    private void swap(int[] nums , int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    @Override
    public void sort(int[] nums) {

        for(int i = 0; i<nums.length -1 ; i++){
            for(int j = 0; j<nums.length - 1 - i; j++){
                if(nums[j] > nums[j+1]){
                    swap(nums, j , j+1);

                }
            }
            System.out.println("\n");
            printArray(nums);
        }
    }           
    public static void main(String[] args) {
        int[] nums = { 8 , 6 , 14 ,77 , 1 ,13};
        
        SortingAlgo sortingAlgo = new bubbleSort();
        sortingAlgo.sort(nums);
        System.out.println("sorted Array:");
        printArray(nums);
    }

    private static void  printArray(int[] nums){
        for(int num : nums){
            System.out.print(num + " ");
        }

}
}


