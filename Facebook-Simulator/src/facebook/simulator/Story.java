/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facebook.simulator;

class Story extends Content implements Shares {

    private String image;
    private String age = "24hour";

    public Story(String author, String timeCreats, String age, String image) {
        super(author, timeCreats);
        this.image = image;
        this.age = age;
    }

    @Override
    public void share() {
        System.out.println("Story shared by " + getAuthor());
    }
}
