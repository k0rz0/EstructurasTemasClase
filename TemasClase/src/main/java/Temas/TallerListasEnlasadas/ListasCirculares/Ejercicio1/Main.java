package Temas.TallerListasEnlasadas.ListasCirculares.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        ListaEnlazadaCircular<Integer> lista = new ListaEnlazadaCircular<>();
        lista.insertarFinal(1);
        lista.insertarFinal(2);
        lista.insertarFinal(3);
        lista.insertarFinal(4);

        System.out.println("Turno actual: " + lista.obtenerTurnoActual());
        lista.siguienteTurno();
        System.out.println("Turno actual: " + lista.obtenerTurnoActual());

        lista.eliminarJugador();
        lista.siguienteTurno();
        System.out.println("Turno actual: " + lista.obtenerTurnoActual());
        lista.siguienteTurno();
        System.out.println("Turno actual: " + lista.obtenerTurnoActual());
        lista.siguienteTurno();
        System.out.println("Turno actual: " + lista.obtenerTurnoActual());
        lista.siguienteTurno();
        System.out.println("Turno actual: " + lista.obtenerTurnoActual());


    }
}
