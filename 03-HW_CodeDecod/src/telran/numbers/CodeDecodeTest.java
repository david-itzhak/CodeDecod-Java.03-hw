package telran.numbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CodeDecodeTest {

//	@Test
//	void testClasswork() {
//		CodeDecode cd = new CodeDecode();
//		String resStr = cd.code(123);
//		assertEquals(resStr, "123");
//		int resNum = cd.decode("123");
//		assertEquals(123, resNum);
//	}
	
	@Test
	void testHomework() {
		CodeDecode cd1 = new CodeDecode("*()+&^%$¹-");
		String resStr = cd1.code(123);
		assertEquals("()+", resStr);
		CodeDecode cd2 = new CodeDecode(".-");
		assertEquals("-.-", cd2.code(5));
		assertEquals(10, cd1.decode("(*"));
		System.out.println(cd2.code(12345678));
		CodeDecode cd = new CodeDecode("abcdefghiklmnoprstuwvz");
		int like = cd.decode("like");
		System.out.println(like);
	}
	
	@Test 
	void testGetKey() {
	String key = "$Gft%56&8(+=-_90hjgre3@1<>?/mnHIop";
	CodeDecode cd = new CodeDecode(key);
	assertEquals(key, getKeyString(cd));
	}
	
	String getKeyString(CodeDecode cd) {
	String res = "";
	
	int digit=0;
	String code = cd.code(0);
	do {
		res += code;
		digit++;
		code = cd.code(digit);
	}while(code.length() == 1);
	return res;
	}

}
