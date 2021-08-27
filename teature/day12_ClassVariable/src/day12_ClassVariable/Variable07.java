package day12_ClassVariable;

import java.util.Scanner;
// 입.출력 기능별로 만드세요. 변수는 인스턴스 변수로 만드세요
public class Variable07 {
	private int age;
    private String name;
    public void disply(){
        System.out.println("학생 이름 : "+name);
        System.out.println(name+"나이 :"+age);
    }
    public void input() {
    	Scanner input = new Scanner(System.in);
        System.out.println("학생 이름 입력");
        name = input.next();
        System.out.println("학생 나이 입력");
        age = input.nextInt();
    }
}
