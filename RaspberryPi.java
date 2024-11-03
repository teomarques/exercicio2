public class RaspberryPi extends Computador {

    public RaspberryPi(String id, int ram, int disco, float cpu) {
        super(id, ram, disco, cpu, "ARM", "IoT");
    }

    @Override
    public double calcularConsumoEnergetico() {
        return 20 * cpu;
    }
}
