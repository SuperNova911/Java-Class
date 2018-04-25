package khub����;

import java.util.Scanner;

class Book
{
	private String name;
	private String author;
	
	public Book(String name, String author)
	{
		this.name = name;
		this.author = author;
	}
	
	public void BookInfo()
	{
		System.out.println("����: " + name);
		System.out.println("���� : " + author);
	}
}

public class BookArray
{
	public static void main(String[] args)
	{
		Book[] book = new Book[2];
		String title, author;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < book.length; i++)
		{
			System.out.print("����: ");
			title = sc.nextLine();
			System.out.print("����: ");
			author = sc.nextLine();
			
			book[i] = new Book(title, author);
		}
		
		for (Book bk : book)
		{
			bk.BookInfo();
		}
	}
}
