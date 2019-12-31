import java.util.Scanner;
public class Agenda{
  public static void main(String args[]){
   String nome;
         String telefone;
         Scanner ler = new Scanner(System.in); 
    
         cadastro ca = new cadastro();
         System.out.println("-----------Departamento de Cadastro------------");
         System.out.println("insira o nome da pessoa");
   
        nome = ler.nextLine();
         System.out.println("insira o numero de telefone do contato");
   
        telefone = ler.nextLine();

         ca.insere_na_agenda(nome,telefone);
    
         //ca.mostra_os_cadastradados();
     System.out.println("Os seguintes dados foram cadastrados com sucesso: \b");
     ca.gravar_txt(nome,telefone);
            ca.mostra_os_cadastradados();
    }
         
  
         
  }
