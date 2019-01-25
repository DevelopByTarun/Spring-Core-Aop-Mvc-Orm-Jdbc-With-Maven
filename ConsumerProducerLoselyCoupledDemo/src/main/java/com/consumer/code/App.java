package com.consumer.code;

import com.producer.code.IProducer;
import com.producer.code.Factory;
//import com.producer.code.Producer;

public class App 
{
    public static void main( String[] args )
    {
        IProducer ip = Factory.getProducer();
        System.out.println(ip.callProducer());        
    }
}
