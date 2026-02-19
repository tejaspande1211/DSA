import java.util.*;

/*
Simpler two-class design:
- `ArrayProcessing` contains `main`.
- `ProcessorHelper` contains the processing function.

This keeps the code modular without full OO abstractions.
*/

class ProcessorHelper {
	// Compute output array based on the rules
	public static long[] computeOutput(int n, int interval, int[] I3, int[] I4) {
		long[] output = new long[n];
		for (int i = 0; i < n; i++) {
			if (I4[i] == 1) {
				output[i] = 1L * interval * (1 + I4[i]) * (i + 1);
			} else {
				output[i] = 0L;
			}
		}
		return output;
	}
}

public class ArrayProcessing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int interval = sc.nextInt();

		int[] I3 = new int[n];
		int[] I4 = new int[n];

		for (int i = 0; i < n; i++) {
			I3[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			I4[i] = sc.nextInt();
		}

		long[] result = ProcessorHelper.computeOutput(n, interval, I3, I4);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			if (i < result.length - 1) System.out.print(" ");
		}

		sc.close();
	}
}

