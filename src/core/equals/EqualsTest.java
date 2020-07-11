package core.equals;

public class EqualsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee Bob = new Employee("Bob Brandon", 50000, 1989, 10, 1);

        System.out.println("alice1 == alice2: \t" + (alice1 == alice2));
        System.out.println("alice1 == alice3: \t" + (alice1 == alice3));
        System.out.println("alice1.equals(alice3): \t" + (alice1.equals(alice3)));
        System.out.println("alice1.equals(Bob): \t" + (alice1.equals(Bob)));

        System.out.println("*************************************************");

        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        System.out.println("boss.toString(): \t" + boss);
        System.out.println("carl.equals(boss): \t" + carl.equals(boss));
        System.out.println("alice1.hashCode(): \t" + alice1.hashCode());
        System.out.println("alice2.hashCode(): \t" + alice2.hashCode());
        System.out.println("alice3.hashCode(): \t" + alice3.hashCode());
        System.out.println("Bob.hashCode(): \t" + Bob.hashCode());
        System.out.println("carl.hashCode(): \t" + carl.hashCode());

    }
}
