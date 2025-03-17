public class Funcionario{
    private String nome;
    private int inscricao;
    private double salario;
    private String turno;
    public Funcionario(String nome, int inscricao, double salario, String turno){
        this.nome = nome;
        this.inscricao = inscricao;
        this.salario = salario;
        this.turno = turno;
    }
void horariosDisponiveis(){
    System.out.println("horarios disponiveis são manhã e tarde");
}
void horarioTrabalho(){
    System.out.println("Escolha seu horário: ");
    System.out.println("1. Manhã");
    System.out.println("2. Tarde");
    
}
void funcaoDesempenhar(){
    System.out.println("Seu desempenho: ");
    
}
}