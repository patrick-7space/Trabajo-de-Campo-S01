
package guia1_eje1;
public class ClaseAlumnos 
// Modificación realizada para Github
    //Atributos 
    private String dni;
    private String nombres;
    private String apellidos;
    //CONSTRUCTOR 
    public ClaseAlumnos(){
        dni="12345678";
        nombres= "patrick antoni";
        apellidos="Ortiz Garcia";
    }
    //METODOS ESCRITURA
    public void setDni (String xdni){
        dni=xdni;
    }
    public void setNombres (String xnombres){
        nombres=xnombres;
    }
    public void setApellidos (String xapellidos){
        apellidos=xapellidos ;
    }
    //METODOS LECTURA 
    public String getDni(){
        return dni;
    }
    public String getNombres (){
        return nombres;
    }
     public String getApellidos (){
        return apellidos;
    }
}

