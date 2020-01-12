/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablet;

import javax.swing.JOptionPane;
import conexao.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    
    protected static double calcularValorIndividual(String idIntegrante) throws SQLException{
        Conexao CON = new Conexao();
        CON.Conectar();
        double valor = 0;
        PreparedStatement stmtPedidos1 = CON.con.prepareStatement("select i.nome, c.descricao, c.preco, p.qtd from integrantes i,"
                                                        + " pedidos p, cardapio c\n" +
                                                        "where i.idIntegrante = " + idIntegrante + " and"
                                                        + " p.idIntegrante = " + idIntegrante + " and\n" +
                                                        "c.idItem = p.idItem;");
        ResultSet rsPedidos1 = stmtPedidos1.executeQuery();
        while (rsPedidos1.next()){
            valor += Double.parseDouble(rsPedidos1.getString("preco")) * Integer.parseInt(rsPedidos1.getString("qtd"));
        }
        CON.con.close();
        return valor;
    }
    
    protected static void incluirPedido(int idIntegrante, int idItem, int qtd){
        BancoDeDados.inserirQuery("INSERT INTO pedidos(idIntegrante, idItem, qtd) VALUES (\'" + idIntegrante +
                "\', \'" + idItem + "\', " + qtd + ")");
    }
}
