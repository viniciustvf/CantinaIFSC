
package model.bo;

import java.time.LocalDateTime;

public class Compra {
    
    private int id;
    private int numeroNf;
    private LocalDateTime dataHoraCompra;
    private int valorDesconto;
    private char flagTipoDesconto;
    private char status;
    private String observacao;

    public Compra() {
    }

    public Compra(int id, int numeroNf, LocalDateTime dataHoraCompra, int valorDesconto, char flagTipoDesconto, char status, String observacao) {
        this.id = id;
        this.numeroNf = numeroNf;
        this.dataHoraCompra = dataHoraCompra;
        this.valorDesconto = valorDesconto;
        this.flagTipoDesconto = flagTipoDesconto;
        this.status = status;
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroNf() {
        return numeroNf;
    }

    public void setNumeroNf(int numeroNf) {
        this.numeroNf = numeroNf;
    }

    public LocalDateTime getDataHoraCompra() {
        return dataHoraCompra;
    }

    public void setDataHoraCompra(LocalDateTime dataHoraCompra) {
        this.dataHoraCompra = dataHoraCompra;
    }

    public int getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(int valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public char getFlagTipoDesconto() {
        return flagTipoDesconto;
    }

    public void setFlagTipoDesconto(char flagTipoDesconto) {
        this.flagTipoDesconto = flagTipoDesconto;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", numeroNf=" + numeroNf + ", dataHoraCompra=" + dataHoraCompra + ", valorDesconto=" + valorDesconto + ", flagTipoDesconto=" + flagTipoDesconto + ", status=" + status + ", observacao=" + observacao + '}';
    }
}
