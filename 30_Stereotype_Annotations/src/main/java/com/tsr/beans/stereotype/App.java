package com.tsr.beans.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tsr.beans.stereotype.Bike;
import com.tsr.beans.stereotype.Car;
import com.tsr.beans.stereotype.Plain;
import com.tsr.beans.stereotype.Train;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/tsr/beans/stereotype/application-context.xml");
      
      Bike bike = applicationContext.getBean("bike", Bike.class);
      bike.ride();
      
      Train train  = applicationContext.getBean("train",Train.class);
      train.ride();
      
      Car car  = applicationContext.getBean("car",Car.class);
      car.ride();
      
      Plain plain  = applicationContext.getBean("plain",Plain.class);
      plain.ride();
      
      Rocket rocket = applicationContext.getBean("pulseRocket",Rocket.class);
      rocket.ride();
    }
}
