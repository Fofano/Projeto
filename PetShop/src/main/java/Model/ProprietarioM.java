package Model;
public class ProprietarioM {
    private String Cpf;
    private String Nome;
    private String Endereco;
    private String Numero;
    private String Pet;

    public ProprietarioM(String Cpf, String Nome, String Endereco, String Numero, String Pet) {
        this.Cpf = Cpf;
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.Numero = Numero;
        this.Pet = Pet;
    }

    public ProprietarioM() {
        this.Cpf = null;
        this.Nome = null;
        this.Endereco = null;
        this.Numero = null;
        this.Pet = null;
    }
    

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
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

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getPet() {
        return Pet;
    }

    public void setPet(String Pet) {
        this.Pet = Pet;
    }
    
}
