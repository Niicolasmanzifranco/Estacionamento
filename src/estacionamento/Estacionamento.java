
package estacionamento;

import javax.swing.JOptionPane;


public class Estacionamento {

  
    public static void main(String[] args) {
    Registro dados= new Registro();
    dados.setPlaca((JOptionPane.showInputDialog("Digite a placa do carro para registrar: ")));
    dados.setModelo((JOptionPane.showInputDialog("Digite o modelo do carro para registrar: ")));    
    dados.setHoraent(Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de entrada: ")));
    dados.setMinent(Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto de entrada: ")));
    dados.setHorasai(Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de saída: ")));
    dados.setMinsai(Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto de saída: ")));
    dados.setPreco(Integer.parseInt(JOptionPane.showInputDialog("Digite o preço por hora: ")));
  
   double tempo_total= dados.calcula_tempo(dados.getHoraent(),dados.getMinent(),dados.getHorasai(),dados.getMinsai());

          dados.gera_nota(tempo_total, tempo_total);    
    
    }
    
}
