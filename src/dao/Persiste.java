
package dao;

import java.util.ArrayList;
import model.bo.Bairro;
import model.bo.Carteirinha;
import model.bo.Cidade;
import model.bo.Cliente;
import model.bo.Endereco;
import model.bo.Fornecedor;
import model.bo.Funcionario;
import model.bo.Produto;


public class Persiste {
    
    private static Persiste persiste;

    private ArrayList<Bairro> listaBairro = new ArrayList<>();
    private ArrayList<Carteirinha> listaCarteirinha = new ArrayList<>();
    private ArrayList<Cidade> listaCidade = new ArrayList<>();
    private ArrayList<Cliente> listaCliente = new ArrayList<>();
    private ArrayList<Endereco> listaEndereco = new ArrayList<>();
    private ArrayList<Fornecedor> listaFornecedor = new ArrayList<>();
    private ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
    private ArrayList<Produto> listaProduto = new ArrayList<>();
    
    
    private Persiste() {
    }

    // Método estático para obter a única instância da classe
    public static Persiste getInstance() {
        if (persiste == null) {
            persiste = new Persiste();
        }
        return persiste;
    }

    
    
}
