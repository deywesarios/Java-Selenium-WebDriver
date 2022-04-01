package suport;

import com.github.javafaker.Faker;

public class DataUtils {

    static Faker faker = new Faker();

    public static String name = faker.name().firstName();
    public static String lastname = faker.name().lastName();
    public static String email = "@javateste.com.br";
    public static String sexo = "Male";
    public static String password = "12345";
    public static String address = faker.address().streetAddress();
    public static String city = "Java";
    public static String state = "Florida";
    public static String zipcode = "00001";
    public static String phone = "+55982260708";
    public static String alias = "Rua Se Vira nos 30";
}
