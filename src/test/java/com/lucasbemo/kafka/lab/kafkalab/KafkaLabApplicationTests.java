package com.lucasbemo.kafka.lab.kafkalab;

import static org.assertj.core.api.Assertions.assertThat;

import avro.User;
import com.lucasbemo.kafka.lab.kafkalab.serializer.AvroDeserializer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.bind.DatatypeConverter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaLabApplicationTests {

	@Test
	public void contextLoads() {
	}

//    @Test
//    public void testDeserialize() {
//        Transaction tx = Transaction.newBuilder()
//                .setSuit("John Doe")
//                .setTransactionId("1")
//                .setTransactionStatusHistoryId("11")
//                .setTransactionStatusId("111")
//                .build();
//
//        byte[] data = DatatypeConverter.parseHexBinary("104A6F686E20446F6502000A677265656E");
//
//        AvroDeserializer<Transaction> avroDeserializer = new AvroDeserializer<>(Transaction.class);
//
//        assertThat(avroDeserializer.deserialize("transaction.avro", data)).isEqualTo(tx);
//        avroDeserializer.close();
//    }

}
