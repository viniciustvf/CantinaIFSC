
package model.bo;

import java.time.LocalDateTime;

public class Venda {
    
    private int id;
    private LocalDateTime dataHoraVenda;
    private Double valorDesconto;
    //No diagrama estava "float" alterei pra "Double".
    private char flagTipoDesconto;
    private String observacao;
    private char status;

    public Venda() {
    }

    public Venda(int id, LocalDateTime dataHoraVenda, Double valorDesconto, char flagTipoDesconto, String observacao, char status) {
        this.id = id;
        this.dataHoraVenda = dataHoraVenda;
        this.valorDesconto = valorDesconto;
        this.flagTipoDesconto = flagTipoDesconto;
        this.observacao = observacao;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataHoraVenda() {
        return dataHoraVenda;
    }

    public void setDataHoraVenda(LocalDateTime dataHoraVenda) {
        this.dataHoraVenda = dataHoraVenda;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public char getFlagTipoDesconto() {
        return flagTipoDesconto;
    }

    public void setFlagTipoDesconto(char flagTipoDesconto) {
        this.flagTipoDesconto = flagTipoDesconto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", dataHoraVenda=" + dataHoraVenda + ", valorDesconto=" + valorDesconto + ", flagTipoDesconto=" + flagTipoDesconto + ", observacao=" + observacao + ", status=" + status + '}';
    }
}
