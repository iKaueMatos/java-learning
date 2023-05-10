package POO.interface1;

public class FileLoader implements DataLoader,DataRemover{
    @Override
    public void loader() {
        System.out.println("Carregando dados de um arquivo!");
    }

    @Override
    public void checkPermisson() {
        System.out.println("Fazendo checagem de permissões dos arquivos de texto!");
    }

    @Override
    public void remove() {
        System.out.println("Removendo arquivos!");
    }
}
