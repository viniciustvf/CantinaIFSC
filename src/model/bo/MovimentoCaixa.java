
package model.bo;

import java.time.LocalDateTime;

public class MovimentoCaixa {
    
    private int id;
    private LocalDateTime dataHoraMovimento;
    private float valorMovimento;
    private String observacao;
    private char flagTipoMovimento;
    private char status;

    public MovimentoCaixa() {
    }

    public MovimentoCaixa(int id, LocalDateTime dataHoraMovimento, float valorMovimento, String observacao, char flagTipoMovimento, char status) {
        this.id = id;
        this.dataHoraMovimento = dataHoraMovimento;
        this.valorMovimento = valorMovimento;
        this.observacao = observacao;
        this.flagTipoMovimento = flagTipoMovimento;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataHoraMovimento() {
        return dataHoraMovimento;
    }

    public void setDataHoraMovimento(LocalDateTime dataHoraMovimento) {
        this.dataHoraMovimento = dataHoraMovimento;
    }

    public float getValorMovimento() {
        return valorMovimento;
    }

    public void setValorMovimento(float valorMovimento) {
        this.valorMovimento = valorMovimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public char getFlagTipoMovimento() {
        return flagTipoMovimento;
    }

    public void setFlagTipoMovimento(char flagTipoMovimento) {
        this.flagTipoMovimento = flagTipoMovimento;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.getId() + ", " 
                + this.getDataHoraMovimento()+ ", "
                + this.getFlagTipoMovimento() + ", "
                + this.getValorMovimento() + ", "
                + this.getStatus() + ", "
                + this.getObservacao();
    }
}
