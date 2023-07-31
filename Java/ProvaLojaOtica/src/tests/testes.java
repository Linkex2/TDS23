package tests;

	import entities.ProdutoOtica;
	import org.junit.jupiter.api.Assertions;
	import org.junit.jupiter.api.Test;



	class ProdutoTest {

		@Test
		void testRemoveStock() {
			ProdutoOtica p1 = new ProdutoOtica("XXXX", "XXXXX", 10, 10 ,10,10,"XXXX");
			//p1.addStock(1);
			p1.excluirEstoque(1);
			Assertions.assertEquals(9,p1.getEstoque());
			p1.excluirEstoque(-1);
			Assertions.assertEquals(8,p1.getEstoque());
			p1.excluirEstoque(0);
			Assertions.assertEquals(7,p1.getEstoque());
		}
		
		@Test 
		void testAddStock(){
			ProdutoOtica p1 = new ProdutoOtica("XXXX", "XXXXX", 0, 0 ,0,0,"XXXX");
			p1.incluirEstoque(10);
			Assertions.assertEquals(10,p1.getEstoque());
			p1.incluirEstoque(0);
			Assertions.assertEquals(11,p1.getEstoque());
			p1.incluirEstoque(-1);
			Assertions.assertEquals(12,p1.getEstoque());
		}
}
