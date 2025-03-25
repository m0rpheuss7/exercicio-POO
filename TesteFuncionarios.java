public class TesteFuncionarios {
    public static void main(String[] args) {

        //Apresentar as informações do funcionário
        Funcionarios f1 = new Funcionarios();
        f1.nome = "João";
        f1.salario = 1000;
        f1.nivel = 'T';
        f1.afastado = false;
        f1.apresentarFuncionario();
        
        //Verificar se o funcionário está afastado
        if (f1.afastado == true) {
        System.out.println("Funcionário afastado");
        } else {
        System.out.println("Funcionário não afastado");
        }
        
        //Faltas
       

    }
}
