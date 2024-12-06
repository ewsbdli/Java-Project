/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facebook.simulator;

class Story extends Contentt implements Shares {

    private String image;
    private String age = "24hour";

    public Story(String contentId, String author, String timeCreats, String imageUrl) {
        super(author, timeCreats);
        this.image = imageUrl;
    }

    @Override
    public void displayContent() {
        System.out.println("Story by " + getAuthor() + " at " + gettimeCreats());
        System.out.println("Image: " + image);
    }

    @Override
    public void share() {
        System.out.println("Story shared by " + getAuthor());
    }
}
