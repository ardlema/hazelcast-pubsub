package org.ardlema.hazelcast;

import com.hazelcast.core.*;
import java.util.Date;

public class Publisher {

    public static void main(String[] args) {
        HazelcastInstance hz = Hazelcast.newHazelcastInstance();
        ITopic<Date> topic = hz.getTopic("topic");
        topic.publish(new Date());
    }
}
