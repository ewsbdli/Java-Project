package facebook.simulator;

import java.util.ArrayList;

class User {

    private String name;
    private ArrayList<User> friends;

    public User(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }

    public void addFriend(User friend) {
            friends.add(friend);
            friend.friends.add(this);
    }

    public String getName() {
        return name;
    }
}
