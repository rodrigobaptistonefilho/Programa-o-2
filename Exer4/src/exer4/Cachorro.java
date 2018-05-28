//A subclasse Cachorro herda da superclasse Animal. Essa clase obrigatoriamente deve implementar o construtor com 2 parâmentros(raça e peso), que animal implemento.
//Neste construtor, deve-se passar os parâmetros para o construtor da superclasse Animal. Para isso deve-se usar a chamada para Super(raca, peso) para fazer a chamada
//do construtor. Com isso se isntância a classe especializada(Cachorro) e a classe base(Animal).
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

