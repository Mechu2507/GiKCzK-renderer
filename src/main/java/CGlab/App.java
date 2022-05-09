package CGlab;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    String version = "0.02";

    public static void main(String[] args) {

        System.out.println("=========ARGS=========");
        System.out.println("path to png file:");
        System.out.println(args[0]);
        System.out.println("png width:");
        System.out.println(args[1]);
        System.out.println("====================");
        System.out.println("png height:");
        System.out.println(args[2]);
        System.out.println("====================");
        Renderer mainRenderer = new Renderer(args[0]);
        mainRenderer.clear();
        mainRenderer.drawPoint( Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        try {
            mainRenderer.save();
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getVersion() {
	return this.version;
    }
}
