package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    private static double numero1;
    private static double numero2;

    /**
     * 1.Crear una calculadora con 8 operaciones matemáticas, se debe presentar
     * un menú con el nombre de las operaciones (pedir 2 números) y mostrar el
     * resultado. Una vez mostrado elresultado se debe mostrar otra vez el menú.
     * Hacer validaciones de datos.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int seleccion = 0;
        double num1;
        double num2;
        String n1;
        String n2;
        double resultado = 0;
        while (true) {
            String[] opcionOperacion = {"1.Suma", "2.Resta", "3.Multiplicacion", "4.Division", "5.Potencia", "6.Raiz Cuadrada", "7.Modulo", "8.Logaritmo"};
            seleccion = JOptionPane.showOptionDialog(null, "Selecciona una operacion:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionOperacion, opcionOperacion[0]);

            n1 = JOptionPane.showInputDialog("Ingrese el primer numero: ");
            n2 = JOptionPane.showInputDialog("Ingrese el segundo numero: ");
            try {
                num1 = Double.parseDouble(n1);
                num2 = Double.parseDouble(n2);
                if (seleccion == 0) {
                    resultado = num1 + num2;
                } else if (seleccion == 1) {
                    resultado = num1 - num2;
                } else if (seleccion == 2) {
                    resultado = num1 * num2;
                } else if (seleccion == 3) {
                    if (num2 == 0) {
                        System.out.println("Error: No se puede dividir entre cero");
                        continue;
                    }
                    resultado = num1 / num2;
                } else if (seleccion == 4) {
                    resultado = Math.pow(num1, num2);
                } else if (seleccion == 5) {
                    if (num1 < 0) {
                        System.out.println("Error: No se puede calcular la raiz cuadrada de un numero negativo");
                        continue;
                    }
                    resultado = Math.sqrt(num1);
                } else if (seleccion == 6) {
                    resultado = num1 % num2;
                } else if (seleccion == 7) {
                    if (num1 <= 0) {
                        System.out.println("Error: El argumento del logaritmo debe ser positivo");
                        continue;
                    }
                    resultado = Math.log10(num1);
                } else {
                    System.out.println("Error: Opcion no valida");
                    continue;
                }
                System.out.println("El resultado es: " + resultado);
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un numero valido");
            }
        }
    }
}
