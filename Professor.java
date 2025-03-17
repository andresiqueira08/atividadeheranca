public class Professor extends Funcionario{
        public Professor(String nome, int inscricao, double salario, String turno){
        super(nome, inscricao, salario, turno); 
    }
    private String disciplina;
    void lecionar(){
        System.out.println("Organizar próxima aula");
    }
    void criarAtividade(){
        System.out.println("Criar apostila de atividade");
    }
    @Override
    void funcaoDesempenhar(){
        System.out.println("É perfeito");
    }
}