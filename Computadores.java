import com.sun.source.tree.ReturnTree;

/**
 * @author Teodoro Marques
 * @version 1.0
 */
public class Computadores {
    protected double id;
    protected double ram;
    protected double armDisco;
    protected Float cpu;
    protected String arq;

    /**
     * getter para arq
     * @return arq
     */
    public String getArq() {
        return arq;
    }

    /**
     * setter para arq
     * @param arq
     */
    public void setArq(String arq) {
        if(!this.arq.equals("x64") && !this.arq.equals("ARM")){
            System.out.println("A arquitetura só pode ser x64 ou ARM.");
            arq = "";
            this.arq = "";
        }
        else{
            this.arq = arq;
        }
    }

    /**
     * getter para id
     * @return id
     */
    public double getId() {
        return id;
    }

    /**
     * setter para id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter para ram
     * @return ram
     */
    public double getRam() {
        return ram;
    }

    /**
     * setter para ram
     * @param ram
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * getter para armDisco
     * @return armDisco
     */
    public double getArmDisco() {
        return armDisco;
    }

    /**
     * setter para armDisco
     * @param armDisco
     */
    public void setArmDisco(int armDisco) {
        this.armDisco = armDisco;
    }

    /**
     * getter para cpu
     * @return cpu
     */
    public float getCpu() {
        return cpu;
    }

    /**
     * setter para cpu
     * @param cpu
     */
    public void setCpu(float cpu) {
        this.cpu = cpu;
    }
}
