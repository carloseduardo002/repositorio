public class Main {
    public static void main(String[] args) {
        ConfraternizacaoNatal confraternizacao = new ConfraternizacaoNatal();
        //nossos nomes e sobrenomes como exemplo//
        Funcionario funcionario1 = new Funcionario("Carlos", 16375, "Vendas");
        Funcionario funcionario2 = new Funcionario("Pablo", 27353, "Marketing");
        Gerente gerente1 = new Gerente("Eduardo", 34242, "Vendas", "Equipe de Vendas");
        Gerente gerente2 = new Gerente("Oliveira", 4, "Marketing", "Equipe de Marketing");

        confraternizacao.adicionaFuncionario(funcionario1);
        confraternizacao.adicionaFuncionario(funcionario2);
        confraternizacao.adicionaFuncionario(gerente1);
        confraternizacao.adicionaFuncionario(gerente2);
        confraternizacao.removaFuncionario(funcionario2);
        confraternizacao.removaFuncionario(gerente1);


        System.out.println("Participantes da confraternização:");
        for (Funcionario funcionario : confraternizacao.getListaFuncionarios()) {
            System.out.println(funcionario.toString());
        }
    }
}