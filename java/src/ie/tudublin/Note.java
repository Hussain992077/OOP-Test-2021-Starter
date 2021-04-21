package ie.tudublin;

import processing.data.TableRow;

public class Note {
    private String note;
    private int duration;
    private String Type;
    
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }
    public Note(String note, int duration, String type) {
        this.note = note;
        this.duration = duration;
        this.Type = type;
    }
    @Override
    public String toString() {
        return "Note [Type=" + Type + ", duration=" + duration + ", note=" + note + "]";
    }

    public Note(TableRow r)
    {
        this(r.getString("note"),r.getInt("duration"),r.getString("Type"));
    }
    

}
