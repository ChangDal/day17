package day03_if;

public class Ex01 {
	public static void main(String[] args) {
	/*
		 * : ���ϱ�
		 / : ������( ���� / ���� = ����(��) ) -> 10/3=3 , 10.0 / 3 = 3.33,,
		 %(mod) : ������ -> 10 % 3 = 1
		 -> ����� ¦,Ȧ �Ǵ� ��������� Ȯ���� �� �ִ�.
	*/
		int num1 = 9, num2 = 2;
		System.out.println( num1+num2 );
		System.out.println( num1-num2 );
		System.out.println( num1*num2 );
		System.out.println( num1/num2 );
		System.out.println( num1%num2 );
		/*
		 ���� ���� ������
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
		 ���� ������ : ��(true) �Ǵ� ����(false) ǥ����
		 10 < 5 : false
		 10 >= 5 : true
		 10 == 5 : false(���ʰ� �������� ����?)
		 10 != 5 : true(���ʰ� �������� ���� �ʳ�?)
		 */
		double do1 = 3.0, do2 = 3.01;
		System.out.println( do1 <= do2 );
		System.out.println( do1 >= do2 );
		System.out.println( do1 == do2 );
		System.out.println( do1 != do2 );
		/*
		 �� ������ : �� �Ǵ� ������ ���
		 ---------
		 || : �ϳ��� ���̶�� ����� ��. ���� �ϳ��� ������ ����
		 ||(or) : true || false => true
		 => (10 > 15) || (10 != 10) => false
		 --------
		 &&(and) : �ϳ��� ������ ������ ����� ����. ��ΰ� ���϶� ��
		 => true && false => false
		 => true && true => true 
		 -------
		 !(not) : ������� ������ �̷������.
		 => !true => false
		 => !false => true
		 */
		System.out.println("=== �� ������ ===");
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
		 ����������
		 ++ : �ڱ��ڽ��� 1����
		 -- : �ڱ��ڽ��� 1����
		 ��) a = 10; ++a => a = a + 1
		 */
		System.out.println("=== ���� ������ ===");
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
		
		System.out.println("=== ��ġ ��ġ Ȯ�� ===");
		int su11,su22,su33;
		
		su11 = 10;  
		su22 = ++su11;
		su11 = 10;  
		su33 = su11++;
		System.out.println("su2 = "+su22);
		System.out.println("su3 = "+su33);


	}
}









