package facebook.simulator;

import java.util.ArrayList;

class User {

    private String name; 
    private int limit=5;
    private ArrayList<User> friends;

    public User(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }

    public void addFriend(User friend) {
            friends.add(friend);
            friend.friends.add(this);
    }

    public ArrayList<User> getFriends() {
        return friends;
    }

    public int getLimit() {
        return limit;
    }

    public String getName() {
        return name;
    }
}
