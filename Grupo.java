class Grupo {
   public static void main(String[] args) {
       EmanuellePassos integranteEmanuelle = new EmanuellePassos();
       integranteEmanuelle.nome = "Emanuelle";
       integranteEmanuelle.sobrenome = "Passos Martins";

       System.out.println("Integrantes: ");
       System.out.println(integranteEmanuelle.nomeCompleto());
   }
}
