package DAO;

import Conexao.ConexaoD;
import Model.AnimalM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoDoAnimal {
                 public void ConexaoDoAnimal(){
         
     }
    public void ConexaoDoAnimal(AnimalM a){
     try {
            String SQL="INSERT INTO ana_clara_rodrigues.Animal (Nome, Proprietario, Especie, Raca, Idade, Obcervacao)VALUES(?,?,?,?,?,?)";
            Connection minhaco= ConexaoD.getConexao();
            PreparedStatement comando=minhaco.prepareStatement(SQL);
            comando.setString(1, a.getNome());
            comando.setString(2, a.getProprietario());
            comando.setString(3, a.getEspecie());
            comando.setString(4, a.getRaca());
            comando.setString(5, a.getIdade());
            comando.setString(6, a.getObcervacao());
            int retorno=comando.executeUpdate();
            minhaco.close();
            if(retorno>0){
               JOptionPane.showMessageDialog(null,"Animal "+a.getNome()+" inserido com sucesso.");
            }else{
                JOptionPane.showMessageDialog(null,"erro no cadastro "+a.getNome());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoDoAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public List <AnimalM> listaDePetShop(){
        try {
            String SQL="SELECT Nome, Endereco,Filiacao FROM ana_clara_rodrigues.PetShop";
            List <AnimalM>listaDeAnimal = new ArrayList<AnimalM>();
            Connection c =ConexaoD.getConexao();
            PreparedStatement ps=c.prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                AnimalM atual = new AnimalM();
                atual = this.pegaDados(resultado);
                listaDeAnimal.add(atual);
            }
            
            return listaDeAnimal;
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoDoPetShop.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    private AnimalM pegaDados(ResultSet resultado){
        try {
            AnimalM atual=new AnimalM();
            atual.setNome(resultado.getString("Nome"));
            atual.setProprietario(resultado.getString("Proprietario"));
            atual.setRaca(resultado.getString("Raca"));
            atual.setEspecie(resultado.getString("Especie"));
            atual.setIdade(resultado.getString("Idade"));
            atual.setObcervacao(resultado.getString("Obcervacao"));
            return atual;
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoDoPetShop.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
