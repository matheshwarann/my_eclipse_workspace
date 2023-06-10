package com.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Practice {

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the operation");
		int n = scanner.nextInt();

		switch (n) {
		case 1:
			// fibonacci series
			int first = 0;
			int second = 1;
			int tot;
			System.out.println(first);
			System.out.println(second);
			for (int i = 2; i <= 10; i++) {
				tot = first + second;
				System.out.println(tot);
				first = second;
				second = tot;
			}
			break;

		case 2:
			// prime number
			System.out.println("Enter the number");
			int num = scanner.nextInt();
			for (int i = 2; i <= num; i++) {
				if (isPrime(i)) {
					System.out.println(i);
				}
			}
			break;

		case 3:
			// String palindrome
			System.out.println("Enter the word");
			String name = scanner.next();
			char ch[] = name.toCharArray();
			String rev = "";
			for (int i = ch.length - 1; i >= 0; i--) {
				rev += ch[i];
			}
			if (rev.equals(name)) {
				System.out.println("It is palindrome");
			} else {
				System.out.println("Nope");
			}
			break;

		case 4:
			// Integer palindrome
			int r, sum = 0;
			int number = scanner.nextInt();

			int temp = number;
			while (number != 0) {
				r = number % 10;
				number = number / 10;
				sum = (sum * 10) + r;
			}
			if (temp == sum) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Nope");
			}
			break;

		case 5:
			// reverse string
			System.out.println("Enter the word");
			String type = scanner.next();
			String dummy = "";
			char[] ch1 = type.toCharArray();
			for (int i = ch1.length - 1; i >= 0; i--) {
				dummy += ch1[i];
			}
			System.out.println(dummy);
			break;

		case 6:
			// factorial
			int fact = 1;
			for (int i = 1; i <= 5; i++) {
				fact = fact * i;
			}
			System.out.println(fact);
			break;

		case 7:
			// sequence of missing numbers
			System.out.println("Enter the size");
			int size = scanner.nextInt();
			int[] missing = new int[size];
			System.out.println("Enter the arrays");
			for (int i = 0; i < missing.length; i++) {
				missing[i] = scanner.nextInt();
			}
			System.out.println("Enter the started number from Array");
			int z = scanner.nextInt();
			String store = "";
			for (int i = 0; i < missing.length; i++) {
				if (missing[i] != z) {
					store += z + " ";
					i = i - 1;
				}
				z++;
			}
			System.out.println(store);
			break;

		case 8:
			// seperate unique numbers
			List<Integer> list = Arrays.asList(10, 23, 45, 10, 45, 89, 23, 52, 41, 63, 45);
			Set<Integer> set = new HashSet<>();
			list.stream().filter(p -> !set.add(p)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));
			break;

		case 9:
			// count of odd numbers * sum of odd numbers
			int count = 0;
			for (int i = 1; i <= 10; i = i + 2) {
				count = count + i;
			}
			System.out.println(count);
			break;

		case 10:
			// missing letters
			char[] dup = { 'b', 'c', 'f', 'i', 'j' };
			char c = 97;
			String str = "";
			for (int i = 0; i < dup.length; i++) {
				if (dup[i] != c) {
					str += c + " ";
					i = i - 1;
				}
				c++;
			}
			System.out.println(str);
			break;

		case 11:
			// reverse number
			int rev1 = 0, rem;
			int nums = 12328;
			while (nums != 0) {
				rem = nums % 10;
				nums = nums / 10;
				rev1 = (rev1 * 10) + rem;
			}
			System.out.println(rev1);
			break;

		case 12:
			// sorting by Ascending
			System.out.println("Enter the size");
			int s = scanner.nextInt();
			int dum = 0;
			System.out.println("Enter the arrays");
			int[] sort = new int[s];
			for (int i = 0; i < sort.length; i++) {
				sort[i] = scanner.nextInt();
			}
			for (int i = 0; i < sort.length; i++) {
				for (int j = i + 1; j < sort.length; j++) {
					if (sort[i] > sort[j]) {
						dum = sort[i];
						sort[i] = sort[j];
						sort[j] = dum;
					}
				}
				System.out.print(sort[i] + " ");
			}
			break;

		case 13:
			// sorting by Descending
			int[] sorts = { 56, 40, 38, 89, 74, 21, 99, 12, 36 };
			int dumm = 0;
			for (int i = 0; i < sorts.length; i++) {
				for (int j = i + 1; j < sorts.length; j++) {
					if (sorts[i] < sorts[j]) {
						dumm = sorts[i];
						sorts[i] = sorts[j];
						sorts[j] = dumm;
					}
				}
				System.out.println(sorts[i]);
			}
			break;

		case 14:
			// first and second largest
			System.out.println("Enter the size");
			int si = scanner.nextInt();
			int[] find = new int[si];
			System.out.println("Enter the arrays");
			for (int i = 0; i < find.length; i++) {
				find[i] = scanner.nextInt();
			}
			int sec = 0;
			int lar = 0;
			for (int i = 0; i < find.length; i++) {
				for (int j = i + 1; j < find.length; j++) {
					if (find[i] < find[j]) {
						sec = find[i];
						find[i] = find[j];
						find[j] = sec;
					}
				}
				sec = find[0];
				lar = find[0];
			}
			System.out.println(sec);
			break;

		case 15:
			// Array of even numbers
			System.out.println("Enter the size");
			int fixed = scanner.nextInt();
			int[] eve = new int[fixed / 2];
			int k = 0;
			for (int i = 0; i < fixed; i = i + 2) {
				eve[k] = i;
				k++;
			}
			for (int i : eve) {
				System.out.println(i);
			}
			break;

		case 16:
			// Duplicate Integers
			int[] numeric = { 4, 5, 9, 1, 5, 3, 8, 3, 6, 1 };
			String copy = "";
			for (int i = 0; i < numeric.length; i++) {
				for (int j = i + 1; j < numeric.length; j++) {
					if (numeric[i] == numeric[j]) {
						copy += numeric[i] + " ";
					}
				}
			}
			System.out.println(copy);
			break;

		case 17:
			// Duplicate String
			String[] xerox = { "mat", "vic", "kab", "puli", "mat", "puli" };
			String cop = "";
			for (int i = 0; i < xerox.length; i++) {
				for (int j = i + 1; j < xerox.length; j++) {
					if (xerox[i].equals(xerox[j])) {
						cop += xerox[i] + " ";
					}
				}
			}
			System.out.println(cop);
			break;

		case 18:
			// Remove the dup String
			LinkedHashSet<String> list1 = new LinkedHashSet<>();
			list1.add("mat");
			list1.add("sha");
			list1.add("kab");
			list1.add("sub");
			list1.add("puli");
			list1.add("kab");

			for (String string : list1) {
				System.out.println(string);
			}
			break;

		case 19:
			// Arrange in alpha order
			TreeSet<Integer> sets = new TreeSet<>();
			/*
			 * sets.add("mat"); sets.add("sha"); sets.add("kab"); sets.add("sub");
			 * sets.add("puli"); sets.add("kab");
			 */

			sets.add(8);
			sets.add(4);
			sets.add(9);
			sets.add(5);

			for (Integer string : sets) {
				System.out.println(string);
			}
			break;

		case 20:
			HashMap<Integer, String> map = new HashMap<>();
			map.put(1, "mat");
			map.put(2, "vic");
			map.put(3, "sha");

			for (Entry<Integer, String> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
			break;

		case 21:
			// reverse sentence each word
			System.out.println("Enter the words");
			scanner.nextLine();
			String name1 = scanner.nextLine();
			String[] split = name1.split(" ");
			String revName = "";
			for (int i = 0; i < split.length; i++) {
				for (int j = split[i].length() - 1; j >= 0; j--) {
					revName += split[i].charAt(j);
				}
				revName += " ";
			}
			System.out.println(revName);
			break;

		case 22:
			// Reverse String using While Loop
			System.out.println("Enter the String");
			String word1 = scanner.next();
			String dummy1 = "";
			char[] ch2 = word1.toCharArray();
			int i = ch2.length - 1;
			while (i >= 0) {
				dummy1 += ch2[i];
				i--;
			}
			System.out.println(dummy1);
			break;

		case 23:
			// Word count
			System.out.println("Enter the words");
			scanner.nextLine();
			String wor = scanner.nextLine();
			String[] sp = wor.split(" ");
			int a = 1;
			for (int j = 0; j < sp.length; j++) {
				for (int j2 = j + 1; j2 < sp.length; j2++) {
					if (sp[j].equals(sp[j2])) {
						a += 1;
						sp[j2] = "0";
					}
				}
				if (sp[j] != "0")
					System.out.println(sp[j] + " - " + a);
				a = 1;
			}
			break;

		case 24:
			// Alpha order
			System.out.println("Enter the array size");
			int q = scanner.nextInt();
			String d;
			String[] arr = new String[q];
			System.out.println("Enter the names");
			for (int j = 0; j < q; j++) {
				arr[j] = scanner.next();
			}
			for (int j = 0; j < q; j++) {
				for (int j2 = j + 1; j2 < q; j2++) {
					if (arr[j].compareTo(arr[j2]) > 0) {
						d = arr[j];
						arr[j] = arr[j2];
						arr[j2] = d;
					}
				}
			}
			System.out.println("\nSorted names are");
			for (String string : arr) {
				System.out.println(string);
			}
			break;

		case 25:
			int[] nume = { 4, 5, 9, 1, 5, 3, 8, 3, 6, 1 };
			int u = 0;
			for (int j = 0; j < nume.length; j++) {
				u += j;
			}
			System.out.println(u);
			break;

		case 26:
			System.out.println("Enter the String");
			scanner.nextLine();
			String m = scanner.nextLine();
			char[] h = m.toCharArray();
			String str1 = "";
			for (int j = 0; j < h.length; j++) {
				if (h[j] >= 65 && h[j] <= 90 || h[j] >= 97 && h[j] <= 122) {
					str1 += h[j];
				}
			}
			System.out.println(str1);
		}

	}
}
