import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Ingrese su nombre");
        Scanner leer = new Scanner(System.in);
        String propietario = leer.nextLine();

        CuentaBancaria cuenta_personal = new CuentaBancaria(propietario);

        /*
            MENÚ CUENTA BANCARIA
            1. Retiro
            2. Depósito
            3. Imprimir saldo
            4. Consultar saldo
            5. Agregar beneficiaro
            6. Salir
        */
        int opcion;

        do {


            System.out.println("Menú cuenta bancaria");
            System.out.println("Selecciona la opcion deseadan" +
                    "\n1. Retiro\n" +
                    "2. Depósito\n" +
                    "3. Imprimir saldo\n" +
                    "4. Estado de cuenta\n" +
                    "5. Agregar beneficiaro\n" +
                    "6. Salir");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese la cantidad que desea retirar.");
                    float monto = leer.nextFloat();
                    cuenta_personal.retiros(monto);
                    System.out.println("**********************************");
                break;

                case 2:
                    System.out.println("Ingrese la cantidad que desea depositar.");
                    float deposito = leer.nextFloat();
                    cuenta_personal.depositos(deposito);
                    System.out.println("**********************************");
                break;

                case 3:
                    System.out.println("El monto total de su saldo es: "
                            + cuenta_personal.imprimirSaldo());
                    System.out.println("**********************************");
                break;

                case 4:
                    cuenta_personal.estadoDeCuenta();
                break;

                case 5:
                    System.out.println("Ingrse el nombre del beneficiario:");
                    String beneficiario = leer.next();
                    cuenta_personal.beneficiario = beneficiario;
                break;
            }
        } while (opcion != 6 );

        /*
        Scanner leer = new Scanner(System.in);
        cuenta_personal.beneficiario = "Astrik Sem";

        System.out.println("Ingresa un monto a depositar");

        float deposito = leer.nextFloat();

        System.out.println("Ingresa un monto a retirar");
        float retiro = leer.nextFloat();


        cuenta_personal.depositos(deposito);
        cuenta_personal.retiros(retiro);

        System.out.println("Tu saldo actual es " + cuenta_personal.consultarSaldo());

        System.out.println(cuenta_personal.beneficiario);

        CuentaBancaria cuenta_papa = new CuentaBancaria();
        cuenta_papa.beneficiario = "Rodolfo";
        System.out.println(cuenta_papa.beneficiario);
        */



    }

}