public class Principal {
    public static void main(String[] args) {

        Estudiante[] estudiantes = new Estudiante[3];

        estudiantes[0] = new Estudiante();
        estudiantes[0].nombre = "Ana";
        estudiantes[0].apellido = "Lopez";
        estudiantes[0].edad = 19;
        estudiantes[0].carrera = "Software";
        estudiantes[0].semestre = 1;

        estudiantes[1] = new Estudiante();
        estudiantes[1].nombre = "Carlos";
        estudiantes[1].apellido = "Perez";
        estudiantes[1].edad = 21;
        estudiantes[1].carrera = "Sistemas de Informacion";
        estudiantes[1].semestre = 3;

        estudiantes[2] = new Estudiante();
        estudiantes[2].nombre = "Maria";
        estudiantes[2].apellido = "Gomez";
        estudiantes[2].edad = 20;
        estudiantes[2].carrera = "Tecnologias de la Informacion";
        estudiantes[2].semestre = 2;

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("\n=== ESTUDIANTE " + (i + 1) + " ===");
            System.out.println("Nombre: " + estudiantes[i].nombre);
            System.out.println("Apellido: " + estudiantes[i].apellido);
            System.out.println("Edad: " + estudiantes[i].edad);
            System.out.println("Carrera: " + estudiantes[i].carrera);
            System.out.println("Semestre: " + estudiantes[i].semestre);
        }
    }
}