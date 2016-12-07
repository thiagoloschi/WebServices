package tsi.web.conexao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

class ClienteTeste {
   public static void main(String args[]) {
      try {
         Socket skt = new Socket("localhost", 1234);
         BufferedReader in = new BufferedReader(new
            InputStreamReader(skt.getInputStream()));
         System.out.print("Recebendo: '");
         while (!in.ready()) {}
         System.out.println(in.readLine()); 
         System.out.print("'\n");
         in.close();
      }
      catch(Exception e) {
         System.out.print("Não foi possível conectar ao servidor!\n");
      }
   }
}