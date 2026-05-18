package DomainEntities;

import JavaTesting.Resources.PasswordUtilis;

public class User {

    private String name;
    private String password;
    private String salt;


    public User(){
        this("Tomeu" , "secret");
    }

    public User(String name , String password){
        this.name = name;
        //this.password = password;
        this.salt = PasswordUtilis.genSalt();
        //falta fer hash amb salt del password !!
        this.password = PasswordUtilis.hashedPassword(password,this.salt);
    }


    public String getName(){
        return  name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean verifyPassword(String passwordEntered){
        return PasswordUtilis.verifyUserPassword(passwordEntered,salt,password);
    }

    public void setPassword( String password ) {
        this.password = PasswordUtilis.hashedPassword(password,salt);
    }
}
