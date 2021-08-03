
package abstractas;

public class AnimalCarnivoro extends Animal{

    @Override
    public void alimentarse() {
        super.alimentarse(); 
        System.out.println("de carne");
    }
    
    
    
}
