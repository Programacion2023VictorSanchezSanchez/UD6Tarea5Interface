package ejercicio7;

public class Personaje implements Habilidad, Rol{

        String rol;
        String habilidad;

        void mostrarInformacion(){

        }

        @Override
        public void activar() {
        System.out.println("Activo mi habilidad " + habilidad);
        }

        @Override
        public void describir() {
        System.out.println("Mi rol es " + rol);

        }



}
