import com.github.javafaker.Faker;

import java.util.Date;

/**
 * Created by Ashutosh on 05-01-2017.
 */
public class GenerateTestData {

    //https://github.com/DiUS/java-faker

    public static void main(String[] args) {


        Faker faker=new Faker();

        System.out.println(faker.address().city());
        System.out.println(faker.address().country());


        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.name().username());


        System.out.println(faker.gameOfThrones().character());


        System.out.println(faker.date());

        System.out.println(faker.shakespeare().asYouLikeItQuote());
    }



}
