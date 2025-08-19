package app;

public class PrimeiroAluno {
   public static void main (String [] args) {
      Aluno a1 = new Aluno();
      a1.nome = "Lysis";
      a1.idade = 22;

      Aluno a2 = a1;
      a2.nome = "José";

      System.out.println("[A1]");
      System.out.println("nome = " + a1.nome);
      System.out.println("idade = " + a1.idade);

      System.out.println("[A2]");
      System.out.println("nome = " + a2.nome);
      System.out.println("idade = " + a2.idade);
      
   } 
}
