import java.util.Random;

public class Laptop extends Computador {
    private boolean hasGPU;

    // Construtor com parâmetros
    public Laptop(String id, boolean hasGPU, int ram, int disco, float cpu) {
        super(id, ram, disco, cpu, "x64");
        this.hasGPU = hasGPU;
    }

    // Método para calcular o consumo energético do Laptop
    @Override
    public double calcularConsumoEnergetico() {
        return hasGPU ? 50 * cpu * 1.2 : 50 * cpu;
    }
}
