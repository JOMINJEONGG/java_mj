package day16.homework;

import java.util.Scanner;

import day16.vo.Product;

public class BeverageMarchineEx {

	public static void main(String[] args) {
		/* 음료수를 뽑는 자판기 프로그램을 작성하세요.
		 * 단 음료수 자판기에 음료수는 사이다, 콜라, 환타가 고정이라고 가정.
		 * 메뉴를 선택하면 음료수와 잔액이 나옴(출력)
		 * 메뉴
		 * 1. 금액 투입
		 * 2. 메뉴 선택
		 * 3. 제품 입고
		 * 4. 프로그램 종료
		 * 
		 * 메뉴선택 : 2
		 * 1. 사이다
		 * 2. 콜라
		 * 3. 환타
		 * 
		 * 음료선택 : 1
		 * 사이다를 선택했습니다.
		 * 사이다가 나옵니다.[금액이 충분한 경우]
		 * 잔돈 xxx가 나옵니다. 
		 * 
		 * 금액이 부족합니다. [금액이 부족한 경우]
		 * */
	}
	
	private Scanner sc = new Scanner(System.in);
	private Product list[] = new Product[10];//제품 리스트
	private int count = 0;//저장된 제품 개수
	
	public void run() {
		System.out.println("음료수 뽑기 시작!!");
		
		int menu = -1;
		final int EXIT = 6;
		do {
			//메뉴 출력
			printMenu();
			
			//메뉴 선택
			menu = sc.nextInt();
			
			//선택한 메뉴에 따른 기능을 실행
			runMenu(menu);
				
		}while(menu != EXIT);
		System.out.println("음료수 뽑기 종료!!");
	}
	
	private void printMenu() {
		System.out.println("====================");
		System.out.println("메뉴");
		System.out.println("1. 금액 투입");
		System.out.println("2. 메뉴 선택");
		System.out.println("3. 제품 입고");
		System.out.print("4. 프로그램 종료!");
	}
	
	private void runMenu(int menu) {
		System.out.println("================");
		switch(menu){
		case 1: // 금액투입
			sell();
			break;
		case 2: // 메뉴 선택
			select();
			break;
		case 3: // 제품 입고
			store();
			break;
		case 4: // 프로그램 종료
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("잘못된 메뉴");
		}
	}
	
	private void sell() {
		// TODO Auto-generated method stub
		
	}	

	private void select() {
		// TODO Auto-generated method stub
		
	}

	private void store() {
		//입고할 제품명 입력
		System.out.print("제품명 : ");
		sc.nextLine();
		String name = sc.nextLine();
		//입고할 제품 수량
		System.out.print("수량 : ");
		int amount = sc.nextInt();
			
		if(amount < 0) {
			System.out.println("입고 수량 오류!");
			return;
		}
		
		//제품 리스트에서 입고할 제품명이 있는지 찾음 =>메서드 만들기
		//제품 배열에 있는 제품명과 입고할 제품명이 같은지를 확인해서 같으면 위치를 기억
		int index = indexOf(name);
			
		//있으면 입고할 제품 수량만큼 해당제품에 입고
		//위치가 0이상이면
		if(index != -1) {
			list[index].store(amount);
			System.out.println("입고 완료");
			return;
		}
		//없으면 제품 리스트에 제품 정보를 추가(입고할 수량도 함께)
		//위치가 -1이면 => else로 해도 되지만 return으로~
		//최대치로 등록되어 있으면
		if(count == list.length) {
			System.out.println("제품 리스트 다참!");
			return;
		}
		
		//가격을 입력
		System.out.print("가격 : ");
		int price = sc.nextInt();
			
		//제품 리스트에 추가
		list[count++] = new Product(name, price, amount);
		System.out.println("제품 추가 후 입고 완료");

	}
	/**제품 리스트에 제품명과 일치하는 제품이 있으면 번지를, 없으면 -1을 알려주는 메서드
	 * 매개변수 : 제품명 => String name
	 * 리턴타입 : 제품이 있는 번지나 -1 => 정수 => int
	 * 메서드명 : indexOf
	 * */
	public int indexOf(String name) {
		for(int i = 0 ; i < count ; i++) {
			if(list[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
}
