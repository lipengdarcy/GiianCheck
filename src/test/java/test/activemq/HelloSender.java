/*package test.activemq;

mvn install:install-file -DgroupId=org.apache.activemq -DartifactId=activemq-all -Dversion=5.12.1 -Dpackaging=jar -Dfile=C:\Users\lipeng\Downloads\apache-activemq-5.12.1\activemq-all-5.12.1.jar 

 安装jar包到私服：
mvn deploy:deploy-file -DgroupId=org.apache.activemq -DartifactId=activemq-all -Dversion=5.12.1 -Dpackaging=jar -Dfile=C:\Users\lipeng\Downloads\apache-activemq-5.12.1\activemq-all-5.12.1.jar -Durl=http://localhost:8081/nexus/content/groups/public -DrepositoryId=nexus-releases

	
import javax.jms.JMSException;
import javax.jms.Session;

import javax.jms.Destination;
import javax.jms.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class HelloSender {

    *//**
     * @param args
     * jmsTemplate和destination都是在spring配置文件中进行配制的
     * Sender只使用了配置文件中的jmsFactory，jmsTemplate，还有destination这三个属性
     *//*
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/spring-jms.xml");
        JmsTemplate template = (JmsTemplate) applicationContext.getBean("jmsTemplate");
        Destination destination = (Destination) applicationContext.getBean("destination");
        template.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage("发送消息：Hello ActiveMQ Text Message2！");
            }
        });
        System.out.println("成功发送了一条JMS消息");
    }
}
*/