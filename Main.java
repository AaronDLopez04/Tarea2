package ico.fes.unam;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String input = teclado.nextLine();
        System.out.println("Tecleaste: " + input);
        char uno = input.charAt(0);
        int decimal = (int) uno;
        System.out.println("El valor decimal de " + uno + " es: " + decimal);

        for (int i = 0; i < input.length(); i++) {
            System.out.println( (int)input.charAt(i) );
            if ( == teclado.hasNextBigDecimal()){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }
    }
}