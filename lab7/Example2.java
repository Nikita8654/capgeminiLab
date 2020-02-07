package lab7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Example2 {
	public HashMap<Character, Integer> countCharacter(char[] ch) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (hm.containsKey(c))
				hm.put(c, hm.get(c) + 1);

			else
				hm.put(c, 1);
		}
		return hm;
	}

	public static void main(String[] args) {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(isr);
		try {
			String str = b.readLine();
			Example2 obj = new Example2();
			HashMap<Character, Integer> hashmapContent = obj.countCharacter(str.toCharArray());
			// System.out.println(c.get('p'));
			hashmapContent.entrySet().forEach(entry -> {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			});
			System.out.println();
			hashmapContent.forEach((e, k) -> {
				System.out.println(e + ":" + k);
			});
			System.out.println();
			System.out.println(Arrays.asList(hashmapContent));
			System.out.println();
			for (Character key : hashmapContent.keySet()) {
				System.out.println(key + ":" + hashmapContent.get(key));
			}
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
