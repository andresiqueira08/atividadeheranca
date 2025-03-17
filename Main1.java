public class Main1 {
    public static void main(String args[]) {
        Funcionario[] f = new Funcionario[4];
        f[0] = new Diretor("João", 278, 1700, "Manhã");
        f[1] = new Coordenador("Marcos", 279, 1800, "Manhã");
        f[2] = new Professor("André", 280, 1500, "Tarde");
        f[3] = new Secretario("Quirino", 281, 1400, "Tarde");
        for (int i = 0; i < 4; i++) {
            f[i].funcaoDesempenhar();
        }
    }
}