package ru.tenet.inet_shop.client;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.web.client.RestTemplate;
import ru.tenet.inet_shop.model.Registration;


public class client_write {

    public static void main(String args[])throws Exception {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:restful-client-app-context.xml");
        ctx.refresh();

        RestTemplate restTemplate = ctx.getBean("restTemplate", RestTemplate.class);


        Registration r =  restTemplate.postForObject("http://localhost:8080/registration/edit",22,
                    Registration.class);

        System.out.println(r.getUsername()+r.getBirthday());
    }

}
