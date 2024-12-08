/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facebook.simulator;

import java.util.ArrayList;

class Reel extends Content implements Shares, Likes {
    private String video;
    private int likes;
    private int share;
    PrivacySetting ReelPrivacy;
    private ArrayList<Comment> comments;

  

    public Reel(String video, int likes, PrivacySetting PostPrivacy, ArrayList<Comment> comments, String author, String timeCreats) {
        super(author, timeCreats);
        this.video = video;
        this.likes = 0;
        this.ReelPrivacy = PostPrivacy;
        this.comments = comments;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public int getLikes() {
        return likes;
    }

    public int getShare() {
        return share;
    }


  public void setReelPrivacy(PrivacySetting ReelPrivacy) {
        this.ReelPrivacy = ReelPrivacy;
    }
    public PrivacySetting getReelPrivacy() {
        return ReelPrivacy;
    }

  

    public ArrayList<Comment> getComments() {
        return comments;
    }

    

    @Override
    public void share() {
        share++;
        System.out.println("Shares by: " + getAuthor()+"Total Shares: "+share);
    }

    @Override
    public void like() {
        likes++;
        System.out.println("Reel liked, Total likes: "+likes);
    }
}

