package array;

import java.util.Arrays;
import java.util.Scanner;

public class reverse1_int {
	public static void main(String[] args) {

		int i;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the Size of Array: ");
		int tot = scan.nextInt();
		int[] arr = new int[tot];

		System.out.print("Enter " + tot + " Elements for the Array: ");
		Arrays.sort(arr);
		for (i = 0; i < tot; i++)
			arr[i] = scan.nextInt();

		System.out.println("\nReverse of Given Array is: ");
		for (i = (tot - 1); i >= 0; i--)
			System.out.print(arr[i] + " ");

	}
}
