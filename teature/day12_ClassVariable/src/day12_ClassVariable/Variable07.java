package day12_ClassVariable;

import java.util.Scanner;
// ��.��� ��ɺ��� ���弼��. ������ �ν��Ͻ� ������ ���弼��
public class Variable07 {
	private int age;
    private String name;
    public void disply(){
        System.out.println("�л� �̸� : "+name);
        System.out.println(name+"���� :"+age);
    }
    public void input() {
    	Scanner input = new Scanner(System.in);
        System.out.println("�л� �̸� �Է�");
        name = input.next();
        System.out.println("�л� ���� �Է�");
        age = input.nextInt();
    }
}
