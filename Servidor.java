import java.util.Random;

public class Servidor extends Computador {

    // Construtor com parâmetros e validação
    public Servidor(String id, int ram, int disco, float cpu) {
        super(id, ram, disco, cpu, "x64");

        if (ram < 128 || ram > 512) {
            throw new IllegalArgumentException("A RAM do servidor deve estar entre 128 e 512 GB.");
        }
        if (disco < 1024 || disco > 16384) {
            throw new IllegalArgumentException("O disco deve estar entre 1024 e 16384 GB.");
        }
        if (cpu < 3.0f || cpu > 4.0f) {
            throw new IllegalArgumentException("A CPU deve estar entre 3.0 e 4.0 GHz.");
        }
    }

    // Método para calcular o consumo energético do Servidor
    @Override
    public double calcularConsumoEnergetico() {
        return 80 * cpu;
    }
}
