package DAO;

import Conexao.ConexaoD;
import Model.PetShopM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoDoPetShop {
             public void ConexaoDoPetShop(){
         
     }
    public void ConexaoDoPetShop(PetShopM a){
     try {
            String SQL="INSERT INTO ana_clara_rodrigues.PetShop (Nome, Endereco,Filiacao)VALUES(?,?,?)";
            Connection minhaco= ConexaoD.getConexao();
            PreparedStatement comando=minhaco.prepareStatement(SQL);
            comando.setString(1, a.getNome());
            comando.setString(2, a.getEndereco());
            comando.setString(3, a.getFiliacao());
            int retorno=comando.executeUpdate();
            minhaco.close();
            if(retorno>0){
               JOptionPane.showMessageDialog(null,"PetShop "+a.getNome()+" inserido com sucesso.");
            }else{
                JOptionPane.showMessageDialog(null,"erro no cadastro "+a.getNome());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoDoPetShop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public List <PetShopM> listaDePetShop(){
        try {
            String SQL="SELECT Nome, Endereco,Filiacao FROM ana_clara_rodrigues.PetShop";
            List <PetShopM>listaDePetShop = new ArrayList<PetShopM>();
            Connection c =ConexaoD.getConexao();
            PreparedStatement ps=c.prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                PetShopM atual = new PetShopM();
                atual = this.pegaDados(resultado);
                listaDePetShop.add(atual);
            }
            
            return listaDePetShop;
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoDoPetShop.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    private PetShopM pegaDados(ResultSet resultado){
        try {
            PetShopM atual=new PetShopM();
            atual.setNome(resultado.getString("Nome"));
            atual.setEndereco(resultado.getString("Endereco"));
            atual.setFiliacao(resultado.getString("Filiacao"));
            return atual;
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoDoPetShop.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
