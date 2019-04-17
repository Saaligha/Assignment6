package Assignment6.domain;

import javafx.util.Builder;

public class User {

    private String userId, userName, userSname;
  //  private Set<Language> language;


    private User(){}

    private User(Builder builder){

        this.userId = builder.userId;
        this.userName = builder.userName;
        this.userSname = builder.userSname;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSname() {
        return userSname;
    }

    public static class Builder {
         private String userId, userName, userSname;

        public Builder UserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder UserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder UserSname(String userSname) {
            this.userSname = userSname;
            return this;
        }

        public User build(){ return new User(this);}
    }
}
