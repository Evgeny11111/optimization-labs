package ru.sberbank.lab2.jsonvsproto;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import ru.sberbank.lab2.jsonvsproto.dto.Address;
import ru.sberbank.lab2.jsonvsproto.dto.Person;

import java.util.ArrayList;
import java.util.List;

public class JsonSerializeAndDeserialize {
    @Benchmark
    @Fork(value = 1, warmups = 2)
    @BenchmarkMode(Mode.Throughput)
    public static void serializationAndDeserializationJson() throws Throwable{
        ObjectMapper om = new ObjectMapper();
        List addresses = new ArrayList<>();
        addresses.add(new Address(7, "city", "street"));
        Person person = new Person("Vasya", "Pupkin",
                addresses);

        String json = om.writeValueAsString(person);

        Person read = om.readValue(json, Person.class);
//        System.out.printf("Read person: %s\n", read);
    }
}
