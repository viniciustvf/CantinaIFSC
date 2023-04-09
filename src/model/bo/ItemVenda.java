
package model.bo;


public class ItemVenda {
    
    private int id;
    private float qtdProduto;
    private float valorUnitario;
    private char status;

    public ItemVenda() {
    }

    public ItemVenda(int id, float qtdProduto, float valorUnitario, char status) {
        this.id = id;
        this.qtdProduto = qtdProduto;
        this.valorUnitario = valorUnitario;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(float qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ItemVenda{" + "id=" + id + ", qtdProduto=" + qtdProduto + ", valorUnitario=" + valorUnitario + ", status=" + status + '}';
    } 
}