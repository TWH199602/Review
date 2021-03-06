package Socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UdpServer {

  public static void main(String[] args) throws IOException {
    DatagramSocket ds = new DatagramSocket(10000);
    byte[] bytes = new byte[1024];
    while (true){
      DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
      System.out.println("Ready to receive:");
      ds.receive(dp);
      byte[] data = dp.getData();
      String received = new String(data, 0 , dp.getLength());
      if("fart".equals(received)){
        System.out.println("停止接收");
        break;
      }

      System.out.println("After received");
      System.out.println(received);

    }

     ds.close();
  }
}
