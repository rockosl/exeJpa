package modelo.umpraum;

import infra.DAO;

public class ObterClienteAssento {

	public static void main(String[] args) {
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		Cliente cliente = dao.obterPorId(1L);
		System.out.println("o Assento do cliente é: "+ cliente.getAssento().getNome());
		
		dao.fechar();
	}
}
