package com.signup_signin.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
// https://www.geeksforgeeks.org/spring-responsebody-annotation-with-example/
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="api/v1/registration")
@AllArgsConstructor  //ref to: https://www.javatpoint.com/lombok-java
public class RegistrationController {

    @ResponseBody  //ref to: https://www.geeksforgeeks.org/spring-responsebody-annotation-with-example/
    public String register(RegistrationRequest request) {
        //@ResponseBody Spring converts the return value and writes it
        // to the HTTP response automatically.

        return registrationService.register(request);
    }
}