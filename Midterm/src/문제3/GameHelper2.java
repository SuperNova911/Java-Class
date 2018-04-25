package 문제3;

import java.io.*;
import java.util.*;

public class GameHelper2  {

	public String getUserInput() {  // 입력값을 받는 메소드
		String inputLine = null;
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));  // 입력
			 inputLine = is.readLine();
			if (inputLine.length() == 0 )  return null;     // 입력값이 없으면  null 반환
		 } catch (IOException e) {  // 예외 처리
		   System.out.println("IOException: " + e);
		 }
		return inputLine;  // 입력값 반환
	}
}  // 클래스 종료

