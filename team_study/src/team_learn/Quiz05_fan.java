package team_learn;

public class Quiz05_fan {
public static void main(String[] args) {
	Quiz05_funtion fan = new Quiz05_funtion();
	
	while(true)
	{
		
	System.out.println("1.????on 2.????off");
	fan.fanPower();
	
	if( fan.GetPower() == 1)
	{
	
	System.out.println("1.???? 2.??ǳ 3.??ǳ 4. ??ǳ");
	fan.fan_Wind_adj();
	System.out.println("1.????ȸ?? 2. ?¿?ȸ??");
	fan.fan_spin();
	}
	}
}
}
