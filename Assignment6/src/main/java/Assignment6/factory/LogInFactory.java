package Assignment6.factory;

import Assignment6.domain.LogIn;

public class LogInFactory {

    public static LogIn login(String userId,String password){
        return new LogIn.Builder().UserId(userId)
                .Password(password)
                .build();
    }
}
