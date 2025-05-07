package case05;

import java.util.List;
import java.util.Map;


import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;


public class Grouping2 {

	public static void main(String[] args) {
		List<Map<String, String>> students = List.of(
				Map.of("gender", "男", "score", "A"),
				Map.of("gender", "男", "score", "B"),
				Map.of("gender", "女", "score", "C"),
				Map.of("gender", "女", "score", "B"),
				Map.of("gender", "男", "score", "A")		
		);
		System.out.println(students);
		
		//利用 GENDER 來分組每組有幾人
		Map<String, Long> gender = students.stream().collect(groupingBy(student ->student.get("gender"), counting()));
		//利用 GRADE 來分組每組有幾人
		Map<String, Long> score = students.stream().collect(groupingBy(student ->student.get("score"), counting()));
		
		System.out.println(gender);
		System.out.println(score);
	}

}