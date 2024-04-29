import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("***********************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo dispoble: " + saldo);
        System.out.println("\n***********************************************");
        System.out.println("\n***********************************************");

        String menu = """
                -- Escriba el numero de la opcion deseada --
                1- Consultar Saldo
                2- Retirar
                3- Depositar
                9- Salir 
                """;
        Scanner teclado = new Scanner(System.in);

        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: " + saldo);
                    break;
                case 2:
                    System.out.println("Monto a retirar ");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar){
                        System.out.println("Saldo Insuficiente");
                    }else{
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo act es: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Monto a depositar: ");
                    double valorADepositar = teclado.nextDouble();
                    if (saldo <= 0){
                        System.out.println("El monto debe ser mayor que cero");
                    }else {
                        saldo = saldo + valorADepositar;
                        System.out.println("El saldo act es: " + saldo);
                        break;
                    }
                case 9:
                     System.out.println("Gracias por usar la AppBancaria, Saludos");
                     break;
                default:
                     System.out.println("Opcion no valida");
            }
        }
    }
}