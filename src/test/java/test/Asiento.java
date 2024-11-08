package test;
public class Asiento {
    String color;
    int precio;
    int registro;
    void cambiarColor(String c){
        switch (c) {
            case "rojo": this.color=c;
                break;
            case "verde": this.color=c;
                break;
            case "amarillo": this.color=c;
                break;
            case "negro": this.color=c;
                break;
            case "blanco": this.color=c;
                break;
            default:
                break;
        }
    }
}
