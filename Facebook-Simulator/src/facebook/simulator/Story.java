/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facebook.simulator;

class Story extends Content{

    private String image;
    private String age = "24hour";
        PrivacySetting StoryPrivacy;

    public Story(String image, PrivacySetting StoryPrivacy, String author, String timeCreats) {
        super(author, timeCreats);
        this.image = image;
        this.StoryPrivacy = StoryPrivacy;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public PrivacySetting getStoryPrivacy() {
        return StoryPrivacy;
    }

    public void setStoryPrivacy(PrivacySetting StoryPrivacy) {
        this.StoryPrivacy = StoryPrivacy;
    }
}
