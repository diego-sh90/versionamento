package appheranca;

public class Gerente extends Funcionario{
    private String Departamente;

    public Gerente(String departamente, double salario, int matricula, String nome, int idade) {
        super(salario, matricula, nome, idade);
         this.Departamente = departamente;
    }
   
}
