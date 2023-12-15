package ru.sberbank.lab2.jsonvsproto;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import ru.sberbank.lab2.protobuf.AddressBookProtos;

public class ProtoSerializeAndDeserialize {
    @Benchmark
    @Fork(value = 1, warmups = 2)
    @BenchmarkMode(Mode.Throughput)
    public static void serializationAndDeserializationProtobuf(){
        String firstName = "Vasya";
        String lastName = "Pupkin";
        int code = 7;
        String city = "city";
        String street = "street";

        AddressBookProtos.Person person = AddressBookProtos.Person.newBuilder()
                .setFirstName(firstName)
                .setLastName(lastName)
                .addAddresses(
                        AddressBookProtos.Person.Address.newBuilder()
                                .setCountryCode(code)
                                .setCity(city)
                                .setStreet(street)
                )
                .build();

        AddressBookProtos.PeopleBook peopleBook = AddressBookProtos.PeopleBook.newBuilder()
                .addPeople(person)
                .build();

//        System.out.println(peopleBook);
    }
}
