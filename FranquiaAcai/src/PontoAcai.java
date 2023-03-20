import javax.swing.JOptionPane;

public class PontoAcai {
    public static void main(String[] args) {

        Acai acai = new Acai();

        Double tamanho = Double.parseDouble(JOptionPane.showInputDialog("Qual o tamanho desejado? \n 300ml \n 500ml \n 700ml"));
        acai.setTamanho(tamanho);

        String acrescimo = JOptionPane.showInputDialog("Deseja acrescimo de sorvete? \n S = sim \n N = não");
        if(acrescimo.equals("S")){
            acai.setAcrescimo(true);
        }
        acai.CalculaValor(tamanho);

       JOptionPane.showMessageDialog(null,"O seu açai ficou no valor de: " + acai.getValor());

    }
}