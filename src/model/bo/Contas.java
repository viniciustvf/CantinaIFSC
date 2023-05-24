
package model.bo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Contas {
    
    private int id;
    private LocalDateTime dataHoraEmissao;
    private LocalDate dataVencimento;
    private LocalDate dataQuitacao;
    private float valorEmitido;
    private Double valorDesconto;
    private Double valorAcrescimo;
    private Double valorQuitado;
    private String observacao;
    private char flagTipoConta;
    private char status;

    public Contas() {
    }

    public Contas(int id, LocalDateTime dataHoraEmissao, LocalDate dataVencimento, LocalDate dataQuitacao, float valorEmitido, Double valorDesconto, Double valorAcrescimo, Double valorQuitado, String observacao, char flagTipoConta, char status) {
        this.id = id;
        this.dataHoraEmissao = dataHoraEmissao;
        this.dataVencimento = dataVencimento;
        this.dataQuitacao = dataQuitacao;
        this.valorEmitido = valorEmitido;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.valorQuitado = valorQuitado;
        this.observacao = observacao;
        this.flagTipoConta = flagTipoConta;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataHoraEmissao() {
        return dataHoraEmissao;
    }

    public void setDataHoraEmissao(LocalDateTime dataHoraEmissao) {
        this.dataHoraEmissao = dataHoraEmissao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public LocalDate getDataQuitacao() {
        return dataQuitacao;
    }

    public void setDataQuitacao(LocalDate dataQuitacao) {
        this.dataQuitacao = dataQuitacao;
    }

    public float getValorEmitido() {
        return valorEmitido;
    }

    public void setValorEmitido(float valorEmitido) {
        this.valorEmitido = valorEmitido;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Double getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(Double valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public Double getValorQuitado() {
        return valorQuitado;
    }

    public void setValorQuitado(Double valorQuitado) {
        this.valorQuitado = valorQuitado;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public char getFlagTipoConta() {
        return flagTipoConta;
    }

    public void setFlagTipoConta(char flagTipoConta) {
        this.flagTipoConta = flagTipoConta;
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
                + this.getDataHoraEmissao() + ", "
                + this.getDataQuitacao() + ", "
                + this.getDataVencimento() + ", "
                + this.getFlagTipoConta() + ", "
                + this.getValorAcrescimo() + ", "
                + this.getValorDesconto() + ", "
                + this.getValorEmitido() + ", "
                + this.getValorQuitado() + ", "
                + this.getStatus();
    }
}
