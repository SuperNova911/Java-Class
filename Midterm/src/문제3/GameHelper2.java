package ����3;

import java.io.*;
import java.util.*;

public class GameHelper2  {

	public String getUserInput() {  // �Է°��� �޴� �޼ҵ�
		String inputLine = null;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));  // �Է�
			 inputLine = is.readLine();
			if (inputLine.length() == 0 )  return null;     // �Է°��� ������  null ��ȯ
		 } catch (IOException e) {  // ���� ó��
		   System.out.println("IOException: " + e);
		 }
		return inputLine;  // �Է°� ��ȯ
	}
}  // Ŭ���� ����

