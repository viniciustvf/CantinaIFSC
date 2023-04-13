
package model.bo;


public class Funcionario extends Pessoa{
    
    private String cpf;
    private String rg;
    private String usuario;
    private String senha;

    public Funcionario() {
    }

    public Funcionario(String cpf, String rg, String usuario, String senha) {
        this.cpf = cpf;
        this.rg = rg;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Funcionario(String cpf, String rg, String usuario, String senha, int id, String nome, String fone1, String fone, String email, char status, String complementoEndereco) {
        super(id, nome, fone1, fone, email, status, complementoEndereco);
        this.cpf = cpf;
        this.rg = rg;
        this.usuario = usuario;
        this.senha = senha;
    }    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return this.getCpf() + ", " 
                + this.getRg() + ", "
                + this.getSenha() + ", "
                + this.getUsuario();
    } 
}
