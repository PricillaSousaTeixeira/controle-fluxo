public class SistemaMedida {

    public static void main(String[] args) {
        String sigla = "p";

        switch (sigla) {
            case "p": {
                System.out.println("PEQUENO");
                break;
            }

            case "M": {

                System.out.println("MÉDIO");
                break;
            }

            case "G": {
                System.out.println("GRANDE");
                break;
            }

            default:

                System.out.println("INDEFINIDO");
        }
    }
}
