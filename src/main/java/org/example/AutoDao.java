package org.example;


import org.springframework.stereotype.Repository;

@Repository
public class AutoDao {


    public void say(String word){
        System.out.println("DAO SAY:"+word);
    }
}
