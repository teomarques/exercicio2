import java.util.Random;

/**
 * Superclasse Computadores
 * @author Miguel Quaresma
 * @author Teodoro Marques
 * @version 1.0
 */
public class Computador {
    protected String id;
    protected int ram;
    protected int armDisco;
    protected float cpu;
    protected String arq; // Arquitetura aleatória
    protected String nivel;

    /**
     * Método construtor Computador para a classe Computador
     * @param id
     * @param ram
     * @param armDisco
     * @param cpu
     * @param arq
     * @param nivel
     */
    public Computador(String id, int ram, int armDisco, float cpu, String nivel) {
        this.id = id;
        this.ram = ram;
        this.armDisco = armDisco;
        this.cpu = cpu;
        this.arq = gerarArquiteturaAleatoria(); // Geração aleatória de arquitetura
        this.nivel = nivel;
    }

    /**
     * Método setter para a arquitetura, aceitando apenas "x64" ou "ARM"
     * @param arq
     * @return Random().nextBoolean() ? "x64" : "ARM"
     */
    private String gerarArquiteturaAleatoria() {
        return new Random().nextBoolean() ? "x64" : "ARM";
    }

    /**
     * Método getter para a arquitetura
     * @return arq
     */
    public String getArq() {
        return arq;
    }

    /**
     * Método getter para ID
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Método toString para exibir informações do computador
     * @return String.format("ID: %s, RAM: %dGB, Disco: %dGB, CPU: %.1fGHz, Nível: %s, Arquitetura: %s", id, ram, armDisco, cpu, nivel, arq)
     */
    @Override
    public String toString() {
        return String.format("ID: %s, RAM: %dGB, Disco: %dGB, CPU: %.1fGHz, Nível: %s, Arquitetura: %s",
                id, ram, armDisco, cpu, nivel, arq);
    }

    /**
     * Método polimórfico de cálculo de consumo energético (sobrescrito nas subclasses)
     * @return 0
     */
    public double calcularConsumoEnergetico() {
        return 0; // Valor padrão, será sobrescrito nas subclasses
    }
}
