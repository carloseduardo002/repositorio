public class Gerente extends Funcionario {
    private String equipe;

    public Gerente(String nome, int id, String departamento, String equipe) {
        super(nome, id, departamento);
        this.equipe = equipe;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return super.toString() + ", equipe=" + equipe;
    }
}