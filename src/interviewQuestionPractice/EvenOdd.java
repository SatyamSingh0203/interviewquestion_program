package interviewQuestionPractice;

import java.util.ArrayList;
import java.util.List;

public class EvenOdd {
	public static void main(String[] args) {
		List<Integer> list = List.of(11, 22, 33, 44, 55, 44,77,88,66,44);
		List<Integer> list1 = list.stream().filter(e -> e % 2 == 0).toList();
		System.out.println(list1);

		ArrayList<Integer> arrayList = new ArrayList<>();
		for (Integer i : list) {
			if (i % 2 == 0) {
				arrayList.add(i);
			}
		}
		System.out.println(arrayList);
		
		
		
		
	}

}
