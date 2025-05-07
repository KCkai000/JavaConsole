package case05;

import java.util.List;
import java.util.stream.Collectors;

public class Partitioning {
	
	public static void main(String[]args) {
	List<Integer> scores = List.of(100, 50, 80, 60, 70);
	/* *
	 * "及格"：[100, 80, 70, 60]
	 * "不及格"：[50]	 * 
	 * */
	System.out.println(
	scores.stream()
		  .collect(Collectors.partitioningBy(score -> score >=60))
	);
	}
}
