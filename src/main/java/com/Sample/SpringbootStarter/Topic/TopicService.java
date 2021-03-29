package com.Sample.SpringbootStarter.Topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service  //marks the class as Service--> create a new service and registers it
public class TopicService {

       private List<Topic> topics= new ArrayList<>(Arrays.asList(
                    new Topic("spring", "Spring Framework", "Spring framework Description"),
                    new Topic("Java", "Core Java", "Core Java Description"),
                    new Topic("Javascript", "Javascript", "Javascript Description")
                    // Main method run edilince bu 3 satir json formatta local machinede görülür
                ));

       public List<Topic> getAllTopics(){
           return topics;
       }

       public Topic getTopic(String id){
           return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
               //Get ile alinan degerin id'e esit olup olmadigi her seferinde kontrol ediliyor ve ilk topic'i return ediyor
       }


        public void addTopic(Topic topic) {
               topics.add(topic);

        }

        public void updateTopic(String id, Topic topic) {
           for (int i=0; i<topics.size();i++){
               Topic t=topics.get(i);
               if(t.getId().equals(id)){
                   topics.set(i,topic);
                   return;
               }
           }
        }

        public void deleteTopic(String id) {
           topics.removeIf(t-> t.getId().equals(id));
        }
}
