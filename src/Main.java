public class Main {
    public static void main(String[] args) {
       Human Max = new Human("Максим", 1988,"Минск", "бренд-менеджер");
       Human Ann = new Human("Анна", 1993, "Москва", "методист образовательных программ");
       Human Kate = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
       Human Artem = new Human("Артём", 1995, "Москва", "директор по развитию бизнеса");

       Max.hello();
       Ann.hello();
       Kate.hello();
       Artem.hello();

    }
}