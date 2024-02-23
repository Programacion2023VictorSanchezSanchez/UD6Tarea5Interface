package ejercicio7;

/**
 * Clase con la información de los personajes del juego de rol
 */
public class Personaje implements Habilidad, Rol{

        // Variables de la clase
        private String nombre;
        private String rol;
        private String habilidad;

        // Constructor de la clase
        public Personaje(String nombre, String rol, String habilidad) {
                this.nombre = nombre;
                this.rol = rol;
                this.habilidad = habilidad;
        }

        /**
         * Metodo para mostrar la informacion del personaje
         */
        public void mostrarInformacion(){
        System.out.println("Nombre: " + this.nombre);
        activar();
        describir();
        }

        /**
         * Metodo de la interfaz habilidad
         */
        @Override
        public void activar() {
        System.out.println("Activo mi habilidad: " + this.habilidad);
        }

        /**
         * Metodo de la interfaz rol
         */
        @Override
        public void describir() {
        System.out.println("Mi rol es: " + this.rol);

        }



}
