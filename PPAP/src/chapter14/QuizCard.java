package chapter14;

import java.io.Serializable;

public class QuizCard implements Serializable
{
	private String uniqueID;
	private String category;
	private String question;
	private String answer;
	private String hint;
	
	public QuizCard(String question, String answer)
	{
		this.setQuestion(question);
		this.setAnswer(answer);
	}

	public String getUniqueID()
	{
		return uniqueID;
	}

	public void setUniqueID(String uniqueID)
	{
		this.uniqueID = uniqueID;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public String getQuestion()
	{
		return question;
	}

	public void setQuestion(String question)
	{
		this.question = question;
	}

	public String getAnswer()
	{
		return answer;
	}

	public void setAnswer(String answer)
	{
		this.answer = answer;
	}

	public String getHint()
	{
		return hint;
	}

	public void setHint(String hint)
	{
		this.hint = hint;
	}
}
