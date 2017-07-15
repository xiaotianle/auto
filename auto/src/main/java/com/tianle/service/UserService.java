package com.tianle.service;

import com.tianle.exception.UserException;
import com.tianle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.tianle.domain.User;
import org.springframework.stereotype.Service;


/**
 * Created by win7 on 2017/5/4.
 */
@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public User getOne(Integer id)
    {
        return userRepository.getOne(id);
    }

    public void getAge(Integer id) throws Exception{


        User user = userRepository.findOne(id);
        Integer age = user.getAge();
        if(age >= 50 && age <= 59 )
        {
            throw new UserException(100,"快退休了");
        }
        else if (age >=60 )
        {
            throw new UserException(101,"已经退休了");
        }



    }
}
