import java.util.ArrayList;
import java.util.Random;

public class NCSLab {
    private ArrayList<Computador> computadores;

    public NCSLab() {
        computadores = new ArrayList<>();
        inicializarComputadores();
    }

    private void inicializarComputadores() {
        Random random = new Random();

        // Adiciona 5 servidores
        for (int i = 0; i < 5; i++) {
            computadores.add(new Servidor("S" + i, gerarRamServidor(), gerarDiscoServidor(), gerarCpuServidor(random)));
        }

        // Adiciona 5 laptops com GPU aleatório
        for (int i = 0; i < 5; i++) {
            computadores.add(new Laptop("L" + i, random.nextBoolean(), gerarRamLaptop(), gerarDiscoLaptop(), gerarCpuLaptop(random)));
        }

        // Adiciona 5 Raspberry Pis
        for (int i = 0; i < 5; i++) {
            computadores.add(new RaspberryPi("R" + i, gerarRamRaspberry(), gerarDiscoRaspberry(), gerarCpuRaspberry(random)));
        }
    }

    // Métodos para geração de valores conforme especificado (sem variáveis estáticas)
    private int gerarRamServidor() {
        int[] opcoesRAM = {128, 256, 512};
        return opcoesRAM[new Random().nextInt(opcoesRAM.length)];
    }

    private int gerarDiscoServidor() {
        int[] opcoesDisco = {1024, 2048, 4096, 8192, 16384};
        return opcoesDisco[new Random().nextInt(opcoesDisco.length)];
    }

    private float gerarCpuServidor(Random random) {
        return 3.0f + random.nextFloat() * (4.0f - 3.0f);
    }

    private int gerarRamLaptop() {
        int[] opcoesRAM = {16, 32, 64};
        return opcoesRAM[new Random().nextInt(opcoesRAM.length)];
    }

    private int gerarDiscoLaptop() {
        int[] opcoesDisco = {256, 512, 1024};
        return opcoesDisco[new Random().nextInt(opcoesDisco.length)];
    }

    private float gerarCpuLaptop(Random random) {
        return 2.0f + random.nextFloat() * (3.0f - 2.0f);
    }

    private int gerarRamRaspberry() {
        int[] opcoesRAM = {2, 4, 8};
        return opcoesRAM[new Random().nextInt(opcoesRAM.length)];
    }

    private int gerarDiscoRaspberry() {
        int[] opcoesDisco = {16, 32, 64, 128};
        return opcoesDisco[new Random().nextInt(opcoesDisco.length)];
    }

    private float gerarCpuRaspberry(Random random) {
        return 1.0f + random.nextFloat() * (2.0f - 1.0f);
    }

    public void imprimirComputadores() {
        for (Computador comp : computadores) {
            System.out.println(comp);
        }
    }

    public void mostrarComputadoresX64() {
        for (Computador comp : computadores) {
            if (comp.getArq().equals("x64")) {
                System.out.println(comp);
            }
        }
    }

    public void mostrarConsumoEnergetico() {
        for (Computador comp : computadores) {
            System.out.println(comp.getId() + " Consumo: " + comp.calcularConsumoEnergetico() + "W");
        }
    }
}
