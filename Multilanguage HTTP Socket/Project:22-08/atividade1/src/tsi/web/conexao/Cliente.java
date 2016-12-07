package tsi.web.conexao;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class Cliente {
   public static void main(String args[]) {
      String data = "Mensagem da Alegria";
      try {
         ServerSocket srvr = new ServerSocket(1234);
         Socket skt = srvr.accept();
         System.out.print("Servidor conectado!\n");
         
         PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
         System.out.print("Enviando: '" + data + "'\n");
         out.print(data);
         out.close();
         skt.close();
         srvr.close();
      }
      catch(Exception e) {
         System.out.print("Não foi possível se conectar ao cliente!\n");
      }
   }
}