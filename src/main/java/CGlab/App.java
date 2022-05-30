package CGlab;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    String version = "0.02";

    public static void main(String[] args) {

        System.out.println("=========ARGS=========");
        System.out.println("Ścieżka obrazka:");
//        System.out.println(args[0]);
        System.out.println("Szerokość obrazka:");
//        System.out.println(args[1]);
        System.out.println("====================");
        System.out.println("Wysokość obrazka:");
//        System.out.println(args[2]);
        System.out.println("Metoda rysowania:");
//        System.out.println(args[3]);
        System.out.println("====================");
        Renderer mainRenderer = new Renderer("img/image.png", 800, 800,"NAIVE");
        mainRenderer.clear();
        mainRenderer.drawPoint( 800, 800);
//      mainRenderer.drawLine(0,0,100, 100, Renderer.LineAlgo.valueOf("NAIVE"));

        mainRenderer.clear();
        mainRenderer.drawLine(50,50,100, 50 +5, Renderer.LineAlgo.valueOf("NAIVE"));// Oktanty:1
//        mainRenderer.drawLine(50,50,100, 5, Renderer.LineAlgo.valueOf("NAIVE"));// Oktanty:1
//        mainRenderer.drawLine(50,50,50, 5,  Renderer.LineAlgo.valueOf("NAIVE"));// Oktanty:0

//        mainRenderer.drawLine(50,50,0, 5,  Renderer.LineAlgo.valueOf("NAIVE"));// Oktanty:0
//        mainRenderer.drawLine(50,50,0, 50+5,  Renderer.LineAlgo.valueOf("NAIVE"));// Oktanty:0

//        mainRenderer.drawLine(50,50,0, 100 -5,  Renderer.LineAlgo.valueOf("NAIVE"));// Oktanty:0
//        mainRenderer.drawLine(50,50,50, 100 -5,  Renderer.LineAlgo.valueOf("NAIVE"));// Oktanty:0
//        mainRenderer.drawLine(50,50,100, 100 -5,  Renderer.LineAlgo.valueOf("NAIVE"));// Oktanty:1

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
