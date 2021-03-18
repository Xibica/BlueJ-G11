class Grupo {
   public static void main(String[] args) {
       EmanuellePassos integranteEmanuelle = new EmanuellePassos();

       System.out.println("Integrantes: ");
   }
   String listaMembros(EmanuellePassos integranteEmanuelle) {
       integranteEmanuelle.nome = "Emanuelle";
       integranteEmanuelle.sobrenome = "Passos Martins";
       
       System.out.println("Integrantes: ");
       return integranteEmanuelle.nomeCompleto();
   }
}
