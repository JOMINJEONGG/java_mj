package day22.practice.phonelist.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import day22.practice.controller.Program;
import day22.practice.phonelist.vo.Phone;
import day22.practice.vo.Student;

public class PhoneList implements Program  {

	private List<Phone> list = Arrays.asList(
			new Phone("010-1234-5678","Hong")
		);
	private Scanner sc = new Scanner(System.in);
	private static final int EXIT = 4;
	
	@Override
	public void printMenu() {
		System.out.println("1. 전화번호 등록");
		System.out.println("2. 전화번호 수정");
		System.out.println("3. 전화번호 검색");
		System.out.println("4. 프로그램 종료");	
		System.out.print("Select : ");		
	}

	@Override
	public void run() {
		System.out.println("Program Start!!");

		int menu;
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);

		}while(menu != EXIT);		
	}

	@Override
	public void runMenu(int menu) {
		String phonenum, name;
		switch (menu) {
		case 1:
			System.out.println("등록할 전화번호 : ");
			phonenum = sc.nextLine();
			register();
			break;
		case 2:
			System.out.println("전화번호 검색 : ");
			phonenum = sc.nextLine();
			System.out.println("이름 검색 : ");
			name = sc.nextLine();
		
			change();
			break;
		case 3:
			System.out.println("전화번호 검색 : ");
			phonenum = sc.nextLine();
			System.out.println("이름 검색 : ");
			name = sc.nextLine();
			
			search(phonenum, name);
			break;
		case 4:
			System.out.println("프로그램 종료");
			break;		
		default:
			System.out.println("Wrong menu!");
		}	
		
	}

	private void search(String phonenum, String name) {
		for(Phone tmp : list) {
			if(tmp.equals(new Student(phonenum, name))) {
			System.out.println(tmp);
			}
		}
		
	}

	private void change() {
		// TODO Auto-generated method stub
		
	}

	private void register() {
		// TODO Auto-generated method stub
		
	}
	
}
