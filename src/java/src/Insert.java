package src;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {

    public static void main(String[] args) {
    
       Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
       Transaction transaction=session.beginTransaction();
       
       Answer a1=new Answer();
       a1.setAnswerName("C is a lang!");
       a1.setPostedBy("Rajeev");
       
       Answer a2=new Answer();
       a2.setAnswerName("C is a nothing!");
       a2.setPostedBy("Rahul");
       
       Answer a3=new Answer();
       a3.setAnswerName("Java is a lang!");
       a3.setPostedBy("Kuldeep");
       
       Answer a4=new Answer();
       a4.setAnswerName("Java is a nothing!");
       a4.setPostedBy("Ankit");
       
       List<Answer> l1=new ArrayList<Answer>();
       l1.add(a1);
       l1.add(a2);
       
       List<Answer> l2=new ArrayList<Answer>();
       l2.add(a3);
       l2.add(a4);
       
       Question q1=new Question();
       q1.setQname("What is C?");
       q1.setAnswers(l1);
       
       Question q2=new Question();
       q2.setQname("What is Java?");
       //q2.setAnswers(l2);
       
       
       
       session.persist(q1);
       session.persist(q2);
       
       transaction.commit();
       session.close();
       
        System.out.println("Success!");
       
    }
    
    
}
