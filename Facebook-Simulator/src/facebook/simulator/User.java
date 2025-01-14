package facebook.simulator;

import java.util.ArrayList;

class User {

    private String name;
    private int limit = 5;
    private ArrayList<Post> posts;
    private ArrayList<Story> story;
    private ArrayList<User> friends;

  
    public User(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
        this.posts= new ArrayList<>();
        this.story= new ArrayList<>();
    }

    public void addFriend(User friend) {
        friends.add(friend);
        friend.friends.add(this);
    }

    public void addPost(Post post) {
        this.posts.add(post);
    }
    

    public ArrayList<User> getFriends() {
        return friends;
    }

    public int getLimit() {
        return limit;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }
    public ArrayList<Story> getStory() {
        return story;
    }
    public String getName() {
        return name;
    }

    void addStory(Story story) {
        this.story.add(story);
    }
}
