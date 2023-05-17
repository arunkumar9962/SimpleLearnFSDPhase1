package LongestIncreasingSubsequence;

public class LongestIncreasingSubsequenceEg {

	public  static int getLongestSubSequence(int[] arr){
		int[] LIS = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			LIS[i] = 1;
		}
		
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[i]>arr[j] && LIS[i]<LIS[j]+1){
					LIS[i] = LIS[j]+1;
				}
			}
		}
		
		return LIS[arr.length-1];
	}

	public static void main(String[] args) {
		int[] arr = {12,15,25,14,38,54,42,72,85};
       
		int lengthArray = arr.length;
		
		System.out.println("Giver Array : ");
		
		for(int i = 0; i < lengthArray; i++) {
		System.out.println(arr[i] + "  ");
		
		}
		System.out.println();
		System.out.println("Given Array Size : " + lengthArray);
		System.out.println("Length of The Longest Increasing Subsequence is : " +  getLongestSubSequence(arr));
		
		
	}

}

