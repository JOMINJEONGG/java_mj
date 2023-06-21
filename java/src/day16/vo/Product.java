package day16.vo;

import lombok.Data;

@Data
public class Product {
		//멤버변수 : 제품 판매와 관련된 제품 정보
		private String name;//제품명
		private int price;//가격
		private int amount;//수량(판매 수량, 전체 제고량)
		
		public Product(String name, int price, int amount) {

			this.name = name;
			this.price = price;
			this.amount = amount;
		}
		
		public void print() {
			System.out.println("제품명 : " + name);
			System.out.println("가격 : " + price);		
			System.out.println("재고 : " + amount);
		}

		public void store(int amount) {
		//창고에 제품을 추가해야하는데 음수가 오면 안됨
		if(amount < 0) {
			return;
		}
		accumulate(+amount); // 누적시켜줌
		}
		/**제품 출고 기능 => 현재 수량에서 주어진 수량을 감소*/
		public void release(int amount){
			if(amount < 0){	
				return;		
			}
			accumulate(-amount);
		}
		private void accumulate(int amount){
			this.amount += amount;
		}
}
