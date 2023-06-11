package lr7.Example8;
import java.io.*;

    class MyClass implements Serializable {
        private String name;
        private int age;

        public MyClass(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public class ex8 {
        public static void main(String[] args) {
            MyClass obj = new MyClass("Иванов", 20);

            try (FileOutputStream fileOut = new FileOutputStream("src/lr7/Example8/testIn.txt");
                 ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                objectOut.writeObject(obj);
                System.out.println("Объект успешно сохранен в файл.");
            } catch (IOException e) {
                System.out.println("Ошибка при сохранении объекта: " + e.getMessage());
            }

            try (FileInputStream fileIn = new FileInputStream("src/lr7/Example8/testIn.txt");
                 ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
                MyClass restoredObj = (MyClass) objectIn.readObject();
                System.out.println("Объект успешно восстановлен из файла.");
                System.out.println("Имя: " + restoredObj.getName());
                System.out.println("Возраст: " + restoredObj.getAge());
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Ошибка при восстановлении объекта: " + e.getMessage());
            }
        }
    }