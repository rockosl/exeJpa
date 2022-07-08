package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Monitor", 1000.00);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		dao.incluirAtomico(produto).fechar();
	}

}
