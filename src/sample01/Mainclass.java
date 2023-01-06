package sample01;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("헬로우 자바");
		
		// 한줄 주석문 ->컴파일 되지 않는다
		
		/* 범위 주석문
		 	Html <!-- -->
		 	Jsp  <%-- --%>
		 	mySQL --
		 	python # """주석문"""
		*/
		
		System.out.println("Hello World");
		
		System.out.print("Hello");
		
		System.out.print("월드");

		// 기능 : escape sequence 
		//	\n(개행 행바꾸기),\b(backspace한칸 앞으로 가기),\"(큰따옴표 쓰기),\t(띄어쓰기),\\(\쓰기)
		
		System.out.print("World\n");
		
		System.out.println("헬로우\b");
		
		System.out.println("\"Hello world\"");
		
		System.out.println("\tHello\tWorld");
		
		System.out.println("\t월드\t헬로");
		
		System.out.println("\\헬로우 월드\\");
		
		System.out.printf("--%s--\n","Hello"); //Hello == 문자열(string)
//		                 표현자료형  값
//		printf는 자동개행이 되지 않는다 출력함수
		
		System.out.println(1024);
		
		System.out.println("Hello"+"World");
		
		
		
		
	}

}
