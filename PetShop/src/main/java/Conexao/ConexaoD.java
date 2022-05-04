package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 0057132
 */
public class ConexaoD {
        private static String url="jdbc:postgresql://200.18.128.54/aula";
    private static String usuario = "aula";
    private static String senha = "aula";
    private static Connection minhaCon=null;
    public static Connection getConexao(){
         try {
        if(ConexaoD.minhaCon==null){
          ConexaoD.minhaCon=DriverManager.getConnection(url, usuario, senha);
            } 
        return minhaCon;
         } catch (SQLException ex) {
                Logger.getLogger(ConexaoD.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("erro de conexão ao banco de dados"+ex.getMessage());
            }
        return null;
    }
}