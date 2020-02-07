package lab7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

public class Example4 {
	public HashMap<String, String> getStudent(HashMap<String, Integer> student) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		Set<String> set = student.keySet();
		for (String s : set) {
			Integer marks = student.get(s);
			if (marks >= 90)
				hashmap.put(s, "Gold");
			else if (marks >= 80 && marks < 90)
				hashmap.put(s, "Silver");
			else
				hashmap.put(s, "Bronze");

		}
		return hashmap;
	}

	public static void main(String[] args) {
		char exit = 'y';
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(isr);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		try {
			do {
				System.out.println("Enter the name of the student:");
				String name = b.readLine();
				System.out.println("Enter the age of the student:");
				int age = Integer.parseInt(b.readLine());
				System.out.println("Enter the registration no of the student:");
				String regNo = b.readLine();
				System.out.println("Enter the marks of the student:");
				int marks = Integer.parseInt(b.readLine());
				Student s1 = new Student(age, name, regNo, marks);
				hm.put(s1.getSTUDENT_REGISTRATION_NO(), s1.getMARKS());
				System.out.println("Do you want to add more students:(y/n)");
				exit = b.readLine().charAt(0);
			} while (exit != 'n');
			System.out.println(hm);
			Example4 obj = new Example4();
			HashMap<String, String> hashmapContent = obj.getStudent(hm);
			hashmapContent.forEach((e, k) -> {
				System.out.println(e + ":" + k);
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
