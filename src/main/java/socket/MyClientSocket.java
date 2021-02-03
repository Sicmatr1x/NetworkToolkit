package socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MyClientSocket {
    public static void main(String[] args) {
        try {
            Socket socket =new Socket("127.0.0.1",9999);
            BufferedWriter bufferedWriter =new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String str="socket";
            bufferedWriter.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
