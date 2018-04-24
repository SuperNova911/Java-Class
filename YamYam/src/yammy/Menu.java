package yammy;


public class Menu
{
	private int year;
	private int month;
	private int day;
	private double kcal;
	
	private String foodName;
	private FoodType foodType;
	private MealType mealType;
	
	public enum MealType
	{
		��ħ, ����, ����, �˼�����
	}
	public enum FoodType
	{
		�ѽ�, �����, �����, ��ǰ, ���, �˼�����
	}
	
	public void setDate(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setKcal(double kcal)
	{
		this.kcal = kcal;
	}
	
	public void setFoodName(String foodName)
	{
		this.foodName = foodName;
	}
	
	public String getFoodName()
	{
		return foodName;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getDay()
	{
		return day;
	}


	
	public double getKcal()
	{
		return kcal;
	}
	
	public FoodType getFoodType()
	{
		return foodType;
	}
	


	public void setFoodType(FoodType foodType)
	{
		this.foodType = foodType;
	}



	public MealType getMealType()
	{
		return mealType;
	}



	public void setMealType(MealType mealType)
	{
		this.mealType = mealType;
	}
	
	
}
