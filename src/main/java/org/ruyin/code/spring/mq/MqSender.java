package org.ruyin.code.spring.mq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class MqSender {

	public void sendMsg() throws Exception{
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		Connection connection = connectionFactory.createConnection();
		
		connection.start();
		
		Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue("my-queue");
		
		MessageProducer producer = session.createProducer(destination);
		for(int i=0;i<3;i++){
			TextMessage message = session.createTextMessage("This is test message");
			Thread.sleep(3000);
			producer.send(message);
		}
		session.commit();
		session.close();
		connection.close();
	}
	
	public static void main(String[] args) throws Exception {
		new MqSender().sendMsg();
	}
}
