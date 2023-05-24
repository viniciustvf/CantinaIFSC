package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.cadastro.TelaCadastroBairro;

public class ControllerCadastroBairro implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    TelaCadastroBairro telaCadastroBairro;

    //Passando a tela que iremos controlar como parametro de invoca��o
    public ControllerCadastroBairro(TelaCadastroBairro telaCadastroBairro) {
        //Repassando o valor(tela) do par�metro para o objeto global
        this.telaCadastroBairro = telaCadastroBairro;

        //Adicionando ouvintes(Listeners) para escutar a��es nos bot�es da tela
        this.telaCadastroBairro.getjBNovo().addActionListener(this);
        this.telaCadastroBairro.getjBSair().addActionListener(this);
        this.telaCadastroBairro.getjBCancelar().addActionListener(this);
        this.telaCadastroBairro.getjBGravar().addActionListener(this);
        this.telaCadastroBairro.getjBBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

}
