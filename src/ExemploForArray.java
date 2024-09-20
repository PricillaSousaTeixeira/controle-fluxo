public class ExemploForArray {
    
    public static void main(String[] args) {
        int contador = 1; 
        String alunos [] = {"Pricilla", "Prirley", "Fabricio", "Quézia", "Lucas"};
       
        for(int x = 0; x < alunos.length; x++){
            System.out.println("A posição do(a) aluno(a): "+alunos[x]+ " é: "+x);
        }
            System.out.println(" ");
            
            // No for each iniciei a variavel "contador" para mostrar a posição de cada elemento no . 
        for(String aluno: alunos){
            System.out.println("A posição do(a) aluno(a): "+aluno+ " é: "+ contador ++);
        }
    }
}
