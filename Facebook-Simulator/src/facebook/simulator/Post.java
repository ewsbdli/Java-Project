/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facebook.simulator;

import java.util.ArrayList;

class Post extends Content implements Shares, Likes {

    private String textContent;
    private int likes;
    private int share;
    PrivacySetting PostPrivacy;
    private ArrayList<Comment> comments;

    public Post(String author, String timeCreats, String textContent) {
        super(author, timeCreats);
        this.textContent = textContent;
        this.likes = 0;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setPostPrivacy(PrivacySetting PostPrivacy) {
        this.PostPrivacy = PostPrivacy;
    }

    public PrivacySetting getPostPrivacy() {
        return PostPrivacy;
    }

    public int getShare() {
        return share;
    }

    public int getLikes() {
        return likes;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public String getTextContent() {
        return textContent;
    }

    @Override
    public void share() {
        share++;
    }

    @Override
    public void like() {
        likes++;
        //System.out.println("Post liked! Total likes: " + likes);
    }
}
