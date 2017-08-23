
package snake;


public class Estudiante {
    String Nombre;
    String Carne;
    String Seccion;
    String Curso;
    //Constructores 
   public Estudiante(){
        Nombre="Roberto Carlos Garcia Cristales";
        Carne="201314446";
        Seccion="Sección E";
        Curso="Laboratorio de IPC1";
    }
   public Estudiante(String Nombre,String Seccion,String Curso,String Carne){
        this.Nombre=Nombre;
        this.Seccion=Seccion;
        this.Curso=Curso;
        this.Carne=Carne;
    }
   //Terminan Constructores
   
   //Inicia Metodos
   public String ObtenerNombre(){
       return Nombre;
   }
   public String ObtenerCarne(){
       return Carne;
   }
   public String ObtenerSeccion(){
       return Seccion;
   }
   public String ObtenerCurso(){
       return Curso;
   }
   public void ImprimirDatos(){
       System.out.println(Nombre);
       System.out.println(Carne);
       System.out.println(Seccion);
       System.out.println(Curso);
   }
   
   
}
