package appheranca;

public class Cliente extends Pessoa{
    private float planoConta;

    public Cliente(float planoconta, int matricula, String nome, int idade) {
        super(matricula, nome, idade);
        this.planoConta = planoconta;
    }

    public float getPlanoConta() {
        return planoConta;
    }

    public void setPlanoConta(float planoConta) {
        this.planoConta = planoConta;
    }
    
}
