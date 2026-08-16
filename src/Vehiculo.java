public abstract class Vehiculo {

    protected String marca;
    protected String modelo;
    protected String placa;
    protected int anio;
    protected double precioBase;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String placa, int anio, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.anio = anio;
        this.precioBase = precioBase;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", anio=" + anio +
                ", precioBase=" + precioBase +
                '}';
    }



    public static  String Buscarporplaca(String placa) {

        String placabusca = "Esta buscando por placa";

        return placabusca;
    }


}
