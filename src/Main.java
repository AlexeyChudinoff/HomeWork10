public class Main {

  public static void main(String[] args) {

    int nomerZadania = 01;
    System.out.println();
    System.out.println("Задание  " + nomerZadania++);// следующий номер задания

    String firstName = "Ivan";
    String midlNname = "Ivanovich";
    String lastName = "Ivanov";
    String fullName = firstName + " " + midlNname + " " + lastName;
    System.out.println("Ф.И.О. сотрудника = " + fullName);

    System.out.println();
    System.out.println("Задание  " + nomerZadania++);

    System.out.println(
        "Данные Ф.И.О. сотрудника для заполнения отчёта - " + fullName.toUpperCase());

    System.out.println();
    System.out.println("Задание  " + nomerZadania++);

    String fullName1 = "Иванов Семён Семёнович";
    fullName1 = fullName1.replace('ё', 'е');
    System.out.println("Данные Ф. И. О. сотрудника - " + fullName1);


  }
}