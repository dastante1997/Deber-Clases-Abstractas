
package abstractas;

public class AnimalHerbivoro extends Animal{

    @Override
    public void alimentarse() {
        super.alimentarse();
        System.out.println("de plantas");
    }
    
    
}
