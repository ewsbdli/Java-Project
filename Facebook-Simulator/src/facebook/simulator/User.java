package facebook.simulator;
import java.util.ArrayList;

class User {
    private String name;
    private ArrayList<User> friends;
    private ArrayList<Contentt> contents;

    public User (String name) {
        this.name = name;
        this.friends = new ArrayList<>();
        this.contents = new ArrayList<>();
    }

    public void addFriend(User friend) {
        if (!friends.contains(friend)) {
            friends.add(friend);
            friend.friends.add(this);
        }
    }

    public void addContent(Contentt content) {
        contents.add(content);
    }

    public void viewTimeline() {
        for (Contentt content : contents) {
            content.displayContent();
        }
    }

    public String getName() {
        return name;
    }
}
