package day03_if;

public class Ex01 {
	public static void main(String[] args) {
	/*
		 * : 곱하기
		 / : 나누기( 정수 / 정수 = 정수(몫) ) -> 10/3=3 , 10.0 / 3 = 3.33,,
		 %(mod) : 나머지 -> 10 % 3 = 1
		 -> 어떤수의 짝,홀 또는 배수인지를 확인할 수 있다.
	*/
		int num1 = 9, num2 = 2;
		System.out.println( num1+num2 );
		System.out.println( num1-num2 );
		System.out.println( num1*num2 );
		System.out.println( num1/num2 );
		System.out.println( num1%num2 );
		/*
		 복합 대입 연산자
		 int a =10, b=20;
		 a = a + b; => a += b;
		 a = a * b; => a *= b;
		 */
		int su1,su2;
		su1=su2=5;
		System.out.println("su1+1=" + (su1+=1)); // su1 = su1 + 1
		System.out.println("su1-1=" + (su1-=1)); // su1 = su1 - 1
		System.out.println("su1*su2=" + (su1*=su2)); //su1 = su1 * su2
		System.out.println("su1/su2=" + (su1/=su2));//su1 = su1 / su2
		System.out.println("su1%su2=" + (su1%=su2));//su1 = su1 % su2
		/*
		 관계 연산자 : 참(true) 또는 거짓(false) 표현해
		 10 < 5 : false
		 10 >= 5 : true
		 10 == 5 : false(왼쪽과 오른쪽이 같냐?)
		 10 != 5 : true(왼쪽과 오른쪽이 같지 않냐?)
		 */
		double do1 = 3.0, do2 = 3.01;
		System.out.println( do1 <= do2 );
		System.out.println( do1 >= do2 );
		System.out.println( do1 == do2 );
		System.out.println( do1 != do2 );
		/*
		 논리 연산자 : 참 또는 거짓의 결과
		 ---------
		 || : 하나라도 참이라면 결과는 참. 참이 하나도 없으면 거짓
		 ||(or) : true || false => true
		 => (10 > 15) || (10 != 10) => false
		 --------
		 &&(and) : 하나라도 거짓이 있으며 결과는 거짓. 모두가 참일때 참
		 => true && false => false
		 => true && true => true 
		 -------
		 !(not) : 결과값이 반전이 이루어진다.
		 => !true => false
		 => !false => true
		 */
		System.out.println("=== 논리 연산자 ===");
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);

		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);
		/*
		 증감연산자
		 ++ : 자기자신을 1증가
		 -- : 자기자신을 1감소
		 예) a = 10; ++a => a = a + 1
		 */
		System.out.println("=== 증감 연산자 ===");
		int s1;
		double s2;
		
		s1=5;  ++s1;
		System.out.println("++s1 = "+s1);
		s1=5;  s1++;
		System.out.println("s1++ = "+s1);
		s2=11.2;  ++s2;
		System.out.println("++s2 = "+s2);
		s2=11.2;  s2++;
		System.out.println("s2++ = "+s2);
		
		System.out.println("=== 전치 후치 확인 ===");
		int su11,su22,su33;
		
		su11 = 10;  
		su22 = ++su11;
		su11 = 10;  
		su33 = su11++;
		System.out.println("su2 = "+su22);
		System.out.println("su3 = "+su33);


	}
}









