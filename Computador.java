public class Computador {
    protected String id;
    protected int ram;
    protected int armDisco;
    protected float cpu;
    protected String arq;
    protected String nivel;

    public Computador(String id, int ram, int armDisco, float cpu, String arq, String nivel) {
        this.id = id;
        this.ram = ram;
        this.armDisco = armDisco;
        this.cpu = cpu;
        setArq(arq);
        this.nivel = nivel;
    }

    // Método para definir a arquitetura, aceitando apenas "x64" ou "ARM"
    public void setArq(String arq) {
        if (!arq.equals("x64") && !arq.equals("ARM")) {
            throw new IllegalArgumentException("A arquitetura só pode ser x64 ou ARM.");
        }
        this.arq = arq;
    }

    public String getArq() {
        return arq;
    }

    public String getId() {
        return id;
    }

    // Método para exibir informações do computador
    @Override
    public String toString() {
        return String.format("ID: %s, RAM: %dGB, Disco: %dGB, CPU: %.1fGHz, Nível: %s, Arquitetura: %s",
                id, ram, armDisco, cpu, nivel, arq);
    }

    // Método polimórfico de cálculo de consumo energético (sobrescrito nas subclasses)
    public double calcularConsumoEnergetico() {
        return 0; // valor padrão, será sobrescrito nas subclasses
    }
}
