package khub抗力;

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
		System.out.println("力格: " + name);
		System.out.println("历磊 : " + author);
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
			System.out.print("力格: ");
			title = sc.nextLine();
			System.out.print("历磊: ");
			author = sc.nextLine();
			
			book[i] = new Book(title, author);
		}
		
		for (Book bk : book)
		{
			bk.BookInfo();
		}
	}
}
