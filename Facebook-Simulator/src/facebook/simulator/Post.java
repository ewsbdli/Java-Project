/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facebook.simulator;
class Post extends Contentt implements Shares, Likes {
    private String textContent;
    private int likes;
    PrivacySetting  PostPrivacy;

    public PrivacySetting getPostPrivacy() {
        return PostPrivacy;
    }

    public int getLikes() {
        return likes;
    }

    public void setPostPrivacy(PrivacySetting PostPrivacy) {
        this.PostPrivacy = PostPrivacy;
    }
    public Post() {
    }

    public Post(String author, String timeCreats, String textContent) {
        super(author, timeCreats);
        this.textContent = textContent;
        this.likes = 0;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @Override
    public void displayContent() {
        System.out.println("Post by " + getAuthor() + " at " + gettimeCreats());
        System.out.println("Content: " + textContent);
        System.out.println("Likes: " + likes);
    }

    @Override
    public void share() {
        System.out.println(getAuthor());
    }

    @Override
    public void like() {
        likes++;
        //System.out.println("Post liked! Total likes: " + likes);
    }
}

