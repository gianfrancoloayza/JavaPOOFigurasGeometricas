
package bo.usfx.sis457.figuras;


public class Pentagono {
    private double Linea1;
    
    public Pentagono(double linea1) {
        this.Linea1 = linea1;
        
    }
    
   
    public Pentagono() {
        
        this(0);
    }

    public double getLinea1() {
        return Linea1;
    }

    public void setLinea1(double linea1) {
        this.Linea1 = linea1;
    }

   

    
    
    
    
    public double getArea() {
        return ((this.getPerimetro()*(this.Linea1/1.453))/2) ;
    }
    
    
    public double getPerimetro() {
        return(  this.Linea1 * 5  );
    }
}

   

