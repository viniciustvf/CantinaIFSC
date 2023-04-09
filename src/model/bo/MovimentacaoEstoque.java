
package model.bo;

import java.time.LocalDateTime;

public class MovimentacaoEstoque {
    
    private int id;
    private LocalDateTime dataHoraMovimento;
    private char flagTipoMovimento;
    private float qtdMovimentada;
    private String observacaoMovimento;
    private char status;

    public MovimentacaoEstoque() {
    }

    public MovimentacaoEstoque(int id, LocalDateTime dataHoraMovimento, char flagTipoMovimento, float qtdMovimentada, String observacaoMovimento, char status) {
        this.id = id;
        this.dataHoraMovimento = dataHoraMovimento;
        this.flagTipoMovimento = flagTipoMovimento;
        this.qtdMovimentada = qtdMovimentada;
        this.observacaoMovimento = observacaoMovimento;
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

    public char getFlagTipoMovimento() {
        return flagTipoMovimento;
    }

    public void setFlagTipoMovimento(char flagTipoMovimento) {
        this.flagTipoMovimento = flagTipoMovimento;
    }

    public float getQtdMovimentada() {
        return qtdMovimentada;
    }

    public void setQtdMovimentada(float qtdMovimentada) {
        this.qtdMovimentada = qtdMovimentada;
    }

    public String getObservacaoMovimento() {
        return observacaoMovimento;
    }

    public void setObservacaoMovimento(String observacaoMovimento) {
        this.observacaoMovimento = observacaoMovimento;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MovimentacaoEstoque{" + "id=" + id + ", dataHoraMovimento=" + dataHoraMovimento + ", flagTipoMovimento=" + flagTipoMovimento + ", qtdMovimentada=" + qtdMovimentada + ", observacaoMovimento=" + observacaoMovimento + ", status=" + status + '}';
    }  
}
