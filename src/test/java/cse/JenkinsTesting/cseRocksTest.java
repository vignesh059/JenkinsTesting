package cse.JenkinsTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class cseRocksTest {
	cseRocks r = new cseRocks();
	@Test
	void test1() {
		int res = r.add(2, 3);
		assertEquals(5,res);
	}
	@Test
	void test2() {
		int res = r.mul(2, 3);
		assertEquals(6,res);
	}
}
