package com.jsp.ecomApp.Service;

import com.jsp.ecomApp.dao.UserRepository;
import com.jsp.ecomApp.entity.User;
import com.jsp.ecomApp.exception.EmailExceptions;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
   private final UserRepository userRepository;

  public User findByEmail(String email){
      Optional<User> op =userRepository.findByEmail(email);

      if(op.isPresent()){
          return op.get();
      }
      else{
          throw new EmailExceptions("Email:"+email+"does not exist");
      }
   }

   public User createUser(User user){

      if(userRepository.existsByEmail(user.getEmail())){
          throw new EmailExceptions("email already exist");
       }
       return userRepository.save(user);
   }

   public String login(String email, String password){
      //Condition that check if email exists
      if(!(userRepository.existsByEmail(email))){
          throw new EmailExceptions(("Email does not exist"));
      }
      //Condition that checks if the  email and password matches
      else if(userRepository.MatchEmailWithPassword(email,password)){
          return "Succesfully Logged in";
       }

      return "Email and Password Does Not Match";
   }

//For updating never use jpq
    //For updatepassword
    //check if email exist
    // if exist
    // user.newpassword=user.oldpassword
    //then setpassword as new password
   public String updatePassword(String email, String newPassword,String oldPassword){
      if(userRepository.existsByEmail(email)){
          User user=  findByEmail(email); //1
          if(user.getPassword().equals(oldPassword)) {
              user.setPassword(newPassword);
              userRepository.save(user);

          }else{
              throw new EmailExceptions("Old Password and New Password Not matching");
          }
      }
      else{
          throw new EmailExceptions(("Email does not exist"));
      }
      return "Password Successfully Updated";
   }


}
