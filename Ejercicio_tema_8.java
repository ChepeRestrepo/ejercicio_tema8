 class Ejercicio_tema_8{
  public static void main(String[] args){
    Persona persona = new Persona();
    persona.setEdad(25);
    persona.setNombre("Jose");
    persona.setTelefono("3210123345");
    System.out.println("Informacion personal: ");
    System.out.println("Edad: "+ persona.getEdad() + "\n"+ "Nombre: "+ persona.getNombre() + "\n" + "Telefono:" + persona.getTelefono());
  }
  
}
//Crear la clase Persona:
class Persona {
  //Crear variables privadas:
  private int edad;
  private String nombre;
  private String telefono;
  //Crear gets y sets de cada propiedad:
  public void setEdad(int edad){
    this.edad = edad;
  }
  public int getEdad(){
    return this.edad;
  }
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public String getNombre(){
    return this.nombre;
  }
  public void setTelefono(String telefono){
    this.telefono = telefono;
  }
  public String getTelefono(){
    return this.telefono;
  }
}



