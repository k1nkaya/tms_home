package lesson6_h;

public class lesson6_hometask {
    public static void main(String[] args) {
        task1();
    }
    public static class CreditCard {
        private String accountNumber;
        private double balance;

        //конструктор
        public CreditCard(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
        }

        //метод для пополнения баланса
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Успешное внесение: " + amount + " на счет " + accountNumber);
            } else {
                System.out.println("Сумма внесения должна быть положительной.");
            }
        }

        //метод для снятия денег
        public void withdraw(double amount) {
            if (amount > 0) {
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println("Успешное снятие: " + amount + " со счета " + accountNumber);
                } else {
                    System.out.println("Недостаточно средств на счете " + accountNumber);
                }
            } else {
                System.out.println("Сумма снятия должна быть положительной.");
            }
        }

        //метод для вывода инфы о карте
        public void displayInfo() {
            System.out.println("Информация о карте:");
            System.out.println("Номер счета: " + accountNumber);
            System.out.println("Текущий баланс: " + balance);
        }
    }
    public static void task1 (){
        CreditCard card1 = new CreditCard("1234-5678-9012-3456", 1000.0);
        CreditCard card2 = new CreditCard("9876-5432-1098-7654", 5000.0);
        CreditCard card3 = new CreditCard("5555-5555-5555-5555", 3000.0);

        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
        System.out.println("--------------------");

        card1.deposit(500.0);
        card2.deposit(1000.0);
        card3.withdraw(2500.0);
        System.out.println("--------------------");

        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
    }
}
