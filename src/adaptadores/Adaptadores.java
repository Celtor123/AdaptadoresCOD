package adaptadores;

public class Adaptadores {
    /**
     * 
     * @editor Celso 
     * @param args 
     */
    public static void main(String[] args) {
        MediaPlayer player = new MP3();
        player.play("file.mp3");
        player = new FormatAdapter(new MP4());
        player.play("file.mp4");//mp4 playFILE
        player = new FormatAdapter(new VLC());
        player.play("file.avi");
        player = new FormatAdapter(new Avi());
        player.play("file.avi");
        
    }

    private static class FormatAdapter implements MediaPlayer {

        private MediaPackage media;
        private MediaDivX a;
        public FormatAdapter(MediaPackage m) {
            media = m;
        }
        public FormatAdapter(MediaDivX r) {
            a =r;
        }
        


        @Override
        public void play(String filename) {
            System.out.print("Using Adapter --> ");
            try{
            media.playFile(filename);}
            catch(Exception error){}
            try{
            a.playFilm(filename);
            }catch(Exception error2){}
        }
    
    }
}
