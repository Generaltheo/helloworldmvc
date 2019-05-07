package helloworldmaven.model;

public class DAOHelloWorld {
    private String FileName = "HelloWorld.txt";
    private DAOHelloWorld instance = null;
    private String helloWorldMessage = null;


    private DAOHelloWorld() {

    }


    public DAOHelloWorld getInstance() {
        return instance;
    }


    public void setInstance(DAOHelloWorld instance) {
        this.instance = instance;
    }

    private void readFile() {
    }


    public String getHelloWorldMessage() {
        return helloWorldMessage;
    }


    public void setHelloWorldMessage(String helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }
}





