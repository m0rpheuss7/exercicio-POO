import java.util.List;

public class Funcionarios {
    // Atributos encapsulados
    private String nome;
    private double salario;
    private char nivel; // T - Trainee; J - Júnior; P - Pleno; S - Sênior.
    private boolean afastado;
    private int faltas; // Para registrar faltas
    private int horasExtras; // Para registrar horas extras

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public char getNivel() {
        return nivel;
    }

    public void setNivel(char nivel) {
        this.nivel = nivel;
    }

    public boolean isAfastado() {
        return afastado;
    }

    public void setAfastado(boolean afastado) {
        this.afastado = afastado;
    }

    public int getFaltas() {
        return faltas;
    }

    public void registrarFalta() {
        this.faltas++;
    }

    public void registrarFalta(int quantidade) {
        if (quantidade > 0) {
            this.faltas += quantidade;
        }
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void registrarHorasExtras(int quantidade) {
        if (quantidade > 0) {
            this.horasExtras += quantidade;
        }
    }

    // Método para calcular o bônus
    public double calcularBonus() {
        return horasExtras * (salario * 0.10); // Cada hora extra adiciona 10% do salário
    }

    // Método para calcular o desconto
    public double calcularDesconto() {
        if (afastado) {
            return 0; // Sem desconto para funcionários afastados
        }
        return faltas * (salario * 0.10); // Cada falta desconta 10% do salário
    }

    // Método para calcular o salário final
    public double calcularSalarioFinal() {
        double bonus = calcularBonus();
        double desconto = calcularDesconto();
        return salario + bonus - desconto;
    }

    // Método para apresentar informações do funcionário
    public void apresentarFuncionario() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário base: R$" + salario);
        System.out.println("Nível: " + nivel);
        System.out.println("Afastado: " + (afastado ? "Sim" : "Não"));
        System.out.println("Faltas: " + faltas);
        System.out.println("Horas extras: " + horasExtras + " horas");
        System.out.println("Bônus: R$" + calcularBonus());
        System.out.println("Desconto: R$" + calcularDesconto());
        System.out.println("Salário final: R$" + calcularSalarioFinal());
    }

    // Exibir descontos (faltas)
    public static void exibirDescontos(List<Funcionarios> listaFuncionarios) {
        System.out.println("\n--- Descontos (Faltas) ---");
        for (Funcionarios f : listaFuncionarios) {
            if (f.isAfastado()) {
                System.out.println(f.getNome() + ": Sem desconto pois está afastado.");
            } else if (f.getFaltas() > 0) {
                System.out.println(f.getNome() + ": " + f.getFaltas() + " falta(s), Desconto: R$" + f.calcularDesconto());
            } else {
                System.out.println(f.getNome() + ": Sem faltas, Sem desconto.");
            }
        }
    }
}
