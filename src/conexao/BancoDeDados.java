/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Mateus Kurten
 */
public class BancoDeDados {
    public static void inserirQuery(String query){
        Conexao CON = new Conexao();
        CON.Conectar();
        
        try{
            PreparedStatement stmt = CON.con.prepareStatement(query);
            
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0){
                System.out.println("A operação foi um sucesso!");
            }
            CON.con.close();
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Deu erro!");
            throw new RuntimeException(e);
        }
    }
}
