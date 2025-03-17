public class Secretario extends Funcionario{
        public Secretario(String nome, int inscricao, double salario, String turno){
        super(nome, inscricao, salario, turno); 
    }
    void receberEcomenda(){
        System.out.println("Lembrar de receber encomendas");
    }
    void receberPagamentos(){
        System.out.println("Lmenrar de receber pagamentos");
    }
    @Override
    void funcaoDesempenhar(){
        System.out.println("É ótimo");
    }
}