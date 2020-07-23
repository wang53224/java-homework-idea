package core.constructor;

/*  重载构造器
 *  用this调用另一个构造器
 *  无参数构造器
 *  对象初始化块
 *  静态初始化块
 *  实例域初始化
 */
public class ConstructorTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Bob", 40000);
        staff[1] = new Employee(6000);
        staff[2] = new Employee();

        for (Employee e : staff)
            System.out.println("name = " + e.getName() + ",id = " + e.getId() + ",salary = " + e.getSalary());

    }
}
