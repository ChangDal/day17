package team_learn;

import java.util.Scanner;

public class Quiz03_humidifier {

	public static void main(String[] args) {
		
		Quiz03_funtion humidifier = new Quiz03_funtion();
		
		Scanner input= new Scanner(System.in);
		int select = 0;
		int humidity = 0;
		
		System.out.println("1.�����ѱ� 2.�������� ");
		
		humidifier.humidifier_Power();
		
		humidifier.humidifier_Adj();
		
		}
	}

