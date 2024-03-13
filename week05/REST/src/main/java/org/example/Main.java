package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;
import lombok.*;
import java.util.Arrays;
import java.util.List;

import static io.javalin.apibuilder.ApiBuilder.*;


public class Main {
    public static void main(String[] args) {
        ObjectMapper om = new ObjectMapper();
        ApplicationConfig applicationConfig = ApplicationConfig.getInstance();
        applicationConfig
                .initiateServer()
                .startServer(7070)
                .setExceptionHandling()
                .setRoute(() -> {

                })
                .setRoute(() -> {
            path("demo", () -> {
                get("test", ctx -> ctx.json("{\"msg\":\"Hello from server\"}"));
                get("error", ctx -> {throw new Exception("This is a test");});
            });
        });
//        List<Person> persons = Arrays.asList(
//                new Person("Alex", 21),
//                new Person("David", 23),
//                new Person("Lauritz", 25)
//        );
//
//
//        Javalin app = Javalin.create().start(7007);
//        app.get("/", ctx -> ctx.result("Hello World"));
//
//        app.get("/persons", ctx -> ctx.json(persons));
//        app.get("/person/(name)", ctx ->(
//                String name = ctx.pathParam("name"));
//        Person p = persons.stream().filter(person -> person.getName().equals(name)).findFirst().get();
//        ctx.json(p);
//        );
//
//        app.routes(
//                ()-> {
//                    path("person", () -> {
//                        get("/", ctx.json(persons));
//                        get("/(name)", ctx -> {
//                            String name = ctx.pathParam("name");
//                            Person p = persons.stream().filter(person -> person.getName().equals(name)).findFirst().get();
//                            ctx.json(p);
//                        });
//                        post("/", ctx->{
//                            Person incoming = ctx.bodyAsClass(Person.class);
//                                    ctx.json(incoming);
//                        });
//                            });
//                }
//        );
//        app.get("/date", ctx -> ctx.json(om.createObjectNode().put("current_date", java.time.localDate.now().toString() )));
//
//    }
//}
//
//        @Getter
//        @Setter
//        @ToString
//        @AllArgsConstructor
//        @NoArgsConstructor
//        @EqualsAndHashCode
//        class Person {
//            String name;
//            int age;
//        }
//    }
    }
}