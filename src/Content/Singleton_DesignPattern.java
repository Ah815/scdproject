
package Content;

import Content.Content_Writing;

public class Singleton_DesignPattern {
               private static Singleton_DesignPattern instance = new Singleton_DesignPattern();

       public static Singleton_DesignPattern getInstance(){
       return instance;
       }
       
       public void updateWriting(MediatorPatternDemo model,Content_Writing  content_writing) {
   
       content_writing.displayData(model.getCriminal_ID(), model.getCriminal_Name(), model.getGender(),
       model.getTime_period(),model.getAge(),model.getAddress(),model.getCity(),model.getPhone_Number());
    }
}

    

