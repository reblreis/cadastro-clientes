//identificação do pacote
package principal;

import java.io.PrintWriter;

import entities.Cliente;

//declaração da classe
public class Program {
	
	//método para executar o projeto Java
	public static void main(String[] args) {
		
		//impressão
		//syso -> CTRL + espaço
		System.out.println("\n *** CADASTRO DE CLIENTES \n");
		
		//Criando um objeto para a classe Cliente
		Cliente cliente = new Cliente(); //CTRL+SHIFT+O
		
		cliente.setIdCliente(1);
		cliente.setNome("Sergio Mendes");
		cliente.setEmail("sergio.coti@gmail.com");
		cliente.setTelefone("21 96957-5900");
		cliente.setCpf("123.456.789-00");
		
		//gravando os dados do cliente em um arquivo
		try { //tentativa
			
		
			//abrindo um arquivo em modo de escrita
			PrintWriter printWriter = new PrintWriter("C:\\clientes\\cliente.txt");
			
			//escrevendo no arquivo:
			printWriter.write("\nID DO CLIENTE...: " + cliente.getIdCliente());
			printWriter.write("\nNOME............: " + cliente.getNome());
			printWriter.write("\nTELEFONE........: " + cliente.getTelefone());
			printWriter.write("\nEMAIL...........: " + cliente.getEmail());
			printWriter.write("\nCPF.............: " + cliente.getCpf());
			
			printWriter.flush(); //salvar as alterações do arquivo
			printWriter.close(); //fechar o arquivo
			
			System.out.println("Dados do cliente cadastrado com sucesso!");
		}
		
		catch(Exception e) { //captura do erro
			
			System.out.println("Erro ao cadastrar cliente");
			e.printStackTrace(); //imprimir o log (detalhamento) do erro
		
		}
	}	
}