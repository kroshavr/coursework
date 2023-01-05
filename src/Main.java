public class Main {
    public static void main(String[] args) {
        Employee[] person = new Employee[10];
        person[0] = new Employee("Романов Александр Семёнович", 1, 55000);
        person[1] = new Employee("Овчинникова Кира Марковна", 2, 61000);
        person[2] = new Employee("Розанов Илья Константинович", 3, 59000);
        person[3] = new Employee("Петров Даниил Даниилович", 4, 30000);
        person[4] = new Employee("Смирнов Ибрагим Александрович", 5, 105000);
        person[5] = new Employee("Баранов Иван Макарович", 2, 66000);
        person[6] = new Employee("Курочкин Адам Иванович", 3, 70000);
        person[7] = new Employee("Потапов Егор Демидович", 4, 56000);
        person[8] = new Employee("Тимофеева София Даниловна", 5, 578000);
        person[9] = new Employee("Буров Иван Дмитриевич", 3, 63000);

        ListOfEmploees(person);
        SalarySum(person);
        MinSalary(person);
        MaxSalary(person);
        AverageSalary(person);
        FullName(person);
    }
    public static void ListOfEmploees(Employee[] person) {
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
    public static int SalarySum (Employee[] person) {
        int salarySum = 0;
        for (int i = 0; i < person.length; i++) {
            salarySum = salarySum + person[i].getSalary();
        }
        System.out.println("\nСумма затрат на зарлпаты за месяц составил " + salarySum);
        return salarySum;
    }
    public static void MinSalary (Employee[] person) {
        int min = 5000000;
        String name = "";
        for (int i = 0; i < person.length; i++) {
           if (person[i].getSalary() < min) {
               min = person[i].getSalary();
               name = person[i].getName();
           }
        }
        System.out.println("\nМинимальная зарпалата " + min + " рублей у " + name);
    }
    public static void MaxSalary (Employee[] person) {
        int max = 10;
        String name = "";
        for (int i = 0; i < person.length; i++) {
            if (person[i].getSalary() > max) {
                max = person[i].getSalary();
                name = person[i].getName();
            }
        }
        System.out.println("\nМаксимальная зарплата " + max + " рублей у " + name);
    }
    public static void AverageSalary (Employee[] person) {
        int average;
        average = SalarySum(person) / person.length;
        System.out.println("\nСредняя зарплата составила " + average + " рублей");
    }
    public static void FullName (Employee[] person) {
        System.out.println("\nФИО всех сотрудников:");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getName());
        }
    }
}