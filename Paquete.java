import java.util.Random;
/**
 *  Un objeto de esta clase guarda los datos de un paquete
 * 
 * @author - Carlos Arevalo
 *  
 */
public class Paquete 
{
    private Random generador;
    private Dimension dimension;
    private double peso;
    private double alto;
    private double ancho;
    private double largo;
    private double volumen;
    private double pesoVolumetrico;
    
    /**
     * Constructor 1 sin parámetros
     * Crea el paquete con 40 , 30, 50 de
     * alto, ancho, largo (en cm) y peso 8 Kg
     */
    public Paquete()    {
        double alto = 40;
        double ancho = 30;
        double largo = 50;
        double peso = 8;

    }

    /**
     * Constructor 2 
     *  Crea el paquete con el alto, ancho, largo (en cm) indicados
     *  y peso un valor aleatorio entre 2 y 8 Kg inclusive
     *  Se crea aquí el generador
     */
    public Paquete(double alto, double ancho, double largo)    {
        int peso = (int)(Math.random()*8) + 2; 
    }

    /**
     * Constructor 3 
     * Crea el paquete a la dimension y peso indicados
     * 
     */
    public Paquete(Dimension dimension, double peso)    {
        
    }

    /**
     * accesor para la dimensión
     */
    public Dimension getDimension() {
        return this.dimension;
    }

    /**
     * accesor para el peso
     */
    public double getPeso() {
        return this.peso;
    }

    /**
     * calcula y devuelve el volumen del paquete (en cm3)
     * El volumen = alto x ancho x largo
     */
    public double calcularVolumen(double alto, double ancho, double largo) {
        volumen = alto * ancho * largo;      
        System.out.println("Volumen del paquete: " + volumen); 
        return volumen;
    }

    /**
     * calcula y devuelve el peso volumétrico del paquete (en Kg)
     * Peso volumétrico = volumen del paquete / 5000
     */
    public double calcularPesoVolumetrico(double Volumen) {
        pesoVolumetrico = this.volumen/5000;       
        System.out.println("Peso volumetrico del paquete: " + pesoVolumetrico );
        return pesoVolumetrico;
    }

    /**
     *  Devuelve el peso facturable de un paquete
     *  Siempre es el valor mayor entre su peso real y su peso volumétrico
     *      
     */
    public double calcularPesoFacturable() {
        if(peso>pesoVolumetrico){
            System.out.println("Peso Facturable: " + peso);
            return peso;
        }
        else{
            System.out.println("Peso Facturable: " +  pesoVolumetrico);
            return pesoVolumetrico;
        }
    }

    /**
     * Devuelve una copia exacta al objeto actual
     * Se obtienen copias también de los objetos que contenga
     */
    public Paquete obtenerCopia(Paquete copiaPaquete) {
        Paquete obtenerCopia = copiaPaquete;
        return obtenerCopia;
    }

    /**
     * Representación textual del paquete
     *  (leer enunciado)
     */
    public String toString() {
        String paquete = "";
        paquete = paquete + " alto = " + alto + "\n" + " ancho = " + ancho + "\n" + " largo = " + largo + "\n" + "(cm)";            
        return paquete;
    }
    
    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Paquete
     */
    public void print() {
        System.out.println(this.toString());
    }
}
