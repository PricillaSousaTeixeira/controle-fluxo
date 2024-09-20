public class ResultadoEscolar {
    public static void main(String[] args) {
        
    int nota = 6;
    int nota2 = 7;

    if(nota >= 7){
        System.out.println("Aprovado!");
    }
    else if(nota >=5 && nota < 7){
        System.out.println("Recuperação");
    }
    else{
        System.out.println("Reprovado!");
    }

    String resultado = nota2 >= 8? "Aprovado" : nota2 >=5 && nota2 <=7 ? "recuperação" : "reprovado";
    System.out.println("O resultado da segunda nota é: "+resultado);
    }

}
