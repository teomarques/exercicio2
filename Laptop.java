/**
 * Classe Laptop herda classe Computadores
 * @author Miguel Quaresma
 * @author Teodoro Marques
 * @version 1.0
 */
public class Laptop extends Computador {
    private boolean hasGPU;

    /**
     * Método Construtor Laptop para a classe Laptop
     * @param id
     * @param hasGPU
     * @param ram
     * @param disco
     * @param cpu
     */
    public Laptop(String id, boolean hasGPU, int ram, int disco, float cpu) {
        super(id, ram, disco, cpu, "Edge");
        this.hasGPU = hasGPU;
    }

    /**
     * Método que avalia consumo energético do Laptop
     * @return
     */
    @Override
    public double calcularConsumoEnergetico() {
        return hasGPU ? 50 * cpu * 1.2 : 50 * cpu;
    }
}
