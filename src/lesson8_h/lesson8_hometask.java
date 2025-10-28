package lesson8_h;

public class lesson8_hometask {
    public static void main(String[] args) {
        // Создание объектов
        Animal myDog = new Dog();
        Animal myTiger = new Tiger();
        Animal myRabbit = new Rabbit();

        // Вызов методов для собаки
        System.out.println("Собака");
        myDog.voice();
        myDog.eat("Meat");
        myDog.eat("Grass");

        // Вызов методов для тигра
        System.out.println("\n Тигр");
        myTiger.voice();
        myTiger.eat("Meat");
        myTiger.eat("Grass");

        // Вызов методов для кролика
        System.out.println("\n Кролик");
        myRabbit.voice();
        myRabbit.eat("Grass");
        myRabbit.eat("Meat");
    }
    //родительсккий класс Animal
    public static class Animal {

        //метод для голос для подклассов
        public void voice() {
        }

        //метод есть для подклассов
        public void eat(String food) {
        }
    }
    public static class Dog extends Animal {

        @Override
        public void voice() {
            System.out.println("Гавкает!");
        }

        @Override
        public void eat(String food) {
            if (food.equalsIgnoreCase("Meat")) {
                System.out.println("Съел мясо");
            } else {
                System.out.println("Отказался есть");
            }
        }
    }
    public static class Tiger extends Animal {

        @Override
        public void voice() {
            System.out.println("Рычит");
        }

        @Override
        public void eat(String food) {
            if (food.equalsIgnoreCase("Meat")) {
                System.out.println("Съел мясо.");
            } else {
                System.out.println("Отказался есть");
            }
        }
    }
    public static class Rabbit extends Animal {

        @Override
        public void voice() {
            System.out.println("Издает какие-то звуки(пищит наверное)");
        }

        @Override
        public void eat(String food) {
            if (food.equalsIgnoreCase("Grass")) {
                System.out.println("Съел траву");
            } else {
                System.out.println("Отказался есть");
            }
        }
    }
}
