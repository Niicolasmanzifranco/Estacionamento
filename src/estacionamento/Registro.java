
package estacionamento;

import javax.swing.JOptionPane;


public class Registro {
         public String placa;
         public String modelo;
         public double horaent;
           public double minent;
         public double horasai;
          public double minsai;
          public double preco;
      
          
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
    this.placa=placa;
    }
 public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
    this.modelo=modelo;
    }
 public double getHoraent(){
        return horaent;
    }
    public void setHoraent(double horaent){
    this.horaent=horaent;
    }
     public double getMinent(){
        return minent;
    }
    public void setMinent(double minent){
    this.minent=minent;
    }
public double getHorasai(){
        return horasai;
    }
    public void setHorasai(double horasai){
    this.horasai=horasai;
    } 
    public double getMinsai(){
        return minsai;
    }
    public void setMinsai(double minsai){
    this.minsai=minsai;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
    this.preco=preco;
    }
    
public double calcula_tempo(double horaent,double minent, double horasai,double minsai){
    double conv_ent= horaent+minent/60;
    double conv_sai= horasai+minsai/60;
    double tempo=Math.ceil(conv_sai-conv_ent); 
    
    return tempo;
}
public void gera_nota(double tempo,double preco){
double valor_total= tempo*preco;
             JOptionPane.showMessageDialog(null,"Placa do carro: "+getPlaca()
             +"\n Modelo: "+getModelo()+"\n"
             + " Horário de entrada: "+getHoraent()+"h e " +getMinent()+"min\n"
             +" Horário de saida: "+getHorasai()+"h e " +getMinsai()+"min\n" 
             +"Tempo no estacionamento: "+tempo+" hrs"
             +"\nValor total: R$ "+valor_total);
        
       
}

}

