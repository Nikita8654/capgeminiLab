package lab7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example5 {
	public int getSecondSmallest(int a[]) {
		List<Integer> list = IntStream.of(a).boxed().collect(Collectors.toList());
		ArrayList<Integer> arraylist = new ArrayList<>(list);
		Collections.sort(arraylist);
		return (int) arraylist.get(1);
		
	}

	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(isr);
		System.out.println("Enter the length of the array:");
		try {
			int length = Integer.parseInt(b.readLine());
			int a[] = new int[length];
			for (int i = 0; i < length; i++) {
				a[i] = Integer.parseInt(b.readLine());
			}
			Example5 obj = new Example5();
			System.out.println(obj.getSecondSmallest(a));
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
