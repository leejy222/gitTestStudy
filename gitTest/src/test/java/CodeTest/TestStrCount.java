package CodeTest;

import org.junit.Test;

public class TestStrCount {
	
	@Test
	public void countTest() {
		String str="이 글자";
		String str1=str.replaceAll(" ","");  //첫번째 값을 두번째 값으로 바꿈
		System.out.println(str1.length());
	}
}
