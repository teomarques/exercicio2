public class Laptop extends Computador {
    private boolean hasGPU;

    public Laptop(String id, boolean hasGPU, int ram, int disco, float cpu) {
        super(id, ram, disco, cpu, "Edge");
        this.hasGPU = hasGPU;
    }

    @Override
    public double calcularConsumoEnergetico() {
        return hasGPU ? 50 * cpu * 1.2 : 50 * cpu;
    }
}