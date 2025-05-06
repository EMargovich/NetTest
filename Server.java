import java.io.*;
import java.net.*;
/*
 * Сервер для TextMessage
 */
public class Server {
    public static void main(String[] arg) {
// Создать ссылку на объект, который поступит от клиента
        TextMessage myTextMessage = null;
        try {
// Начать прослушивание сервером порта 11111
            ServerSocket myServerSocket = new ServerSocket(11111);
            System.out.println("Готов\n");
// Ждать здесь, пока клиент не попытается подключиться
            Socket incoming = myServerSocket.accept();
// Создать ObjectInputStream
            ObjectInputStream myInputStream = new
            ObjectInputStream(incoming.getInputStream());
// Произвести считывание объекта из сокета с клиентом
            myTextMessage = (TextMessage)myInputStream.readObject();
            System.out.println(myTextMessage.getName() + " : "
                    + myTextMessage.getTextMessage()+ "\n");
// Закрыть потоки
            myInputStream.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}