/**
 * Clase Principal.
 * Contiene el método main, desde donde se crean y se llenan los objetos
 * de tipo Estudiante que forman parte del sistema de registro académico.
 */
public class Principal {
    public static void main(String[] args) {
// Se declara un arreglo con espacio para guardar 3 estudiantes
        
        Estudiante[] estudiantes = new Estudiante[3];
// Primer estudiante: se crea el objeto y se asignan sus datos
        
        estudiantes[0] = new Estudiante();
        estudiantes[0].nombre = "Ana";
        estudiantes[0].apellido = "Lopez";
        estudiantes[0].edad = 19;
        estudiantes[0].carrera = "Software";
        estudiantes[0].semestre = 1;
// Segundo estudiante: se repite el mismo proceso con otros datos
        
        estudiantes[1] = new Estudiante();
        estudiantes[1].nombre = "Carlos";
        estudiantes[1].apellido = "Perez";
        estudiantes[1].edad = 21;
        estudiantes[1].carrera = "Sistemas de Informacion";
        estudiantes[1].semestre = 3;
// Tercer estudiante: se crea el objeto y se asignan sus datos
        
        estudiantes[2] = new Estudiante();
        estudiantes[2].nombre = "Maria";
        estudiantes[2].apellido = "Gomez";
        estudiantes[2].edad = 20;
        estudiantes[2].carrera = "Tecnologias de la Informacion";
        estudiantes[2].semestre = 2;
// Se recorre el arreglo para mostrar la información de cada estudiante
        
        for (int i = 0; i < estudiantes.length; i++) {
// Se imprime un título con el número del estudiante (i + 1 porque el índice empieza en 0)
            
            System.out.println("\n=== ESTUDIANTE " + (i + 1) + " ===");
// Se muestran los datos guardados en el objeto de la posición actual
            
            System.out.println("Nombre: " + estudiantes[i].nombre);
            System.out.println("Apellido: " + estudiantes[i].apellido);
            System.out.println("Edad: " + estudiantes[i].edad);
            System.out.println("Carrera: " + estudiantes[i].carrera);
            System.out.println("Semestre: " + estudiantes[i].semestre);
        } // Fin del ciclo for
    } // Fin del método main
}// Fin de la clase Principal
 