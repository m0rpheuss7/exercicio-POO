import java.util.ArrayList;

public class TesteFuncionarios {
    public static void main(String[] args) {
        // Criar uma lista para armazenar vários funcionários
        ArrayList<Funcionarios> listaFuncionarios = new ArrayList<>();

        // Criar e adicionar funcionários à lista
        Funcionarios f1 = new Funcionarios();
        f1.setNome("João");
        f1.setSalario(1500);
        f1.setNivel('T');
        f1.setAfastado(false);
        f1.registrarFalta(0);
        f1.registrarHorasExtras(5);
        listaFuncionarios.add(f1);

        Funcionarios f2 = new Funcionarios();
        f2.setNome("Maria");
        f2.setSalario(5000);
        f2.setNivel('P');
        f2.setAfastado(true);
        f2.registrarFalta(2); // Não terá desconto pois está afastada
        f2.registrarHorasExtras(3);
        listaFuncionarios.add(f2);

        Funcionarios f3 = new Funcionarios();
        f3.setNome("Augusto");
        f3.setSalario(1500);
        f3.setNivel('T');
        f3.setAfastado(false);
        f3.registrarFalta(0);
        f3.registrarHorasExtras(7);
        listaFuncionarios.add(f3);

        Funcionarios f4 = new Funcionarios();
        f4.setNome("Fabrício");
        f4.setSalario(8000);
        f4.setNivel('S');
        f4.setAfastado(false);
        f4.registrarFalta(3);
        f4.registrarHorasExtras(3);
        listaFuncionarios.add(f4);

        Funcionarios f5 = new Funcionarios();
        f5.setNome("Julia");
        f5.setSalario(3000);
        f5.setNivel('J');
        f5.setAfastado(false);
        f5.registrarFalta(1);
        f5.registrarHorasExtras(3);
        listaFuncionarios.add(f5);

        // Exibir informações organizadas
        System.out.println("=== Informações dos Funcionários ===");

        // Exibir salários
        System.out.println("\n--- Salários ---");
        for (Funcionarios f : listaFuncionarios) {
            System.out.println(f.getNome() + ": R$" + f.getSalario());
        }

        // Exibir bônus (horas extras)
        System.out.println("\n--- Bônus (Horas Extras) ---");
        for (Funcionarios f : listaFuncionarios) {
            System.out.println(f.getNome() + ": " + f.getHorasExtras() + " horas extras, Bônus: R$" + f.calcularBonus());
        }

        // Exibir descontos (faltas)
        Funcionarios.exibirDescontos(listaFuncionarios);

        // Exibir funcionários afastados
        System.out.println("\n--- Funcionários Afastados ---");
        for (Funcionarios f : listaFuncionarios) {
            if (f.isAfastado()) {
                System.out.println(f.getNome() + " está afastado.");
            }
        }

        // Exibir salário final
        System.out.println("\n--- Salário Final ---");
        for (Funcionarios f : listaFuncionarios) {
            if (f.isAfastado()) {
                System.out.println(f.getNome() + ": Salário Final: R$" + f.calcularSalarioFinal() + " (Sem desconto pois foi afastada)");
            } else {
                System.out.println(f.getNome() + ": Salário Final: R$" + f.calcularSalarioFinal());
            }
        }
    }
}
