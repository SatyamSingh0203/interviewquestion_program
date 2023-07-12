package interviewQuestionPractice;

public class MaxIntegerFromArray {
	public static void main(String[] args) {
		int arr[] = { 22, 11, 44, 33 };
		int maxInteger = Integer.MIN_VALUE; // initialized from smallest value
		int minInteger = Integer.MAX_VALUE; // initialized from biggest value
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxInteger) {
				maxInteger = arr[i];
			}
			else if (arr[i] < minInteger) {
			
				minInteger = arr[i];
			}
		}
		System.out.println("Max Integer is : " + maxInteger);
		System.out.println("Min Integer is : " + minInteger);
	}
}
