package fileHandling.jSon;

import com.google.gson.Gson;

public class GsonDemo {
    public static void main(String[] args) {
        getJson(new User("abc","def",10));
    }
//Serialization for saving object in file permanantly
    private static void getJson(User user) {
        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println(json);
        getObj(json);
    }
    //De_Serialization for reading java object in file
    private static void getObj(String json){
        Gson gson = new Gson();
        User user = gson.fromJson(json,User.class);
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getAge());
    }
}
