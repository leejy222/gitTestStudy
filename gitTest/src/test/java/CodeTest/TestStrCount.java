package CodeTest;

import org.junit.Test;

public class TestStrCount {
	
	@Test
	public void countTest() {
		String str="�� ����";
		String str1=str.replaceAll(" ","");  //ù��° ���� �ι�° ������ �ٲ�
		System.out.println(str1.length());
	}
}
