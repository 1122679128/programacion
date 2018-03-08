/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion7;

/**
 *
 * @author Lucho
 */
public class mamifero extends  animal {
    
    
    public boolean sangrecaliente;
    
      
        
        
        
      public  mamifero  (){
        
        
        
     
     
        
        
        
     }

    public mamifero(boolean sangrecaliente, float peso) {
        super(peso);
        this.sangrecaliente = sangrecaliente;
    }

    public mamifero(boolean  sangrecaliente) {
        this.sangrecaliente = sangrecaliente;
    }

    public boolean isSangrecaliente() {
        return sangrecaliente;
    }

    public void setSangrecaliente(boolean sangrecaliente) {
        this.sangrecaliente = sangrecaliente;
    }
    
    
      public void parir (){
        
        System.out.println("recien nacido");
        
         }
        
      public void amamantar (){
        
        System.out.println("para su desarrollo");
    
    
 } 
    
    
  
}
 
