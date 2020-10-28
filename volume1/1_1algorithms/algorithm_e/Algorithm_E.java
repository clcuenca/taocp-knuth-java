/// The Art of Computer Programming
/// Section 1.1 - Algorithm E
/// Author: Carlos L. Cuenca
/// Date: 10/22/20

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

/// --------------
/// Driver Program

public class Algorithm_E {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		inputCount = Integer.parseInt(reader.readLine());

		while(inputCount != 0) {

			// This is a multi-line input
			String line   = reader.readLine();
			int[] numbers = Arrays.stream(line.trim().split(" ")).mapToInt(Integer::parseInt).toArray();

			System.out.println(algorithm_E(numbers[0], numbers[1]));

			inputCount--;

		}

	}

	/// ------------------------
	/// Function Implementations

	public static int algorithm_E(int m, int n) {

		m = Math.abs(m);
		n = Math.abs(n);

		if(m < n) {

			int temp = n;
			n = m;
			m = temp;

		}

		int remainder = m % n;
		
		while(remainder != 0) {

			remainder = m % n;

			if(remainder == 0) break;

			m = n;
			n = remainder;

		}

		return n;

	}

}


