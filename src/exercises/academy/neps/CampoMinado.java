package exercises.academy.neps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CampoMinado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Integer> numbers = new ArrayList<>();
		Integer arr[] = new Integer[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			if (arr.length > 1) {
				if (i == 0) {
					if (arr[i] == 1) {
						count++;
						if (arr[i + 1] == 1) {
							count++;
						}
					} else {
						if (arr[i + 1] == 1) {
							count++;
						}
					}
				} else if (i == arr.length - 1) {
					if (arr[i] == 1) {
						count++;
						if (arr[i - 1] == 1) {
							count++;
						}
					} else {
						if (arr[i - 1] == 1) {
							count++;
						}
					}
				} else {

					if (arr[i] == 1) {
						count++;
						if (arr[i - 1] == 1) {
							count++;
						}
						if (arr[i + 1] == 1) {
							count++;
						}
					} else {
						int index = i - 1;
						if (arr[index] == 1) {
							count++;
						}
						if (arr[i + 1] == 1) {
							count++;
						}
					}
				}
			} else {
				if (arr[i] == 1) {
					count++;
				}
			}
			numbers.add(count);
		}
		numbers.stream().forEach(number -> System.out.println(number));
		sc.close();
	}
}
