package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int n = o1.compareToIgnoreCase(o2);
		if (n > 0) {return -1;}
		if (n < 0) {return 1;}
		return 0;
	}
}
