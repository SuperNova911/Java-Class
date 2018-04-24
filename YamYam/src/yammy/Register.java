package yammy;

import java.util.ArrayList;

public class Register
{
	private String data;
	private String searchArea;
	private String[] menuList;
	
	private int day;
	private double kcal;

	private Menu.MealType mealType;
	private Menu.FoodType foodType;
	
	
	
	public void setData(String data)
	{
		this.data = data;
	}
	
	public ArrayList<Menu> registerMenu(Crawler cw)
	{
		ArrayList<Menu> MENU = new ArrayList<Menu>();
		data = cw.getOriginData();
		int year = cw.getYear();
		int month = cw.getMonth();
		day = cw.getDay();
		int monthCorrection = cw.getDay();
		
		for (int i = 0; i < 3 * 7; i++)
		{
			if (data.length() == 0)
				break;
			
			searchArea = setSearchArea();
			
			day = searchDay();
			if (day - monthCorrection > 20)
				month--;
			else if (day - monthCorrection < -20)
				month++;
			monthCorrection = day;
			
			mealType = searchMealType();
			foodType = searchFoodType();
			menuList = searchMenu();
			kcal = searchKcal();
			for (String strMenu : menuList)
			{
				Menu menu = new Menu();
				menu.setDate(year, month, day);
				menu.setFoodName(strMenu);
				menu.setMealType(mealType);
				menu.setFoodType(foodType);
				menu.setKcal(kcal);

				MENU.add(menu);
			}
			if (searchArea.contains("//"))
			{
				foodType = searchFoodType();
				menuList = searchMenu();
				kcal = searchKcal();

				for (String strMenu : menuList)
				{
					Menu menu = new Menu();
					menu.setDate(year, month, day);
					menu.setFoodName(strMenu);
					menu.setMealType(mealType);
					menu.setFoodType(foodType);
					menu.setKcal(kcal);

					MENU.add(menu);
				}
			} 
		}
		return MENU;
	}
	
	public String setSearchArea()
	{
		try 
		{
			String str = data;
			int indexS, indexE, indexT;
			indexE = 0;
			
			indexT = str.indexOf(":");
			indexS = indexT - 2;
			if (str.substring(indexS, indexT).contains("��ħ"))
				indexS -= 3;
			if (str.substring(indexS, indexT).contains("����"))
				indexE -= 3;
			
			str = str.substring(indexT + 1);
			if (str.contains(":"))
			{
				indexE += str.indexOf(":");
				indexE += indexT - 2;
				
				
				str = data.substring(indexS, indexE);
				data = data.substring(indexE);
			}
			else
			{
				str = data.substring(indexS);
				data = "";
			}
			
			return str;
		} 
		catch (Exception e)
		{
			System.out.println("setSearchArea()" + ", data: \"" + data + "\"");
			data = "";
			return "";
		}
	}
	
	public int searchDay()
	{
		try
		{
			if (!searchArea.substring(0, 10).contains("��ħ"))
				return day;
			
			String str = searchArea.substring(0, 2);
			str = str.replace(" ", "");
			searchArea = searchArea.substring(3);
			
			return Integer.parseInt(str);
		}
		catch (Exception e)
		{
			return 0;
		}
	}
	
	public Menu.MealType searchMealType()
	{
		try
		{
			String str = searchArea;
			int indexS, indexE;
			
			if (!str.contains(":"))
				return Menu.MealType.�˼�����;
			
			indexE = searchArea.indexOf(":");
			indexS = indexE - 2;
			
			str = searchArea.substring(indexS, indexE);
			searchArea = searchArea.substring(indexE + 2);
			
			switch (str)
			{
			case "��ħ":
				return Menu.MealType.��ħ;
			case "����":
				return Menu.MealType.����;
			case "����":
				return Menu.MealType.����;
			default:
				return Menu.MealType.�˼�����;
			}
		} 
		catch (Exception e)
		{
			return Menu.MealType.�˼�����;
		}
	}

	public Menu.FoodType searchFoodType()
	{
		try
		{
			String str = searchArea;
			Menu.FoodType fType;
			int indexS, indexE;
			
			indexS = 0;
			indexE = 10;
			str = searchArea.substring(indexS, indexE);
			
			if (str.contains("//"))
			{
				if (str.contains("(�����)"))
					fType = Menu.FoodType.�����;
				else if (str.contains("(�����)"))
					fType = Menu.FoodType.�����;
				else if (str.contains("(��ǰ)"))
					fType = Menu.FoodType.��ǰ;
				else
				{
					fType = Menu.FoodType.���;
					indexS = searchArea.indexOf("//");
					searchArea = searchArea.substring(indexS + 3);
					
					return fType;
				}
				
				indexS = searchArea.indexOf(")");
				searchArea = searchArea.substring(indexS + 1);
			}
			else
				fType = Menu.FoodType.�ѽ�;
			
			return fType;
		} 
		catch (Exception e)
		{
			return Menu.FoodType.�˼�����;
		}
	}

	public String[] searchMenu()
	{
		try
		{
			String str = searchArea;
			String[] menuList;
			int indexS, indexE;
			
			indexS = 0;
			indexE = str.indexOf("k");
			indexE -= 5;

			if (str.substring(indexE + 1, indexE + 2).contains(" "))
			{
				indexE += 2;
			}
			
			if (str.contains(" k"))	// ���� Į�θ� ǥ�ÿ��� ���ڿ� kcal���� ���̿� ������ ���� �Ѥ�
				indexE--;
			
			str = searchArea.substring(indexS, indexE);
			searchArea = searchArea.substring(indexE);
			
			menuList = str.split(" ");
			
			return menuList;
		}
		catch (Exception e)
		{
			menuList = new String[0];
			return menuList;
		}
	}

	public double searchKcal()
	{
		try
		{
			String str = searchArea;
			int indexS, indexE;
			
//			indexE = str.indexOf("kcal");
//			indexS = indexE - 5;
//			
//			if (str.contains(" k")) // ���� Į�θ� ǥ�ÿ��� ���ڿ� kcal���� ���̿� ������ ���� �Ѥ�
//				indexS--;
//			
//			str = str.substring(indexS, indexE);
//			indexS = indexE + 4;
//			
//			searchArea = searchArea.substring(indexS);
			
			
			indexS = 0;
			indexE = str.indexOf("k");
			
			str = str.substring(indexS, indexE);
			
			str.replace(" ",  "");
			
			indexS = indexE + 4;
			searchArea = searchArea.substring(indexS);
			
			return Double.parseDouble(str);
		}
		catch (Exception e) 
		{
			return 0;
		}
	}

}
