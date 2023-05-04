package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Verification {

    private  String nome;

    private String sobrenome;

    private int idade;

    private String bairro;


    public Verification(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public static void verificationString(String nome) {
        boolean alphabetic = Character.isAlphabetic((nome.charAt(nome.length() - 1)));
        if(Character.isAlphabetic(nome.charAt(0)) && alphabetic) {
            System.out.println("Correto!");
        }else{
            System.out.println("Esse nome não e permitido!");
        }
    }

    public static boolean verificationNumber(int idade){
        String idadeStr = Integer.toString(idade);
        boolean match = idadeStr.matches("\\d+");

        return match;
    }

   
    public static void insertTable(String nome,int idade, String bairro, String sobrenome) throws SQLException {
        Connection connector = Connector.getConectar();
        String sql = "INSERT INTO Clientes (nome, idade, bairro, sobrenome) VALUES (?, ?, ?, ?)";
        PreparedStatement executeQuery = connector.prepareStatement(sql);
        executeQuery.setString(1, nome);
        executeQuery.setInt(2, idade);
        executeQuery.setString(3, bairro);
        executeQuery.setString(4, sobrenome);

        executeQuery.execute();
        System.out.println("Dados inseridos com sucesso!");

        connector.close();
    }

    public static void selectTableConsult() throws SQLException {

        Connection connector = Connector.getConectar();
        String sql = "SELECT * FROM Clientes";
        PreparedStatement executeQuery = connector.prepareStatement(sql);
        ResultSet result = executeQuery.executeQuery();

        System.out.println("Todos os dados da sua tabela Cliente!");

        List<Dados> Clientes = new ArrayList<>();
        while (result.next()) {
            int id = result.getInt("id");
            String nome = result.getString("nome");
            String sobrenome = result.getString("sobrenome");
            String bairro = result.getString("bairro");
            int idade = result.getInt("idade");

            Clientes.add(new Dados(id, nome, sobrenome, idade, bairro));
        }

        for (Dados d : Clientes) {
            System.out.println(d.getId() + "|" + d.getNome() + "|" + d.getSobrenome() + "|" + d.getIdade() + "|" + d.getBairro());
        }

        connector.close();
    }

    public static void UpdateTable() throws SQLException {

            Scanner output = new Scanner(System.in);
            System.out.println("Informe o codigo da pessoa: ");
            int id = output.nextInt();

            Connection connector = Connector.getConectar();
            String Select = "SELECT id,nome FROM Clientes WHERE id = ?";
            String  Update = "UPDATE Clientes SET nome = ? WHERE id = ? ";
            PreparedStatement query = connector.prepareStatement(Select);
            query.setInt(1,id);

            ResultSet resultUpdate = query.executeQuery();

            if(resultUpdate.next()) {
                Dados p = new Dados(resultUpdate.getInt(1),resultUpdate.getString(2));

                System.out.println("O nome atual e: " + p.getNome());
                output.nextLine();

                System.out.println("Informe o novo nome: ");
                String newName = output.nextLine();

                query.close();
                query = connector.prepareStatement(Update);
                query.setString(1,newName);
                query.setInt(2,id);
                query.execute();

                System.out.println("Cliente alterado com sucesso!");

                connector.close();
            }
        }
    public static void DeleteUser() throws SQLException {
        Scanner usuarioDelete = new Scanner(System.in);
        System.out.println("Informe o Id do cliente: ");
        int id = usuarioDelete.nextInt();

        Connection connector = Connector.getConectar();
        String sqlDelete = "DELETE FROM Clientes WHERE id = ?";

        PreparedStatement queryEx = connector.prepareStatement(sqlDelete);
        queryEx.setInt(1,id);

        ResultSet count = queryEx.executeQuery();
        //executeUpdate -> ira retornar a quantidade de linhas que possivelmente foram afetadas com a exclusão de 1 usuario
        if(queryEx.executeUpdate() > 0) {
            System.out.println("Cliente excluido com sucesso");
            System.out.println("Linhas afetadas:"+ count);
        }else {
            System.out.println("Nenhum usuario foi excluido");
        }
        connector.close();
        usuarioDelete.close();
    }


    }

