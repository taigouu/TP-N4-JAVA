
package tpnumero4;

public class Colegio {

    public static void main(String[] args) {
        
        Materia m1 = new Materia(1,"Web 2", 2);
        Materia m2= new Materia(2, "Matemáticas",1);
        Materia m3= new Materia(3,"Laboratorio 1", 1);
        
        Alumno a1 = new Alumno(1001, "López", "Martin");
        Alumno a2= new Alumno(1002, "Martinez", "Brenda");
        
        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);
        
        
        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        a2.agregarMateria(m3);
        
        System.out.println(a1.cantidadMaterias());   
        System.out.println(a2.cantidadMaterias());
        
        
     
    }
    
}
