package com.softserve.edu.HW10.ApplSetOp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/*-
 * Write parameterized methods union(Set set1, Set set2)
 * and intersect(Set set1, Set set2),
 *
 *  realizing the operations of union and intersection of two sets.
 *  Test the operation of these techniques on two pre-filled sets. 

 * 
 * @author ����
 *
 */

public class ApplSetOp {

	public Set<Integer> union(Set<Integer> set1, Set<Integer> set2) { // Object �� ����������.....

		Set<Integer> result = new HashSet<>(set1);
		// result = set1; �� �� ���� ������!!!!!!!!!!!!! result ,���� ���������� ��
		// set1;
		for (Integer current : set2) {
			if (!result.add(current))
				System.out.println("Dublicate detected: element " + current + " do not united!");
		}
		return result;

	}

	public Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {

		Set<Integer> resullt = new HashSet<>();
		/*-
				if (set1.size() <= set2.size()) {
					for (Integer current : set1) {
						if (set2.contains(current)) {
							result.add(current);
						}
					}
				} else {
					for (Integer current : set2) {
						if (set1.contains(current)) {
							result.add(current);
						}
		
					}
		
				}*/
		int elm = 0;
		if (set1.size() <= set2.size()) {
			for (Iterator<Integer> it = set1.iterator(); it.hasNext();) {
				elm = it.next();
				if (set2.contains(elm)) {
					resullt.add(elm);
				}
			}
		} else {
			for (Iterator<Integer> it = set2.iterator(); it.hasNext();) {
				elm = it.next();
				if (set1.contains(elm)) {
					resullt.add(elm);

				}
			}

		}
		return resullt;

	}

	public static void main(String[] args) {

		Set<Integer> st1 = new HashSet<>();
		Random rnd = new Random();
		for (int i = 0; i < 20; i++) {
			st1.add(rnd.nextInt(30));
		}
		System.out.println("Set1: " + st1 + "\nSize of Set1: " + st1.size());
		// System.out.println(x);
		Set<Integer> st2 = new HashSet<>();
		for (int i = 0; i < 20; i++) {
			st2.add(rnd.nextInt(30));
		}
		System.out.println("Set2: " + st2 + "\nSize of Set2: " + st2.size());
		System.out.println("------------------------------------------");
		Set<Integer> uni = new HashSet<>();
		ApplSetOp ins = new ApplSetOp(); // �� ��������� ������������ ������. �� ����� �� ������� ���� ������� static,????
		uni = ins.union(st1, st2);
		System.out.println("Result of union Set1 and Set2: " + uni + "\nSize of united set: " + uni.size());
		System.out.println("------------------------------------------");

		Set<Integer> intersec = new HashSet<>();

		intersec = ins.intersection(st1, st2);
		System.out.println(
				"Result of intersection Set1 and Set2: " + intersec + "\nSize of Intersection: " + intersec.size());
		System.out.println("------------------------------------------"); //���� �� ����������� �������???
	}

}
