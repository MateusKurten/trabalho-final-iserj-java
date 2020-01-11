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
        BancoDeDados.inserirQuery("CREATE TABLE pedidos(idIntegrante INT, idItem INT, qtd INT)");
        //Adicionando relacionamento
        BancoDeDados.inserirQuery("ALTER TABLE pedidos ADD CONSTRAINT idIntegrante FOREIGN KEY (idIntegrante) REFERENCES integrantes(idIntegrante);");
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
    
    protected static void incluirPedido(int idIntegrante, int idItem, int qtd){
        BancoDeDados.inserirQuery("INSERT INTO pedidos(idIntegrante, idItem, qtd) VALUES (\'" + idIntegrante +
                "\', \'" + idItem + "\', " + qtd + ")");
    }
}
