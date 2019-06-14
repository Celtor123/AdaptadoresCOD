
package adaptadores;

public class Avi implements MediaDivX{

    @Override
    public void playFilm(String filename) {
        System.out.println("Playing avi File "+filename);
    }
    
}
