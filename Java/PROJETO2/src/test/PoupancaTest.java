package test;

import org.junit.jupiter.api.Test;

import entities.Estudantil;

class PoupancaTest {

	@Test
	void testUsarEstudantil() {
		Estudantil est1 = new Estudantil(1,"1",100);
		est1.ativar();
		est1.credito(100);
		
		
	}

}
