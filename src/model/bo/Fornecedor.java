
package model.bo;


public class Fornecedor extends Pessoa{
    
    private String cnpj;
    private String inscricaoEstadual;
    private String razaoSocial;

    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String inscricaoEstadual, String razaoSocial) {
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return this.getCnpj() + ", " 
                + this.getInscricaoEstadual() + ", "
                + this.getRazaoSocial();
    }
}