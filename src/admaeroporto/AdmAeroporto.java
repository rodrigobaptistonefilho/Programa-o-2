
package admaeroporto;
/**
 *
 * @author Rodrigo
 */
public class AdmAeroporto {

    public static void main(String[] args) {
        Aviao aviao0 = new Aviao();
        aviao0.prefixo = "GO";
        aviao0.companhia = "GOL";
        aviao0.aterrissar(aviao0);
      
        
        Aviao aviao1 = new Aviao();
        aviao1.prefixo = "TA";
        aviao1.companhia = "TAM";
        aviao0.aterrissar(aviao1);
       
        
       
    
        aviao0.listar();
    }
    
}
