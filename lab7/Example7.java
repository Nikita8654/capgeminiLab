package lab7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example7 {

	public List<Integer> getSorted(int a[]) {
		ArrayList<Integer> arraylist = null;
		for (int i = 0; i < a.length; i++) {
			String value = String.valueOf(a[i]);
			String valueReverse = new StringBuilder(value).reverse().toString();
			a[i] = Integer.parseInt(valueReverse);
			List<Integer> list = IntStream.of(a).boxed().collect(Collectors.toList());
			arraylist = new ArrayList<>(list);
			Collections.sort(arraylist);

		}
		return arraylist;
	}

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(isr);
		Example7 obj = new Example7();
		System.out.println("Enter the length of the array:");
		try {
			int length = Integer.parseInt(b.readLine());
			int a[] = new int[length];
			System.out.println("Enter the elements:");
			for (int i = 0; i < length; i++) {
				a[i] = Integer.parseInt(b.readLine());
			}

			System.out.println(obj.getSorted(a));
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
