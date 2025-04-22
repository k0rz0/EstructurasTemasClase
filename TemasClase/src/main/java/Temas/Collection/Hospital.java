package Temas.Collection;
import java.util.PriorityQueue;

class Paciente implements Comparable<Paciente> {
    private String nombre;
    private int gravedad;

    public Paciente(String nombre, int gravedad) {
        this.nombre = nombre;
        this.gravedad = gravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGravedad() {
        return gravedad;
    }

    @Override
    public int compareTo(Paciente otro) {
        return Integer.compare(this.gravedad, otro.gravedad);
    }

    @Override
    public String toString() {
        return nombre + " (Gravedad: " + gravedad + ")";
    }
}

public class Hospital {
    public static void main(String[] args) {
        PriorityQueue<Paciente> colaPacientes = new PriorityQueue<>();

        colaPacientes.add(new Paciente("Juan", 3));
        colaPacientes.add(new Paciente("Maria", 1));
        colaPacientes.add(new Paciente("Carlos", 4));
        colaPacientes.add(new Paciente("Ana", 2));

        System.out.println("Atendiendo a los pacientes según su prioridad:");

        while (!colaPacientes.isEmpty()) {
            System.out.println("Atendiendo a: " + colaPacientes.poll());
        }
    }
}

