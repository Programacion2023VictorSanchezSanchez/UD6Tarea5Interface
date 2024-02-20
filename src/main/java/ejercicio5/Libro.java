package ejercicio5;

public class Libro extends Bienes implements Imponible{
    private String autor;

    public Libro(String descripcion, double precio, String autor) {
        super(descripcion, precio);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                '}';
    }

    @Override
    public double calculoImpuesto() {
        return 0;
    }
}
