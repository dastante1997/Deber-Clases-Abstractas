
package abstractas;

import java.util.ArrayList;

public class EjercicioAbstractas {

   
    public static void main(String[] args) {
        ArrayList<SerVivo> seresVivos = new ArrayList<>();
        
        seresVivos.add(new Planta());
        seresVivos.add(new AnimalCarnivoro());
        seresVivos.add(new AnimalHerbivoro());
        
        for (SerVivo serVivo : seresVivos) {
            serVivo.alimentarse();
        }
        
    }
    
}
