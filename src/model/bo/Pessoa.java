package model.bo;


public abstract class Pessoa {
    
    private int id;
    private String nome;
    private String fone1;
    private String fone;
    private String email;
    private char status;
    private String complementoEndereco;
    
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String fone1, String fone, String email, char status, String complementoEndereco) {
        this.id = id;
        this.nome = nome;
        this.fone1 = fone1;
        this.fone = fone;
        this.email = email;
        this.status = status;
        this.complementoEndereco = complementoEndereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return this.getComplementoEndereco() + ", "
                + this.getEmail() + ", " 
                + this.getFone() + ", "
                + this.getFone1() + ", "
                + this.getNome();
    }
}