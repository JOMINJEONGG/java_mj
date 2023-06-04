package day3.operator;

public class ShortCircuitEvaluationEx {

	public static void main(String[] args) {
		String str = null;
		/* str이 null이기 때문에 str.xxㅇ로 되어 있는 모든 곳에서 에러가 발생
		 * 그런데 && 연산자 앞에서 null 체크하는 코드가 먼저 있기 때문에 null인 경우에
		 * 앞 부분이 거짓이 되서 뒷 부분이 문제가 되는 코드를 실행하지 않아서 무사히 넘어감(SCE/단락회로평가)
		 * Ex)자격증 시험 4개 중 하나라도 과락이면 자격증 시험 탈락인데 첫번째 시험 과락이니 뒤에 시험 점수 확인 할 필요가 없다
		 * 왼쪽 값에 따라 오른쪽이 실행되지 않고 바로 결과 나오는것
		 * */
		System.out.println("Is" + str + "equal to abc? " + (str != null && str.equals("abc")));
		//아래 코드는 위 코드에서 순서만 변경한 코드로, 문제가 되는 코드를 먼저 실행하기 때문에 에러(예외)가 발생
		//System.out.println("Is" + str + "equal to abc? " + (str.equals("abc") && str != null));
		
				

	}

}
