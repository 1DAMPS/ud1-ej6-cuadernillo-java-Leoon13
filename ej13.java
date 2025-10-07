public class ej13 {
    public static void main(String[] args) {
        // Primero declaramos e inicializamos la constante del IRPF
        final double IRPF = 0.15;

        // A continuación marcamos el sueldo
        double sueldoBruto = 2000.0;

        // Calculamos el sueldo neto
        double sueldoNeto = sueldoBruto * (1 - IRPF);

        // Finalmente mostramos el resultado
        System.out.println("Sueldo bruto: " + sueldoBruto);
        System.out.println("IRPF aplicado: " + (IRPF * 100) + "%");
        System.out.println("Sueldo neto: " + sueldoNeto);
    }
}