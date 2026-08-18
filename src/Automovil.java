
public class Automovil extends Vehiculo {

    private int numPuertas;
    private String tipoCombustible;


    public Automovil() {
    }

    public Automovil(String placa, String marca, String modelo, int anio, double precioBase, String tipoCombustible, int numPuertas) {
        super(placa, marca, modelo, anio, precioBase);
        this.tipoCombustible = tipoCombustible;
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }


    @Override
    public String toString() {
        return "Automovil{" +
                "numPuertas=" + numPuertas +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", precioBase=" + precioBase +
                '}';
    }

    public static String buscarPorPlcea(){

        return  "bucar por placa";
     }


}
