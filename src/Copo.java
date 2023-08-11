//classe copo
public class Copo {
    private double capacidade;

    // Getter para obter a capacidade do copo
    public double getCapacidade() {
        return capacidade;
    }

    // Setter para definir a capacidade do copo
    public void setCapacidade(double capacidade) {
        // Verifica se a capacidade é maior que zero antes de atribuir
        if (capacidade > 0) {
            this.capacidade = capacidade;
        } else {
            System.out.println("A capacidade deve ser maior que zero.");
        }
    }
    }