/**
    * Clase que define las caracteristicas de las hamburguesas de MacBurguesa
    */

public class Macburguesa{
  
  /**
    * Identificador de hamburguesas de acuerdo a su posicion
    * en el menu.
    */
  private String id;
  
  
  
  /**
    * Nombre de la MacBurguesa
    */
  private String nombre;
  
  
  
  
  /**
    * Descrión de los ingredientes que posee un macburguesa
    */
  
  private String descripcion;
  
  
  
  
  /**
    * Precio de la macburguesa
    */
  private double precio;
  
  
  
  /**
    * Booleano que nos dice si una macburguesa tiene queso
    */
  private boolean queso;
  
  
  
  /**
    * Booleano que nos dice si una macburguesa es vegetariana
    */
  private boolean vegetariana;

   
  /**
    * Metodo que nos dice la informacion de una macburguesa
    */
  public Macburguesa(String id, String nombre, String descripcion, double precio, boolean queso, boolean vegetariana){

    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
    this.queso = queso;
    this.vegetariana = vegetariana;

  }

  public String getId(){
    return this.id;
  }

  /**
    * Regresa un String con el nombre de la macburguesa
    */
  public String getNombre(){
    return this.nombre;
  }

  /**
    * Regresa un String con la descripcion de la macburguesa
    */
  public String getDescripcion(){
    return this.descripcion;
  }

  /**
    * Regresa un boolean que nos dice si una macburguesa es vegetariana
    */
  public boolean getQueso(){
    return this.queso;
  }

  /**
    * Regresa un boolean que nos dice si una macburguesa es vegetariana
    */
  public boolean getVegetariana(){
    return this.vegetariana;
  }
}
