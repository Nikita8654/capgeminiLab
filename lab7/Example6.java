package lab7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Example6 {

	public List<String> VotersList(HashMap<String, Integer> voter) {
		ArrayList<String> list = new ArrayList<String>();
		voter.entrySet().forEach(entry -> {
			if (entry.getValue() > 18) {

				list.add(entry.getKey());
			}
		});
		return list;
	}

	public static void main(String[] args) {
		char exit = 'y';
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(isr);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		try {
			do {
				System.out.println("Enter the id of the person:");
				String id = b.readLine();
				System.out.println("Enter the age of the person:");
				int age = Integer.parseInt(b.readLine());
				People p = new People(id, age);
				hm.put(p.getID(), p.getAge());
				System.out.println("Do you want to add more students:(y/n)");
				exit = b.readLine().charAt(0);
			} while (exit != 'n');
			System.out.println(hm);
			Example6 obj = new Example6();
			List<String> list = obj.VotersList(hm);

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
