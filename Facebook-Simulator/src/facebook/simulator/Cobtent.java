/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facebook.simulator;

abstract class Contentt {
    private String author;
    private String timeCreats;

    public Contentt() {
    }

    public Contentt( String author, String timeCreats) {
        this.author = author;
        this.timeCreats = timeCreats;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTimeCreats(String timeCreats) {
        this.timeCreats = timeCreats;
    }

    public String getAuthor() {
        return author;
    }

    public String getTimeCreats() {
        return timeCreats;
    }

    public String gettimeCreats() {
        return timeCreats;
    }

    public abstract void displayContent();
}

