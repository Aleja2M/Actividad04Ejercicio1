
package co.edu.uniminuto.entity;

public class Operacion {
    
    //1. Declaro atributos o propiedades
    double numero1;
    double numero2;
    int seleccion;
    double resultado;
    //2.Metodo Constructor

    public Operacion(double numero1, double numero2, int opcionOperacion, double resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.seleccion = opcionOperacion;
        this.resultado = resultado;
    }
   
    public Operacion(){
        
    }
   //3.Metodo de Accessos

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int opcionOperacion) {
        this.seleccion = opcionOperacion;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    
    //4.String

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Operacion{");
        sb.append("numero1=").append(numero1);
        sb.append(", numero2=").append(numero2);
        sb.append(", seleccion=").append(seleccion);
        sb.append(", resultado=").append(resultado);
        sb.append('}');
        return sb.toString();
    }
    
}
