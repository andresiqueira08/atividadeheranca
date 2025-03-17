public class Coordenador extends Funcionario{
        public Coordenador(String nome, int inscricao, double salario, String turno){
        super(nome, inscricao, salario, turno); 
    }
    void auxiliarProfessores(){
        System.out.println("Avisa-los da reunião");
    }
    void organizarFestivais(){
        System.out.println("Organizar reuniões do festival");
    }
    @Override
    void funcaoDesempenhar(){
    System.out.println("É bom");
    
}
}