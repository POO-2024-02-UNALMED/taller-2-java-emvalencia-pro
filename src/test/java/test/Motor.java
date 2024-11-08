package test;
public class Motor {
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int h){
        this.registro=h;
    }

    void asignarTipo(String t){
        switch (t) {
            case "gasolina": this.tipo=t;
                break;
            case "electrico": this.tipo=t;
                break;
            default:
                break;
        }
    }
}
