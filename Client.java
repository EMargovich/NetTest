import java.io.*;
import java.net.*;
/*
 * Клиент для TextMessage
 */
public class Client {
    public static void main(String[] arg) {
        try {
            String message = " ";
            String name = " ";
            System.out.print("Пожалуйста, введите имя: ");
            name = getString();
// Создать объект TextMessage
            TextMessage myTextMessage = new TextMessage(name);
            System.out.print("сообщение: ");
            message = getString();
// Использовать сеттер для задания TextMessage
            myTextMessage.setTextMessage(message);
// Создать подключение к сокету
            Socket socketToServer = new Socket("localhost", 11111);
// Создать ObjectOutputStream
            ObjectOutputStream myOutputStream = new
                    ObjectOutputStream(socketToServer.getOutputStream());
// Записать объект myTextMessage object в OutputStream
            myOutputStream.writeObject(myTextMessage);
// Закрыть потоки
            myOutputStream.close();
        } catch (Exception e) {System.out.println(e);}
    }
    public static String getString() throws Exception {
// открыть клавиатуру для ввода (с присвоением имени 'stdin')
        BufferedReader stdin =
                new BufferedReader(new InputStreamReader(System.in), 1);
        String s1 = stdin.readLine();
        return (s1);
    }
}