package Model;
public class AnimalM {
    private String Nome;
    private String Proprietario;
    private String Especie;
    private String Raca;
    private String Idade;
    private String Obcervacao;

    public AnimalM(String Nome, String Proprietario, String Especie, String Raca, String Idade, String Obcervacao) {
        this.Nome = Nome;
        this.Proprietario = Proprietario;
        this.Especie = Especie;
        this.Raca = Raca;
        this.Idade = Idade;
        this.Obcervacao = Obcervacao;
    }

    public AnimalM() {
        this.Nome = null;
        this.Proprietario = null;
        this.Especie = null;
        this.Raca = null;
        this.Idade = null;
        this.Obcervacao = null;
    }

    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getProprietario() {
        return Proprietario;
    }

    public void setProprietario(String Proprietario) {
        this.Proprietario = Proprietario;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String Raca) {
        this.Raca = Raca;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String Idade) {
        this.Idade = Idade;
    }

    public String getObcervacao() {
        return Obcervacao;
    }

    public void setObcervacao(String Obcervacao) {
        this.Obcervacao = Obcervacao;
    }
 
}
