//Alunos:Rodrigo Baptistone Filho e José Eduardo de Oliveira Vieira.
//RA: 120187 e 120178.
package cond;

public class Ar {
   private boolean ligada;
   private int intensidade;
   private boolean estado;
   private int temperatura;
   private int intensidadeMax;
     
     public Ar(){
         this.ligada = false;
         this.estado = false;
         this.intensidade = 0;
         this.temperatura = 30;
         this.intensidadeMax = 30;
}
     public void ligar(){
         this.setLigada(true);
     }
 
     public void desligado(){
        this.setLigada(false);
        this.setIntensidade(0);
     }
     public void quente(){
         
     }
     public void aumentarIntensidade(){
        if (!isLigada()){
            return;
        }
        if (getIntensidade() < this.intensidadeMax){
            this.setIntensidade(this.getIntensidade() + 1);
        }       
    }
     public void aumentarIntensidade(int novoIntensidade){
        if (!isLigada()){
            return;
        }
        if (novoIntensidade <= this.intensidadeMax){
            this.setIntensidade(novoIntensidade);
        }
        else {
            this.setIntensidade(this.intensidadeMax);
        }
    }
      public void diminuirIntensidade(){
        if (getIntensidade() > 0)
            this.setIntensidade(this.getIntensidade() - 1);
    }
    
    public void diminuirIntensidade(int novoIntensidade){
        if (novoIntensidade >= 0){
            this.setIntensidade(novoIntensidade);
        }
        else {
            this.setIntensidade(0);
        }
    }
      public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
       public boolean isLigada() {
        return ligada;
    }
       public void setEstado(boolean estado){
           this.estado = estado;
       }
       public boolean isEstado(){
           return estado;
       }
        public int getIntensidade() {
        return intensidade;
    }
  
       public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    } 
       public int getTemperatura(){
           return temperatura;
       }
       public void setTemperatura(int temperatura){
       this.temperatura = temperatura;
       }
       
       public String temperatura()
       {
           if(this.getTemperatura() > 15 && this.getTemperatura() <= 30)
           {
               return "Quente";
           }else if(this.getTemperatura() <= 15 && this.getTemperatura() >= 0)
           {
               return "Frio";
           }
       return "Inválido";
       }  
}