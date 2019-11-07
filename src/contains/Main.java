package contains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2つリストがあり、どちらか一方が特定の値をそれぞれのリストに含んでいれば良いとき
		List<String> firstList = new ArrayList<String>(Arrays.asList("Apple", "Orange", "Melon"));
		List<String> secondList = new ArrayList<String>(Arrays.asList("Pain", "Grape", "Lemon"));
		
		// どちらも当てはまらないときtrue.どちらか当てはまればfalse.どちらも当てはまればfalse
		if (!(!firstList.contains("Donkey")) || secondList.contains("Banana")) {
			System.out.println("当てはまらんで");
		} else {
			System.out.println("当てはまる");
		}
		
	}

}
