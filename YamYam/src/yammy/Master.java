package yammy;

import java.io.IOException;
import java.util.ArrayList;

public class Master
{

	public static void main(String[] args)
	{
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		Crawler cw = new Crawler();
		Register register = new Register();
		
		cw.setURL();
		cw.getData();
		System.out.println(cw.getURL());
		System.out.println(cw.getOriginData());
		//menuList.addAll(register.registerMenu(cw));
		
		

		cw.setURL(2017, 10, 30);
		System.out.println(cw.getURL());
		cw.getData();
		System.out.println(cw.getOriginData());
		menuList.addAll(register.registerMenu(cw));
		
		
		

		for (Menu menu : menuList)
		{
			kappa(menu);
		}
	}

	public static void kappa(Menu menu)
	{
		System.out.print(menu.getYear() + " ");
		System.out.print(menu.getMonth() + " ");
		System.out.print(menu.getDay() + " ");
		System.out.print(menu.getMealType().toString() + " ");
		System.out.print(menu.getFoodType().toString() + " ");
		System.out.println(menu.getFoodName() + " ");
		//System.out.println(menu.getKcal() + " ");
	}
	

}