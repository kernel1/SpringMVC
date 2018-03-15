package io.inyeopjeong.core;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ConsolePrintTest {

	@Test
	public void test() {
		
		assertThat("hello world", is("hello world"));
		
	}

}
