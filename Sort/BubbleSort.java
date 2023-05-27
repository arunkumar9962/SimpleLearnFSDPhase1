package SortAlgorithm;

public class BubbleSort {
	
	  public static void main (String[] args) {

		    int [] arr = {4, 70, 45, 2, 25, 320, 5, 1, 23, 18};


		    System.out.print("Array before bubble sort: ");

		    for (int i = 0; i < arr.length; i++) {
		      System.out.print(arr[i] + " ");
		    }

		    bubbleSort(arr);

		    System.out.println();

		    System.out.print("Array after bubble sort: ");

		    for (int i = 0; i < arr.length; i++) {
		      System.out.print(arr[i] + " ");
		    }
		  }

		  private static void bubbleSort(int[] arr){

		    int length = arr.length;
		    int temp = 0;

		    for(int i = 0; i < length; i++){
		      for(int j = 1; j < (length - i); j++){
		        if(arr[j - 1] > arr[j]){
		          // swap the elements
		          temp = arr[j - 1];
		          arr[j - 1] = arr[j];
		          arr[j] = temp;
		        }
		      }
		    }



		  }

		}


