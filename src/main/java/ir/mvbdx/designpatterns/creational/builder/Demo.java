package ir.mvbdx.designpatterns.creational.builder;

public class Demo {
    public static void main(String[] args) {
        var user = new User.UserBuilder("Yashar", "Faalian")
                .setAge(34)
                .setPhone("0936123456")
                .setAddress("Fake address 1234")
                .build();

        System.out.println(user);

    }
}
