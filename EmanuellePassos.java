public class EmanuellePassos
{
   String nome;
   String sobrenome;
   int semestre;
   
   String nomeCompleto() {
       String nomeCompleto = nome + " " + sobrenome;
       return nomeCompleto;
   }
   int getSemestre() {
       return semestre;
   }
}
