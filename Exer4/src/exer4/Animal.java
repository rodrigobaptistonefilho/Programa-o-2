//Todas as classes que herdam de Animal devem implementar  um construdor com dois parâmetros(Raça e peso) para serem compatíveis com a classe Animal.
//Na subclasse 
package exer4;
/**
 *
 * @author Rodrigo
 */
public class Animal {
    private String raca;
    private double peso;
   
    public Animal(String raca, double peso){//Construtor da classe.
        this.raca = raca;//Recebe os parâmetros raça e peso que são atribuidos aos respectivos atributos.
        this.peso = peso;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
     //set para alterar os atributos
    public void setPeso(double peso) {
        this.peso = peso;
    }
    //get para ler os atribustos
    public String getRaca() {
        return raca;
    }

    public double getPeso() {
        return peso;
    }
    
   
}
