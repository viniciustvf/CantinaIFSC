
package model.bo;


public class Cliente extends Pessoa{
    
    private String cpf;
    private String rg;
    private String matricula;
    private String dataNascimento;

    public Cliente() {
    }

    public Cliente(String cpf, String rg, String matricula, String dataNascimento) {
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    public Cliente(String cpf, String rg, String matricula, String dataNascimento, int id, String nome, String fone1, String fone, String email, char status, String complementoEndereco) {
        super(id, nome, fone1, fone, email, status, complementoEndereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return this.getCpf() + ", " 
                + this.getRg() + ", "
                + this.getMatricula() + ", "
                + this.getDataNascimento();
    }
}
