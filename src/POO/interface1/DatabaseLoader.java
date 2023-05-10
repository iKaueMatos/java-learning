package POO.interface1;

public class DatabaseLoader  implements DataLoader,DataRemover {


    @Override
    public void loader() {
        System.out.println("Carregando dados do banco de dados!");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados !");
    }

    @Override
    public void checkPermisson() {
        DataLoader.super.checkPermisson();
        System.out.println("Fazendo checagem de permissões dos arquivos dos dados");
    }
}
