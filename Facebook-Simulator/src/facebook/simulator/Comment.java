/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facebook.simulator;

/**
 *
 * @author pc
 */
class Comment extends Post implements Likes{
    private int likes;

    public Comment(int likes, String author, String timeCreats, String textContent) {
        super(author, timeCreats, textContent);
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

 @Override
    public void like() {
        likes++;
}
}
