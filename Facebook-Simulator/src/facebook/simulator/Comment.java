
package facebook.simulator;

class Comment extends Post implements Likes{

    public Comment(String author, String timeCreats, String textContent, int likes) {
        super(author, timeCreats, textContent, likes);
    }

    @Override
    public void like() {
        super.like(); 
    }
    

}
