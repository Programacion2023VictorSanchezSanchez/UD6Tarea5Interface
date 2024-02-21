### Ejercicio 2
a) Si

b) No

c) Si

d) No genera error, se implementa solo 1 de los 2 metodos con lo cúal no hay conflicto real

### Ejercicio 3
public interface Calculable {

int num = 32;

double pi = 3.14159;

double calcular();

void imprimirCalculo();

}

### Ejercicio 4
No es error pero los "public" y el "final" no tienen utilidad ya que lo añade el IDE solo luego, las variables tienen que tener un valor asignado si o si, "y" no puede no tener ningún valor y no pueden haber 2 métodos con el mismo nombre aunque devuelvan tipos de datos diferentes.

### Ejercicio 5
a) Clase Padre.

b) Clase hija de Bienes.

c) Clase hija de Bienes.

d) Clase hija de Bienes.

e) Interfaz que se impone a Juguete y Libro.


### Ejercicio 6
a) Si

b) Sería tipo Bienes

Bienes [] lista = new Bienes[4];

        lista[0] = new Juguete("Miau", 15, 5);
        
        lista[1] = new Comida("macarrone", 1, 60);
        
        lista[2] = new Libro("mondongo", 2, "mmmm" );

c) Obtenemos lo mismo que si fuese .toString al cada metodo tener su propio metodo toString imprime lo mismo.

d) Los objetos que implementan la interfaz Imponible podrían haber sido declarados en un Array de Imponibles.

e) Si funcionará, estamos llamando al metodo toString de la clase que en como si llamasemos al metodo de Object ya que lo hemos sobreescrito en esa Clase.

