package Arrays;

class Pair {

	int min;
	int max;
}



public class MaxMinElementInArray{
	static Pair getMinMax(int arr[], int n)
	{
		Pair pair  = new Pair();
		int i;
		if(n%2==0) {
			if(arr[0]<arr[1]) {
				pair.min=arr[0];
				pair.max=arr[1];
			}
			else {
				pair.min=arr[1];
				pair.max=arr[0];
			}
			i=2;
		}
		else {
			pair.min=arr[0];
			pair.max=arr[0];
			i=1;
		}
		
		while(i<n-1) {
			if(arr[i]<arr[i+1]) {
				if(arr[i]<pair.min) {
					pair.min=arr[i];
				}
				if(arr[i+1]>pair.max) {
					pair.max=arr[i+1];
				}
			}
			else {
				if(arr[i]>pair.max) {
					pair.max=arr[i];
				}
				if(arr[i+1]<pair.min) {
					pair.min=arr[i+1];
				}
			}
			i+=2;
		}
		return pair;
	}
	public static void main(String args[]) {
		int arr[] = {-99,-7,-1,-6,-33};
		Pair pair = getMinMax(arr,arr.length);
		System.out.println("Minimum element :"+pair.min);
		System.out.println("Maximum element :"+pair.max);
	}
}


