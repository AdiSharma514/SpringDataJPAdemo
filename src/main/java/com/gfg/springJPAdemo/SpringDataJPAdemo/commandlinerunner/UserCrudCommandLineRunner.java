package com.gfg.springJPAdemo.SpringDataJPAdemo.commandlinerunner;

import com.gfg.springJPAdemo.SpringDataJPAdemo.model.User;
import com.gfg.springJPAdemo.SpringDataJPAdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserCrudCommandLineRunner implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1=new User("Rod","Johnson");
        userRepository.save(user1);

        User user2=new User("Uncle","Bob");
        userRepository.save(user2);

        /*
        List<User> users=userRepository.findAll();

        System.out.println("Before Deletion : "+users);

        userRepository.delete(user1);
        users=userRepository.findAll();
        System.out.println("After Deletion : "+users);

        user2.setFirstName("Aunty");
        userRepository.save(user2);
        users=userRepository.findAll();
        System.out.println("After Updation : "+users);
        */
        userRepository.save(new User("Rod","Smith"));
        userRepository.save(new User("Uncle","Sam"));

        /*
        List<User> users=userRepository.findByFirstName("Rod");
        System.out.println("Users with first name 'Rod' : "+users);
        */
        List<User> users=userRepository.findByFirstNameAndLastName("Rod","Smith");
        System.out.println("Users with first name as 'Rod' and last name as 'Smith' : "+users);
    }
}
