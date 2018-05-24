
package exer4;
/**
 *
 * @author Rodrigo
 */
public class Animal {
    private String raca;
    private double peso;
   
    public Animal(String raca, double peso){
        this.raca = raca;
        this.peso = peso;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public double getPeso() {
        return peso;
    }
    
   
}
