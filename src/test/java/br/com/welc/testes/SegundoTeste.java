package br.com.welc.testes;

import org.junit.Assert;
import org.junit.Test;

public class SegundoTeste {

	@Test
	public void test2() {
		String nome = "Wagner";
		Assert.assertEquals("Wagner", nome);
	}
		
		  @Test public void test2NotEquals() { String nome = "Wagner";
		  Assert.assertEquals("Wagner", nome);
		  
		 
	}

}
