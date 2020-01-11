import java.io.IOException;
import java.net.*;

public class Client {

    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        int i = 10;
        byte[] b = String.valueOf(i).getBytes();
        InetAddress ai = InetAddress.getLocalHost();
        DatagramPacket dp = new DatagramPacket(b, b.length, ai, 9999);
        ds.send(dp);

        byte[] b1 = new byte[1024];
        DatagramPacket dp1 = new DatagramPacket(b1, b1.length);
        ds.receive(dp1);
        String str = new String(dp1.getData());
        System.out.println("result = " + str);
    }
}
