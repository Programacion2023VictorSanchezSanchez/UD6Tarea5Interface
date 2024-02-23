package ejercicio7;

/**
 * Clase para testear el juego de rol
 */
public class JuegoRol {
    //Array de Personaje
    Personaje [] heroes = new Personaje[4];

    /**
     * Metodo para guardar y mostrar el personaje que hemos guardado en el array
     * @param heroe personaje que guardaremos en el array
     * @param indice posicion del array en el que lo guardaremos
     */
    public void guardarPersonaje(Personaje heroe, int indice){
        this.heroes[indice] = heroe;
    }

    /**
     * Mostramos el rol de todos los personajes del array
     */
    public void mostrarPersonajes(){
        for (Personaje hero : heroes) {
            hero.describir();
        }
    }

    /**
     * Mostramos la habilidad de todos los personajes del array
     */
    public void luchar(){
        for (Personaje hero : heroes){
            hero.activar();
        }
    }

    public static void main(String[] args) {
        // Objeto para testear juego rol
        JuegoRol rolTest = new JuegoRol();

        //Declaramos personaje
        Personaje mago = new Personaje("Mago", "Daño Mágico", "Lanza de Hielo"){
            @Override
            public void activar() {
                System.out.println("Activo mi habilidad, lanza de hielo!");
            }

            @Override
            public void describir() {
                System.out.println("Soy un mago de escarcha y hago daño mágico");
            }
        };

        //Guardamos personaje
        rolTest.guardarPersonaje(mago, 0);

        //Declaramos personaje
        Personaje guerrero = new Personaje("Guerrero", "Daño Físico", "Desenfreno"){
            @Override
            public void activar() {
                System.out.println("Activo mi habilidad, desenfreno!");
            }

            @Override
            public void describir() {
                System.out.println("Soy un guerrero y hago daño físico");
            }
        };

        //Guardamos personaje
        rolTest.guardarPersonaje(guerrero, 1);

        //Declaramos personaje
        Personaje picaro = new Personaje("Picaro", "Daño de las Sombras", "Emboscada"){

            @Override
            public void activar() {
                System.out.println("Activo mi habilidad, emboscada!");
            }

            @Override
            public void describir() {
                System.out.println("Soy un picaro y hago daño de las sombras");
            }
        };

        //Guardamos personaje
        rolTest.guardarPersonaje(picaro,2);

        //Declaramos personaje
        Personaje paladin = new Personaje("Paladin", "Daño Sagrado", "Consagración"){
            @Override
            public void activar() {
                System.out.println("Activo mi habilidad, consagración!");
            }

            @Override
            public void describir() {
                System.out.println("Soy un paladin y hago daño sagrado");
            }
        };

        //Guardamos personaje
        rolTest.guardarPersonaje(paladin, 3);

        //Mostramos rol personajes
        rolTest.mostrarPersonajes();

        //Mostramos habilidad personajes
        rolTest.luchar();

    }

}
