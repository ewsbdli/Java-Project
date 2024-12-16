package facebook.simulator;

class Story extends Content implements Shares, Likes {

    private String image;
    private String age = "24hour";
    private int like = 0;
    private int share = 0;

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

    public int getLike() {
        return like;
    }

    public int getShare() {
        return share;
    }

    public PrivacySetting getStoryPrivacy() {
        return StoryPrivacy;
    }

    public void setStoryPrivacy(PrivacySetting StoryPrivacy) {
        this.StoryPrivacy = StoryPrivacy;
    }

    @Override
    public void share() {
        share++;
        System.out.println("Shares by: " + getAuthor() + " Total Shares: " + share);

    }

    @Override
    public void like() {
        like++;
        System.out.println("Reel liked, Total likes: " + like);
    }
}
