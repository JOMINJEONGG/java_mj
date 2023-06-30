package day22.practice.phone.vo;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data	
@AllArgsConstructor
public class PhoneBook {
	
	String phonenum;
	String name;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneBook other = (PhoneBook) obj;
		return Objects.equals(name, other.name) && Objects.equals(phonenum, other.phonenum);
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, phonenum);
	}
	
}
