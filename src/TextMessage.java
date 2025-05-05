import java.io.*;
import java.util.*;
public class TextMessage implements Serializable {
    public String name;
    public String message;
    // Конструктор класса TextMessage
    TextMessage(String n) {
        message = " ";
        name= n;
    }
    // Функция-геттер по отношению к объектам
    public String getName() {
        return name;
    }
    // Функция-геттер по отношению к объектам
    public String getTextMessage() {
        return message;
    }
    // Функция-сеттер по отношению к объектам
    public void setTextMessage(String inTextMessage) {
        message = inTextMessage;
    }
}