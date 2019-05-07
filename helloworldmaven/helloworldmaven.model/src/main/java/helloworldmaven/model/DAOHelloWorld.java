package helloworldmaven.model;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DAOHelloWorld {
    private String FileName = "HelloWorld.txt";
    private DAOHelloWorld instance = null;
    private String helloWorldMessage = null;


    DAOHelloWorld() {
    	this.readFile();
    }


    public DAOHelloWorld getInstance() {
        return this.instance;
    }


    public void setInstance(DAOHelloWorld instance) {
        this.instance = instance;
    }

    private void readFile() {
    	try {
            this.setHelloWorldMessage(Files.readAllLines(Paths.get(this.FileName)).get(0));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public String getHelloWorldMessage() {
        return this.helloWorldMessage;
    }


    public void setHelloWorldMessage(String helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }
}





