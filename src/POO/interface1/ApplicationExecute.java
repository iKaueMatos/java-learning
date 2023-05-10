package POO.interface1;

public class ApplicationExecute {
    public static void main(String[] args) {

        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.loader();
        fileLoader.loader();
        fileLoader.remove();
        databaseLoader.remove();
        databaseLoader.checkPermisson();
        fileLoader.checkPermisson();

    }
}
