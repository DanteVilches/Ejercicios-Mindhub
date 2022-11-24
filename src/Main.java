import java.util.Scanner;
import java.util.Stack;

public class  Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingrese su Nombre: ");
//        String nombre = scanner.nextLine();
//        System.out.print("Ingrese su Apellido: ");
//        String apellido = scanner.nextLine();
//        System.out.print("Ingrese su Edad: ");
//        int edad = scanner.nextInt();
//
//        System.out.println(nombre  + " " + apellido+ " Tiene "+edad+ " años" );
//
//        System.out.print("Ingrese el primer Número: ");
//        int num1 = scanner.nextInt();
//        System.out.print("Ingrese el segundo Número: ");
//        int num2 = scanner.nextInt();
//        System.out.print("Ingrese el tercer Número: ");
//        int num3 = scanner.nextInt();

//        int temp= Math.max(num1, num2);
//        int mayor = Math.max(num3,temp);
//
//        System.out.println("El número mayor es "+ mayor);
//
//
//        System.out.print("Ingrese un número: ");
//        int num = scanner.nextInt();
//        if(num % 2 == 0){
//            System.out.println("El número ingresado es par");
//
//        }else{
//            System.out.println("El número ingresado no es par");
//        }
//
//        System.out.print("Ingrese la primera palabra: ");
//        String primeraPalabra = scanner.nextLine();
//        System.out.print("Ingrese la segunda palabra: ");
//        String segundaPalabra = scanner.nextLine();
//
//        if(primeraPalabra.equals(segundaPalabra)){
//            System.out.println("Las palabras son iguales");
//        }else{
//            System.out.println("Las palabras son diferentes");
//        }
//        Stack<Integer> numeros = new Stack<Integer>();
//    int num = 1;
//       do{
//            System.out.print("Ingrese un número: ");
//           num = scanner.nextInt();
//           if(num != 0){
//               numeros.push(num);
//           }
//
//        }while(num != 0);
//        System.out.println("Los números que ha ingresado son "+ numeros);

//        hola();
//
//
//
//      System.out.print("Ingrese un número: ");
//      int  num = scanner.nextInt();
//
//        esPar(num);

//      esPrimo(num);
//        sumaImpares();
//        sumaPrimosYPares();
//        calculadora();
    }
    public static void hola() {
        System.out.println("Bienvenido");

    }
    public static void esPar(int num){
        if(num % 2 == 0){
            System.out.println("El número ingresado es par");

        }else{
            System.out.println("El número ingresado es impar");
        }
    }

    public static void esPrimo(int num){
        if (isPrime(num)){
            System.out.println("El número " +num+ "  es primo");

        }else{
            System.out.println("El número " + num + " no es primo");
        }

    }
    public static void sumaImpares(){
        int [] numeros = {3,5,7,3,2,1,6,8,9,10};
        int total = 0;
        for (int i = 0; i < numeros.length ; i++) {
            if(!(numeros[i] % 2 == 0)){
                total += numeros[i];
            }

        }
        System.out.println(total);
    }

    public static void sumaPrimosYPares(){
        int sumaPrimos = 0;
        int sumaPares  = 0;
        int [] numeros = {1,2,6,3,4,10,6,8,9,10};

        for ( int i = 1; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                sumaPares += numeros[i];
            }
            if (isPrime(numeros[i])){
                sumaPrimos += numeros[i];
            }
        }

        System.out.println("la suma de los números primos es igual a " +sumaPrimos);
        System.out.println("la suma de los números pares es igual a " +sumaPares);
    }

    public static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
    public static void menuCalculadora(){
        System.out.println("Calculadora");
        System.out.println("0. Salir");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
    }
    public static void calculadora() {


        int operacion;
        int num1;
        int num2;
        do {
            Scanner scanner = new Scanner(System.in);
            menuCalculadora();
            operacion = scanner.nextInt();


            switch (operacion) {

                case 1:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();
                    long aux2 = num1 + num2;
                    System.out.println("La suma de los 2 números es igual a " + aux2);
                    break;

                case 2:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();
                    long aux = num1 - num2;
                    System.out.println("La resta de los 2 números es igual a " + aux);
                    break;

                case 3:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("La multiplicación de los 2 números es igual a " + num1 * num2);
                    break;

                case 4:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();
                    if (num1 == 0 || num2 == 0) {
                        System.out.println("No se puede dividir por 0");

                    } else {
                        System.out.println("La división de los 2 números es igual a " + num1 / num2);

                    }
                    break;


                default:
                    System.out.println("Opción incorrecta");

            }


        } while (operacion != 0);
    }
    public static void ingresoBoliche(){

        Scanner scanner = new Scanner(System.in);

        int capacidadMaxima = 500;
        int capacidad = 0;
        int dineroRecaudado = 0;
        int entrada = 1500;
        int entradaVip = 2000;

        int opciones;

        do{
            System.out.println("1. Ingreso de datos.");
            System.out.println("2. Capacidad disponible.");
            System.out.println("3. Dinero recaudado.");
            System.out.println("4. Salir del sistema.");

            opciones = scanner.nextInt();

            switch (opciones){
                case 1:
                    System.out.println("Ingrese su nombre:");
                    String nombre = scanner.next();

                    System.out.println("Ingrese su edad:");
                    int edad = scanner.nextInt();

                    if(edad <= 21) {
                        System.out.println("Lo siento usted no puede pasar.");
                        break;
                    }
                    System.out.println("Ingrese su DNI:");
                    int dni = scanner.nextInt();

                    System.out.println("¿Tiene pase Vip? Si/No");
                    String vipInput = scanner.next();
                    boolean vip = vipInput.equalsIgnoreCase("si");

                    if(vip){
                        System.out.println("Puede pasar");
                        capacidad++;
                        break;
                    }else {
                        System.out.println("¿Tiene descuento? Si/No");
                        String paseInput = scanner.next();
                        boolean pase = paseInput.equalsIgnoreCase("si");

                        if (pase) {
                            System.out.println("¿Qué entrada desea comprar? Vip o Normal");
                            String tipoEntrada = scanner.next();

                            if (tipoEntrada.equalsIgnoreCase("vip")) {
                                System.out.println("El valor de la entrada para usted es: " + (entradaVip / 2));
                                System.out.println("Desea comprarla? Si/No");
                                String confirmar = scanner.next();

                                if (confirmar.equalsIgnoreCase("si")) {
                                    System.out.println("¡Bienvenido!");
                                    capacidad++;
                                    dineroRecaudado += 1000;
                                    break;

                                } else {
                                    System.out.println("Hasta luego");
                                    break;
                                }
                            } else if (tipoEntrada.equalsIgnoreCase("normal")) {
                                System.out.println("El valor de la entrada para usted es: " + (entrada / 2));
                                System.out.println("Desea comprarla? Si/No");
                                String confirmar = scanner.next();

                                if (confirmar.equalsIgnoreCase("si")) {
                                    System.out.println("Bievenido, y que la pases divinamente bien!");
                                    capacidad++;
                                    dineroRecaudado += 750;
                                    break;

                                } else {
                                    System.out.println("Hasta luego.");
                                    break;
                                }
                            } else {
                                System.out.println("Hasta luego.");
                                break;
                            }
                        } else {
                            System.out.println("Desea comprar la entrada Vip o Normal ?");
                            String tipoEntrada = scanner.next();

                            if (tipoEntrada.equalsIgnoreCase("vip")) {
                                System.out.println("El valor de la entrada para usted es: " + (entradaVip));
                                System.out.println("Desea comprarla? S/N");
                                String confirmar = scanner.next();

                                if (confirmar.equalsIgnoreCase("s")) {
                                    System.out.println("Bievenido, y que la pases divinamente bien!");
                                    capacidad++;
                                    dineroRecaudado += 2000;
                                    break;

                                } else {
                                    System.out.println("Entiendo que no desea adquirir la entrada, buenas noches.");
                                    break;
                                }
                            } else if (tipoEntrada.equalsIgnoreCase("normal")) {
                                System.out.println("El valor de la entrada para usted es: " + (entrada));
                                System.out.println("Desea comprarla? S/N");
                                String confirmar = scanner.next();

                                if (confirmar.equalsIgnoreCase("s")) {
                                    System.out.println("Bievenido, y que la pases divinamente bien!");
                                    capacidad++;
                                    dineroRecaudado += 1500;
                                    break;

                                } else {
                                    System.out.println("Entiendo que no desea adquirir la entrada, buenas noches.");
                                    break;
                                }
                            }
                        }
                    }

                case 2:
                    System.out.println("Capacidad disponible:" + (capacidadMaxima - capacidad));
                    break;
                case 3:
                    System.out.println("Dinero recaudado: " + dineroRecaudado);
                    break;
            }

        }while(opciones != 4);
        System.out.println("Hasta luego");

    }
}



