package DAO;

import Conexao.ConexaoD;
import Model.ProprietarioM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoDoProprietario {
                 public void ConexaoDoProprietario(){
         
     }
    public void ConexaoDoProprietario(ProprietarioM a){
     try {
            String SQL="INSERT INTO ana_clara_rodrigues.Proprietario (Cpf, Nome, Endereco, Numero, Pet)VALUES(?,?,?,?,?)";
            Connection minhaco= ConexaoD.getConexao();
            PreparedStatement comando=minhaco.prepareStatement(SQL);
            comando.setString(1, a.getCpf());
            comando.setString(2, a.getNome());
            comando.setString(3, a.getEndereco());
            comando.setString(4, a.getNumero());
            comando.setString(5, a.getPet());
            int retorno=comando.executeUpdate();
            minhaco.close();
            if(retorno>0){
               JOptionPane.showMessageDialog(null,"Proprietario "+a.getNome()+" inserido com sucesso.");
            }else{
                JOptionPane.showMessageDialog(null,"erro no cadastro "+a.getNome());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoDoPetShop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public List <ProprietarioM> listaDeProprietario(){
        try {
            String SQL="SELECT Nome, Endereco,Filiacao FROM ana_clara_rodrigues.Proprietario";
            List <ProprietarioM>listaDeProprietario = new ArrayList<ProprietarioM>();
            Connection c =ConexaoD.getConexao();
            PreparedStatement ps=c.prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                ProprietarioM atual = new ProprietarioM();
                atual = this.pegaDados(resultado);
                listaDeProprietario.add(atual);
            }
            
            return listaDeProprietario;
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoDoPetShop.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    private ProprietarioM pegaDados(ResultSet resultado){
        try {
            ProprietarioM atual=new ProprietarioM();
            atual.setCpf(resultado.getString("Cpf"));
            atual.setNome(resultado.getString("Nome"));
            atual.setEndereco(resultado.getString("Endereço"));
            atual.setNumero(resultado.getString("Numero"));
            atual.setPet(resultado.getString("Pet"));
            return atual;
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoDoProprietario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
