import java.util.ArrayList;
import java.util.Random;

public class Computador {
    protected String id;
    protected int ram;
    protected int armDisco;
    protected float cpu;
    protected String arq; // Arquitetura aleatória
    protected String nivel;

    public Computador(String id, int ram, int armDisco, float cpu, String nivel) {
        this.id = id;
        this.ram = ram;
        this.armDisco = armDisco;
        this.cpu = cpu;
        this.arq = gerarArquiteturaAleatoria(); // Geração aleatória de arquitetura
        this.nivel = nivel;
    }

    // Método para gerar uma arquitetura aleatória ("x64" ou "ARM")
    private String gerarArquiteturaAleatoria() {
        return new Random().nextBoolean() ? "x64" : "ARM";
    }

    public String getArq() {
        return arq;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, RAM: %dGB, Disco: %dGB, CPU: %.1fGHz, Nível: %s, Arquitetura: %s",
                id, ram, armDisco, cpu, nivel, arq);
    }

    // Método de cálculo de consumo energético (pode ser sobrescrito nas subclasses)
    public double calcularConsumoEnergetico() {
        return 0; // Valor padrão, será sobrescrito nas subclasses
    }
}
