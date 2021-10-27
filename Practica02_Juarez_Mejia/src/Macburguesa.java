/**
    * Clase que define las caracteristicas de las hamburguesas de MacBurguesa
    */

public class Macburguesa{
  
  /**
    * Identificador de hamburguesas de acuerdo a su posicion
    * en el menu.
    */
  private int id;
  
  
  
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

  public Macburguesa(int id, String nombre, String descripcion, double precio, boolean queso, boolean vegetariana){

    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
    this.queso = queso;
    this.vegetariana = vegetariana;

  }

  public int getId(){
    return this.id;
  }

  public String getNombre(){
    return this.nombre;
  }

  public String getDescripcion(){
    return this.descripcion;
  }

  public boolean getQueso(){
    return this.queso;
  }

  public boolean getVegetariana(){
    return this.vegetariana;
  }
}
