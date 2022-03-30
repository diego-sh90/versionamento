package appheranca;

public class Funcionario extends Pessoa{
    private double Salario;

    public Funcionario(double salario, int matricula, String nome, int idade) {
        super(matricula, nome, idade);
        this.Salario = salario;
        
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    
}
