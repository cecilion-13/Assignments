package co.harsh.Assignment3.Q10;

public class Movie_Details {

    private String mov_Name;
    private String lead_actor;
    private String lead_actoress;
    private String genre;

    public String getMov_Name() {
        return mov_Name;
    }

    public void setMov_Name(String mov_Name) {
        this.mov_Name = mov_Name;
    }

    public String getLead_actor() {
        return lead_actor;
    }

    public void setLead_actor(String lead_actor) {
        this.lead_actor = lead_actor;
    }

    public String getLead_actoress() {
        return lead_actoress;
    }

    public void setLead_actoress(String lead_actoress) {
        this.lead_actoress = lead_actoress;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Movie_Details(String mov_Name, String lead_actor, String lead_actoress, String genre) {
        this.mov_Name = mov_Name;
        this.lead_actor = lead_actor;
        this.lead_actoress = lead_actoress;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie_Details{" +
                "mov_Name='" + mov_Name + '\'' +
                ", lead_actor='" + lead_actor + '\'' +
                ", lead_actoress='" + lead_actoress + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
