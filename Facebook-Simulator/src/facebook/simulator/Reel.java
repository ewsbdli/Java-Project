/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facebook.simulator;

class Reel extends Contentt implements Shares, Likes {
    private String video;
    private int likes;

    public Reel(String contentId, String author, String timeCreats, String video) {
        super(author, timeCreats);
        this.video = video;
        this.likes = 0;
    }

    @Override
    public void displayContent() {
        System.out.println("Reel by " + getAuthor() + " at " + gettimeCreats());
        System.out.println("Video: " + video);
        System.out.println("Likes: " + likes);
    }

    @Override
    public void share() {
        System.out.println("Shares by: " + getAuthor());
    }

    @Override
    public void like() {
        System.out.println(likes);
    }
}

