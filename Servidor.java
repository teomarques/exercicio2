import java.util.Random;
import java.lang.Math;

public class Servidor extends Computadores{
    Computadores computador = new Computadores();
    public Servidor(){
        super();
        computador.ram = new Random().nextDouble(128, 512);
        computador.armDisco = new Random().nextDouble(1024, 16384);
        Random r = new Random();
        computador.cpu = (float) (3.0 + r.nextDouble() * (4.0 - 3.0)); // Generates a value between 3.0 and 4.0
        
    }
}
