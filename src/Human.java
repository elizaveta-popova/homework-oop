public class Human {
    String name;
    int yearOfBirth;
    String town;
    String jobTitle;
    Human (String name, int yearOfBirth, String town, String jobTitle) {
        if (name==null || town==null || jobTitle == null) {
            System.out.println("Информация не указана");
        } else {
            this.name = name;
            this.town = town;
            this.jobTitle = jobTitle;
        }
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }

    }

    void hello () {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}
