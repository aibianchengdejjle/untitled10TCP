package com.company;

import java.util.ArrayList;
import java.util.List;

public class userdb {
    private static  List<User>users=new ArrayList<>();
    static {
        users.add(new User("张0","123456"));
        users.add(new User("张1","123456"));
        users.add(new User("张2","123456"));
        users.add(new User("张3","123456"));
    }

    public static List<User> getUsers() {
        return users;
    }

}
