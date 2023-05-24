package model.bo;

public class Endereco {
    
    private int id;
    private String cep;
    private String logradouro;
    private char status;
    
    private Cidade cidade;
    private Bairro bairro;

    public Endereco() {
    }

    public Endereco(int id, String cep, String logradouro, char status) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return  this.getCep()+ ", " 
                + this.getLogradouro() + ", " 
                + this.getCep() + ", "
                + this.bairro.getDescricao()
                + this.cidade.getDescricao()
                + this.getStatus();
    } 
}
