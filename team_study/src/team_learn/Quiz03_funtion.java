package team_learn;

import java.util.Scanner;

public class Quiz03_funtion {

	Scanner input = new Scanner(System.in);
	int select = 0;
	int humidity = 0;
	
public void humidifier_Power()
{
	select = input.nextInt();
	
	if(select == 1)
	{
		System.out.println("���� on");
	}
	else if(select == 2)
	{
		System.out.println("���� off");
	}
}

public void humidifier_Adj()
{
	while(true && select == 1)
	{
		
	
	System.out.println("���� ������ �Է��ϼ���");
	
	humidity =input.nextInt();
	System.out.println("�Է��� ������ "+humidity);
	if(humidity <= 40)
	{
		System.out.println("3�ܰ��� + �����Ѱ��� �۵�");
	}
	else if(humidity >= 40 && humidity <= 60 )
	{
		System.out.println("2�� ���� + ������ ���� �۵�");
	}
	else if(humidity >= 60 && humidity <= 70)
	{
		System.out.println("1�� ���� + ������� �۵�");
	}
	
	}
}
}