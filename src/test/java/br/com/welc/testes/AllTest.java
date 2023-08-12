package br.com.welc.testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@RunWith(Suite.class)
//@SuiteClasses({ClienteServiceTest.class, TestesJunit.class})
//@SuiteClasses({PrimeiroTeste.class, SegundoTeste.class})
//public class AllTest {

//}

@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,ProdutoServiceTest.class, ProdutoDAOTest.class,
	VendaDAOTest.class})
public class AllTest {

}

