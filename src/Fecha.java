import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Fecha {
    public static void main(String[] args) {
        String fechaNacPersona1;
        String fechaNacPersona2;

        Scanner sc = new Scanner(System.in);

        // Solicitar ingreso fechas de nacimiento
        System.out.println("Ingrese fecha de nacimiento de persona 1 (DD/MM/AAAA)");
        fechaNacPersona1 = sc.nextLine();

        System.out.println("Ingrese fecha de nacimiento de persona 2 (DD/MM/AAAA)");
        fechaNacPersona2 = sc.nextLine();

        // Obtener día de nacimiento Persona 1
        String diaNacPersona1 = fechaNacPersona1.substring(0,2);
        int diaNacPers1 = Integer.parseInt(diaNacPersona1);

        // Obtener mes de nacimiento Persona 1
        String mesNacPersona1 = fechaNacPersona1.substring(3,5);
        int mesNacPers1 = Integer.parseInt(mesNacPersona1);

        // Obtener año de nacimiento Persona 1
        String anioNacPersona1 = fechaNacPersona1.substring(6,10);
        int anioNacPers1 = Integer.parseInt(anioNacPersona1);


        // Obtener día de nacimiento Persona 2
        String diaNacPersona2 = fechaNacPersona2.substring(0,2);
        int diaNacPers2 = Integer.parseInt(diaNacPersona2);

        // Obtener mes de nacimiento Persona 2
        String mesNacPersona2 = fechaNacPersona2.substring(3,5);
        int mesNacPers2 = Integer.parseInt(mesNacPersona2);

        // Obtener año de nacimiento Persona 2
        String anioNacPersona2 = fechaNacPersona2.substring(6,10);
        int anioNacPers2 = Integer.parseInt(anioNacPersona2);


        if(anioNacPers1 < anioNacPers2 || anioNacPers1 == anioNacPers2 && mesNacPers1 < mesNacPers2 || anioNacPers1 == anioNacPers2 && mesNacPers1 == mesNacPers2 && diaNacPers1 < diaNacPers2 ) {
            System.out.println("La persona 1 es mayor");
        } else if(anioNacPers1 > anioNacPers2 || anioNacPers1 == anioNacPers2 && mesNacPers1 > mesNacPers2 || anioNacPers1 == anioNacPers2 && mesNacPers1 == mesNacPers2 && diaNacPers1 > diaNacPers2){
            System.out.println("La persona 2 es mayor");
        } else if(anioNacPers1 == anioNacPers2 && mesNacPers1 == mesNacPers2 && diaNacPers1 == diaNacPers2) {
            System.out.println("Ambos tienen la misma edad");
        }
        }
    }