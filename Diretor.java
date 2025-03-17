public class Diretor extends Funcionario {
    private String segTurno;

    public Diretor(String nome, int inscricao, double salario, String turno) {
        super(nome, inscricao, salario, turno);
    }

    double criarDesconto() {
        double valor = 150;
        System.out.println("O desconto é de " + valor);
        return valor;
    }

    void encomendarFardas() {
        System.out.println("Fardas encomendadas");
    }

    void gerenciarProfessores() {
        System.out.println("Reunião marcada");
    }

    @Override
    void funcaoDesempenhar() {
        System.out.println("É ok!");
    }
}