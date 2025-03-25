public class Funcionarios { 
//Atributos
 String nome;
 double salario;
 char nivel; // T - Trainee; J - Júnior; P - Pleno; S - Sênior.
 boolean afastado;

 //Métodos
 public void apresentarFuncionario(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Nível: " + nivel);
        System.out.println("Afastado: " + afastado);
    }

}
