import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.util.ArrayList;
public class  cadastro{
String nome;
 int telefone;
   ArrayList<String> cadastro  = new ArrayList(); 
 

  public void  insere_na_agenda(String nome, String telefone){
    
 
       cadastro.add(nome);
       cadastro.add(telefone);
  }
   public void mostra_os_cadastradados(){
     for (String a : cadastro)
          System.out.println("----------"+a);
     
            }


 
   public void gravar_txt(String nome, String telefone){

     try {
       
       
   
       
    FileWriter arq = new FileWriter("//servidor/DEPARTAMENTOS/PUBLICA/erbson.lavras/Agenda.txt"); 
    
      PrintWriter gravarArq = new PrintWriter(arq);
      BufferedWriter bw = new BufferedWriter(arq);
     
      bw.write("---------------- Agenda de Contatos --------------------");
       bw.newLine();
             bw.write("NOME :"); 
              
               bw.write(nome);
             bw.newLine();
             
            bw.newLine();
        bw.write("TELEFONE :"); 
      bw.write(telefone);
       bw.newLine();
      bw.write("-----------------------------------------");
     bw.close();
      //arquivoleitura.close();
     
      gravarArq.close();
 }catch (Exception ex) {
     System.out.println("ATENÇÃO NÃO CONSEGUI SALVAR ARQUIVO NO CAMINHO IFORMADO, VERIFIQUE O CAMINHO OUS AS PERMISSÕES DE REDE OU DE GRAVACAO NO DIRETORIO INFORMADO!"); 
 }  
   }
 
}


 
 




