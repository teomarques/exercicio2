import java.util.Random;

public class RaspberryPi extends Computador {

    // Construtor com parâmetros
    public RaspberryPi(String id, int ram, int disco, float cpu) {
        super(id, ram, disco, cpu, "ARM");
    }

    // Método para calcular o consumo energético do Raspberry Pi
    @Override
    public double calcularConsumoEnergetico() {
        return 20 * cpu;
    }
}
