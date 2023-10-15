import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        // Declaración de variables
        int sum, rest, divis;
        int num1, num2;
        String operation;

        // Solicitar al usuario la operación deseada (Sumar, Restar, Dividir)
        operation = JOptionPane.showInputDialog(null, "¿Qué operación desea realizar?\n"
                + "Para Sumar, ingrese 'S' o 's'.\n"
                + "Para Restar, ingrese 'R' o 'r'.\n"
                + "Para Dividir, ingrese 'D' o 'd'.");

        // Solicitar al usuario los números para realizar la operación
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo número"));

        // Realizar la operación según la selección del usuario
        if (operation.equalsIgnoreCase("S")) {
            // Suma
            sum = num1 + num2;
            JOptionPane.showMessageDialog(null, "La suma es: " + sum);
        } else if (operation.equalsIgnoreCase("R")) {
            // Resta
            rest = num1 - num2;
            JOptionPane.showMessageDialog(null, "La resta es: " + rest);
        } else if (operation.equalsIgnoreCase("D")) {
            // División
            if (num2 != 0) {
                // Verificar si el divisor no es cero para evitar división por cero
                divis = num1 / num2;
                JOptionPane.showMessageDialog(null, "La división es: " + divis);
            } else {
                JOptionPane.showMessageDialog(null, "Error: No se puede dividir por cero.");
            }
        } else {
            // Mensaje de error en caso de una operación no válida
            JOptionPane.showMessageDialog(null, "Operación no válida. Ingrese 'S', 'R' o 'D'.");
        }
    }
}
