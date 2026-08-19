public class CamionDeCarga extends Vehiculo {

    private double capacidadCargaTons;

    public CamionDeCarga() {
    }

    public CamionDeCarga(String placa, String marca, String modelo, int anio, double precioBase, double capacidadCargaTons) {
        super(placa, marca, modelo, anio, precioBase);
        this.capacidadCargaTons = capacidadCargaTons;
    }

    public double getCapacidadCargaTons() {
        return capacidadCargaTons;
    }

    public void setCapacidadCargaTons(double capacidadCargaTons) {
        this.capacidadCargaTons = capacidadCargaTons;
    }


    @Override
    public String toString() {
        return "CamionDeCarga{" +
                "capacidadCargaTons=" + capacidadCargaTons +
                ", placa='" + getPlaca() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", anio=" + getAnio() +
                ", precioBase=" + getPrecioBase() +
                '}';
    }

    @Override
    public String Buscarporplaca(String placa) {
        return "";
    }

    @Override
    public String listarFicha() {
        return "";
    }

    @Override
    public int calcularValorInventario() {
        return 0;
    }

    @Override
    public int calcularValor() {
        return 0;
    }

    public double calcularValorCarga() {
        double impuestoBase = precioBase * 0.10;
        double recargoToneladas = precioBase * (0.01 * capacidadCargaTons);

        return precioBase + impuestoBase + recargoToneladas;
    }
}