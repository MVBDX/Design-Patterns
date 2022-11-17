package ir.mvbdx.designpatterns.behavioral.iterator;

import ir.mvbdx.designpatterns.behavioral.iterator.iterator.Iterator;
import ir.mvbdx.designpatterns.behavioral.iterator.iterator.List;
import ir.mvbdx.designpatterns.behavioral.iterator.iterator.Topic;
import ir.mvbdx.designpatterns.behavioral.iterator.iterator.TopicList;

public class Demo {
    public static void main(String[] args) {
        var topics = new Topic[5];

        topics[0] = new Topic("topic1");
        topics[1] = new Topic("topic2");
        topics[2] = new Topic("topic3");
        topics[3] = new Topic("topic4");
        topics[4] = new Topic("topic5");

        List<Topic> list = new TopicList(topics);
        Iterator<Topic> iterator = list.iterator();

        while (iterator.hasNext()) {
            Topic currentTopic = iterator.next();
            System.out.println(currentTopic.getName());
        }
    }
}
