import java.util.ArrayList;

public class ConfraternizacaoNatal {
    private ArrayList<Funcionario> listaFuncionarios;

    public ConfraternizacaoNatal() {
        this.listaFuncionarios = new ArrayList<>();
    }

    public void adicionaFuncionario(Funcionario funcionario) {
        this.listaFuncionarios.add(funcionario);
    }

    public void removaFuncionario(Funcionario funcionario) {
        this.listaFuncionarios.remove(funcionario);
    }

    public ArrayList<Funcionario> getListaFuncionarios() {
        return this.listaFuncionarios;
    }

    @Override
    public String toString() {
        return "ConfraternizacaoNatal [listaFuncionarios=" + listaFuncionarios + "]";
    }
}