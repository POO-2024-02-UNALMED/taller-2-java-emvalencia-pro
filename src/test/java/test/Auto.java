package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static String cantidadCreados;

    int cantidadAsientos(){
        int con=0;
        for(Object a:asientos){
            if(a instanceof Asiento){
                con++;
            }
        }
        return con;
    }

    String verificarIntegridad(){
        String v=null;
        for(Asiento a:asientos){
            if(a instanceof Asiento && (motor.registro!=a.registro | a.registro!=registro)){
                v="Las piezas no son originales";
            }else{
                v="Auto original";
            }
        }
        return v;
    }
}