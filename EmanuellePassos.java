public class EmanuellePassos
{
   String nome;
   String sobrenome;
   int semestre;
   
   String nomeCompleto() {
       String nomeCompleto = this.nome + " " + this.sobrenome;
       return nomeCompleto;
   }
   int getSemestre() {
       return semestre;
   }
}
