package ejercicio5;

public class Comida extends Bienes{
    private double calorias;

    public Comida(String descripcion, double precio, double calorias) {
        super(descripcion, precio);
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "calorias=" + calorias +
                '}';
    }
}
