public class Funcionario {
    private String nome;
    private int id;
    private String departamento;

    public Funcionario(String nome, int id, String departamento) {
        this.nome = nome;
        this.id = id;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", id=" + id + ", departamento=" + departamento + "]";
    }
}