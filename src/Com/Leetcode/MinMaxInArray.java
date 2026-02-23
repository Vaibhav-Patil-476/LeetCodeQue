package Com.Leetcode;

public static void main(String[] args) {
		int[] arr = {2, 5, 6, 7, 10, 5, 24, 40};
		int minElement = arr[0];
		int maxElement = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(maxElement < arr[i])
			{
				maxElement = arr[i];
			}
			if(arr[i] < minElement)
			{
				minElement = arr[i];
			}
		}
		
		System.out.println("Minimum element in array is: " + minElement);
		System.out.println("Maximum element in array is: " + maxElement);

	}