
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
        
        try {
    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (Exception ex) {
    // si Nimbus no está disponible, sigue con el estilo predeterminado
}
        
        Ventana v1= new Ventana();
        v1.setVisible(true);
        v1.setLocationRelativeTo(null);
     
    }
    
}
