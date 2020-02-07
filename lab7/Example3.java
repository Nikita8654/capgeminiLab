package lab7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Example3 {
	public HashMap<Integer, Long> getSquares(int numbers[]) {
		HashMap<Integer, Long> hm = new HashMap<Integer, Long>();
		for (int num : numbers) {
			hm.put(num, (long) Math.pow(num, 2));
		}
		return hm;
	}

	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(isr);
		try {

			System.out.println("Enter the length of the array:");
			int length = Integer.parseInt(b.readLine());
			int a[] = new int[length];
			System.out.println("Enter the elements:");
			for (int i = 0; i < length; i++) {
				a[i] = Integer.parseInt(b.readLine());
			}

			Example3 obj = new Example3();
			HashMap<Integer, Long> hashmapContent = obj.getSquares(a);
			System.out.println(Arrays.asList(hashmapContent));
			System.out.println();
			hashmapContent.entrySet().forEach(entry -> {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			});
			
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				isr.close();
				b.close();
			} catch (Exception e) {
			}
		}
	}

}
