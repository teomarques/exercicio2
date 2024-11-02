public abstract class Computador {
    protected String id;
    protected int ram;
    protected int armDisco;
    protected float cpu;
    protected String arq;

    // Construtor da classe
    public Computador(String id, int ram, int armDisco, float cpu, String arq) {
        this.id = id;
        this.ram = ram;
        this.armDisco = armDisco;
        this.cpu = cpu;
        setArq(arq);
    }

    // Método abstrato para cálculo de consumo energético
    public abstract double calcularConsumoEnergetico();

    // Getter e setter para arq
    public String getArq() {
        return arq;
    }

    public void setArq(String arq) {
        if (!arq.equals("x64") && !arq.equals("ARM")) {
            throw new IllegalArgumentException("A arquitetura só pode ser x64 ou ARM.");
        }
        this.arq = arq;
    }

    // Getter para id
    public String getId() {
        return id;
    }

    // Método para exibir informações do computador
    @Override
    public String toString() {
        return String.format("ID: %s, RAM: %dGB, Disco: %dGB, CPU: %.1fGHz, Arquitetura: %s",
                id, ram, armDisco, cpu, arq);
    }
}
