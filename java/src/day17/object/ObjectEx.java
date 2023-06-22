package day17.object;

import lombok.Data;

public class ObjectEx {
	/* Object 클래스 = 모든 클래스의 최상위 조상 클래스
	 * 클래스를 만들 때 따로 상속을 지정하지 않으면 Object 클래스에게 자동으로 상속을 받음
	 * 모든 클래스들은 Object 클래스에 있는 메서드를 사용할 수 있음.
	 * 주로 일반 클래스에서 Obejct 클래스의 메서드를 오버라이딩하여 사용.
	 * */
	public static void main(String[] args) {
		Point1 pt1 = new Point1(10,20);
			System.out.println(pt1);
			System.out.println(pt1.toString());
		
			Point2 pt2 = new Point2(30,40);	
			System.out.println(pt2);
	}

}
@Data
class Point1{
	private int x, y;
	
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point2{
	private int x, y;
	
	public Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/*public String toString(){
		return "(" + x + "," + y + ")";
	}*/

	@Override
	public String toString() {
		return "Point2 [x=" + x + ", y=" + y + "]";
	}
	
}

