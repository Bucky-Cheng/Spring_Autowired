package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoService {

    @Autowired
    AutoDao dao;

    //public void setAutoDao(AutoDao autoDao) {
      //  this.dao = autoDao;
    //}

    public void say(String word){
        dao.say(word);
    }

    public void itself(){
        System.out.println("ITSELF");
    }
}
