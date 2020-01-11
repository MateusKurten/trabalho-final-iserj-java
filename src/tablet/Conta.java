/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablet;

import javax.swing.JOptionPane;
import conexao.*;

/**
 *
 * @author Mateus Kurten
 */
public class Conta {
    
    protected static void abrirConta(){ //Cria a tabela conta e integrantes no banco de dados
        String nome;
        int qtd;
        BancoDeDados.inserirQuery("CREATE TABLE integrantes(idIntegrante int primary key not null auto_increment, nome varchar(255))");
        BancoDeDados.inserirQuery("CREATE TABLE conta(idIntegrante INT, pedido VARCHAR(255), qtd INT, preco FLOAT)");
        //Adicionando relacionamento
        BancoDeDados.inserirQuery("ALTER TABLE conta ADD CONSTRAINT idIntegrante FOREIGN KEY (idIntegrante) REFERENCES integrantes(idIntegrante);");
        //Definindo e processando a quantidade de pessoas na mesa
        do{
            qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de integrantes da mesa"));
            if (qtd < 1 || qtd > 6){ //Numero máximo de pessoas na mesa: 6
                JOptionPane.showMessageDialog(null, "Informe um número entre 1 e 6");
            }
        }while (qtd < 1 || qtd > 6);
        for (int i = 0; i<qtd; i++){
            do{
               nome = JOptionPane.showInputDialog("Informe o nome do integrante " + (i + 1));
               if (nome.isEmpty()){
                   JOptionPane.showMessageDialog(null, "Informe um nome válido");
               }
            }while(nome.isEmpty());
            BancoDeDados.inserirQuery("Insert into integrantes(nome) values (\"" + nome + "\");");
        }
    }
    
    protected void incluirPedido(String nome, String pedido, int qtd, double preco){
        BancoDeDados.inserirQuery("INSERT INTO conta(idIntegrante, pedido, qtd, preco) VALUES (\'" + nome +
                "\', \'" + pedido + "\', " + qtd + ", " + preco + ")");
    }
}
