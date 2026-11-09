package controle;

import dao.DaoProduto;
import modelo.Produto;

public class ControleProduto {
	private Produto produto = new Produto();
	private DaoProduto daoProduto = new DaoProduto();
	
	public void cadastrar(String descricao, float preco) {
		produto.setDescricao(descricao);
		produto.setPreco(preco);
		
		daoProduto.incluir(produto);
	}
	
	public void consultar() {
		
	}
	
	public void alterar() {
		
	}
	
	public void excluir() {
		
	}
}