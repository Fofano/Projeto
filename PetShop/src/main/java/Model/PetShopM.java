package Model;
public class PetShopM {
    private String Nome;
    private String Endereco;
    private String Filiacao;

    public PetShopM(String Nome, String Endereco, String Filiacao) {
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Filiacao = Filiacao;
    }

    public PetShopM() {
        this.Nome = null;
        this.Endereco = null;
        this.Filiacao = null;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getFiliacao() {
        return Filiacao;
    }

    public void setFiliacao(String Filiacao) {
        this.Filiacao = Filiacao;
    }

    public String getCpf() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNumero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPet() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
