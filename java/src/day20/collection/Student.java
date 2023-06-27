package day20.collection;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;

@Data
@AllArgsConstructor
public class Student {
	private int grade, classNum, num;
	private String name;
}