package JDBC;

import java.util.Scanner;

import javax.management.InvalidApplicationException;

import static java.lang.System.*;

import java.sql.SQLException;

public class Person {
	public static void main(String[]args) {
		
				Scanner output = new Scanner(System.in);
				try {
					System.out.println("Informe seu nome: ");
					String nome = output.next();
					Verification.verificationString(nome);

					System.out.println("Digite seu sobrenome: ");
					String sobrenome = output.next();
					Verification.verificationString(sobrenome);

					System.out.println("Digite sua idade: ");
					int idade = output.nextInt();
					System.out.println("Idade permitida");

					System.out.println("Digite seu bairro");
					String bairro = output.next();
					Verification.verificationString(bairro);

					Verification.insertTable(nome, idade, bairro, sobrenome);
					System.out.println("Dados inseridos com sucesso!");

					out.println("Resultado dos seus dados dentro da tabela! \n");
					Verification.selectTableConsult();

					Scanner outputUpdate = new Scanner(System.in);
					System.out.println("Deseja alterar algum usuario? \n Digite: \n 1 - Para alterar \n 2 - Para Deletar um usuario \n 3- Para sair");
					int user = outputUpdate.nextInt();

					if(user == 1) {
						Verification.UpdateTable();
					}else if (user == 2) {
						Verification.DeleteUser();
					} else if (user == 3) {
						System.exit(0);
					}

				} catch (SQLException e) {
					System.out.println("Erro ao inserir dados na tabela: " + e.getMessage());
				}
		}
	}

