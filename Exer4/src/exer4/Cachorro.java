
package exer4;
/**
 *
 * @author Rodrigo
 */
    public class Cachorro extends Animal{
        private String alimento;
    public Cachorro(String raca, double peso, String alimento){
        super(raca, peso);
        this.alimento = alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }
    
}

