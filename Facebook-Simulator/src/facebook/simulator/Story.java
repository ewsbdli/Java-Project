package facebook.simulator;

class Story extends Content implements Shares, Likes {

    private String imageUrl;
    private String storyLifeSpan = "24hour";
    private int like = 0;
    private int share = 0;

    PrivacySetting StoryPrivacy;

    public Story(String image, String author, String timeCreats) {
        super(author, timeCreats);
        this.imageUrl = image;
    }

    public String getImage() {
        return imageUrl;
    }

    public void setImage(String image) {
        this.imageUrl = image;
    }

    public String getAge() {
        return storyLifeSpan;
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
