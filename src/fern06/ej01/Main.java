package fern06.ej01;

public class Main {
    public static void main(String[] args) {
        Persona per01 = new Persona("Paciente01",80, 1.80f);
        Persona per02 = new Persona("Paciente02",65, 1.90f);
        Persona per03 = new Persona("Paciente03",88, 1.61f);
        Persona per04 = new Persona("Paciente04",90, 1.53f);
        Persona[] arrayPacientes = {per01, per02, per03, per04};
//        for (Persona item : arrayPacientes){
//            System.out.println(item.getNombre() + " " + item.CalcularPeso());
//        }
        Hospital hos01 = new Hospital("Hospi", arrayPacientes);
//        per01.thresholds();
        hos01.calcularPacientes();
    }
}
