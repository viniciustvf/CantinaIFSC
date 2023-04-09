package model.bo;

public class Endereco {
    
    private int id;
    private String cep;
    private String logradouro;
    private char status;

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

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", cep=" + cep + ", logradouro=" + logradouro + ", status=" + status + '}';
    } 
}
