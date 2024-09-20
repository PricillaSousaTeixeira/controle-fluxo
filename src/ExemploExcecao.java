import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        //Number valor = Double.valueOf("J1.78");
        try{
        Number valor = NumberFormat.getInstance().parse("a1.75");  // getInsatance()Obterinstancia / parse - analisar
        
        }catch(ParseException e){
            e.printStackTrace(); //imprimir Rastreamento de Pilha()
        }
        
    }
}
