
package admaeroporto;
/**
 *
 * @author Rodrigo
 */
public class Aviao {
    String prefixo;
    String companhia;
    
    public Aviao(){
    prefixo = "";
    companhia = "";
}
    Aviao patio[] = new Aviao[2];

    void aterrissar(Aviao av){

        for(int i = 0; i < 2; i++){
            if(patio[i] == null){
                patio[i] = av;
                break;
            }
        }
    }
    void listar(){
        for(Aviao av : patio){
        if(av != null){
        System.out.println("Prefixo: " + av.prefixo);
        System.out.println("Companhia:" + av.companhia);
        System.out.print("\n");
        
        
        
        }
      }
    }
    void decolar(Aviao av){

        for(int i = 0; i < 2; i++){
            if(patio[i].companhia.equals(av.companhia)){
                patio[i] = null;
            }
        }
    }
}
