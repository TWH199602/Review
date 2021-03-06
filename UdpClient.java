package Socket;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {

  public static void main(String[] args) throws IOException {
    DatagramSocket ds = new DatagramSocket();
    System.out.println("发送数据，输入fart结束:");
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String line = null;
    while ((line = bufferedReader.readLine()) != null) {
      System.out.println("发送数据，输入fart结束:");
      byte[] buf = line.getBytes();
      DatagramPacket dp = new DatagramPacket(buf, buf.length,
          InetAddress.getByName("192.168.11.213"),
          10000);
      ds.send(dp);
      if("fart".equals(line)){
        System.out.println("停止发送");
        break;
      }
    }
    ds.close();
  }
}
