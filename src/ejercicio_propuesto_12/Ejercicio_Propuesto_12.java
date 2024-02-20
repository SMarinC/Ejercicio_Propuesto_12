
package ejercicio_propuesto_12;


public class Ejercicio_Propuesto_12 {

    public static void main(String[] args) {
        double horas_trabajadas, valor_hora, retencion;
        double salario_bru, salario_neto;
        horas_trabajadas = 48;
        valor_hora = 5000;
        salario_bru = horas_trabajadas * valor_hora;
        retencion = salario_bru * 0.125;
        salario_neto = salario_bru - retencion;
        System.out.println("La retencion en la fuente es: " + retencion);
        System.out.println("El salario bruto es: " + salario_bru);
        System.out.println("El salario neto es: " + salario_neto);
    }
    
}
