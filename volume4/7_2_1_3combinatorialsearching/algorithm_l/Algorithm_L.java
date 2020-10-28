/// The Art of Computer Programming
/// Section 1.1 - Algorithm L
/// Author: Carlos L. Cuenca
/// Date: 10/28/20

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

/// --------------
/// Driver Program

public class Algorithm_L {

	public static void main(String[] args) throws IOException {

		/// -----------------
		/// Program Variables

		int inputCount;

		/// -------------
		/// Program Start

		int number = 6;

		for(int choose = 0; choose < number; choose++) {

			algorithm_L(number, choose);

		}

	}

	/// ------------------------
	/// Function Implementations

	public static void algorithm_L(int n, int choose) {

		if(n < choose) return;

		int[] combinations = new int[choose + 2];

		for(int j = 0; j < choose; j++)
			combinations[j] = j;

		combinations[choose] = n;
		combinations[choose + 1] = 0;

		int j = 0;

		while(j < choose) {

			// Visit the combination
			for(int index = 0; index < choose; index++) {

				System.out.print(Integer.toString(combinations[index]) + " ");

			}

			System.out.println();

			j = 0;

			while(combinations[j] + 1 == combinations[j + 1]) {

				combinations[j] = j;

				j++;

			}

			combinations[j]++;

		}
	
	}
}


