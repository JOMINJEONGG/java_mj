package day21.practice.updown.run;

import day21.practice.updown.controller.GameManager;

public class UpDownEx {

	public static void main(String[] args) {
		//UpDown 게임을 구현하세요. 기록도 관리하는 기능을 추가하세요.
		/* < Menu >
		 * 1. play
		 * 2. record
		 * 3. exit
		 * select : 1 
		 * ...//3번만에 맞춤
		 * record id : abc
		 * 1. play
		 * 2. record
		 * 3. exit
		 * select : 2
		 * 
		 * rank 1 abc : 3
		 * */
		GameManager gm = new GameManager();
		gm.run();
	}
}