public class BiancaCarvalho
{
    String nome = "Bianca", sobrenome = "Carvalho";
    int semestre = 2;
    
    public String nomeCompleto () {
        String nomeCompleto = this.nome + " " + this.sobrenome;
        return nomeCompleto;
    }
    
    int getSemestre() {
        return this.semestre;
    }
}