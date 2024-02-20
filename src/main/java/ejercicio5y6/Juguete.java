package ejercicio5y6;

public class Juguete extends Bienes implements Imponible{

    private int edadMinima;

    public Juguete(String descripcion, double precio, int edadMinima) {
        super(descripcion, precio);
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "Juguete{" +
                "descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", edadMinima=" + edadMinima +
                '}';
    }

    @Override
    public double calculoImpuesto() {
        return 0;
    }
}
