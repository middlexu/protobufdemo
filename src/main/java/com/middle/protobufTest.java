package com.middle;

import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.Test;

/**
 * @author 15510
 * @create 2019-06-30 20:13
 */
public class protobufTest {
    @Test
    public void testN() throws InvalidProtocolBufferException {
        Model.Person.Builder builder = Model.Person.newBuilder();
        builder.setId(1);
        builder.setName("middle");
        builder.setEmail("middle@middle.com");

        Model.Person person = builder.build();
        System.out.println("before:" + person);

        System.out.println("===Person Byte:");
        for (byte b : person.toByteArray()) {
            System.out.print(b);
        }
        System.out.println("================");

        byte[] byteArray = person.toByteArray();
        Model.Person p2 = Model.Person.parseFrom(byteArray);
        System.out.println("after id:" + p2.getId());
        System.out.println("after name:" + p2.getName());
        System.out.println("after email:" + p2.getEmail());


        System.out.println("++++++++++++++++");

        Model.Student student = Model.Student.newBuilder().setId(2).setName("xiaoming").setScore(99.8).build();
        System.out.println(student);
        System.out.println("after: ");
        byte[] byteArray2 = student.toByteArray();
        Model.Student student2 = Model.Student.parseFrom(byteArray2);
        System.out.println(student2);

    }
}
