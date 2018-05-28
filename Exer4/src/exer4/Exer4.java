/*4 [Herança]
Se uma superclasse define um construtor e uma subclasse também define um construtor,
de quem é a responsabilidade pela construção de um objeto da subclasse: do construtor 
da superclasse, do construtor da subclasse ou de ambos?
Resposta: : a responsabilidade pela construção de um objeto da subclasse é de ambos. 
Em primeiro lugar, o construtor da superclasse inicia os atributos da superclasse, 
depois o construtor da subclasse termina de construir o objeto, iniciando os atributos da subclasse,
nesta ordem. */
package exer4;
/**
 *
 * @author Rodrigo Baptistone Filho RA:120187.
 */
public class Exer4 {
  
    public static void main(String[] args) {
        Cachorro cao = new Cachorro("Pastor-alemao", 8.5, "Carne");
        
    }
    
}
