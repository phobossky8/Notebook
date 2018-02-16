package by.ldy.notebook.go;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
	private String ownerName;
	private String ownerSurname;

	private List<Note> notes;

	public NoteBook(String ownerName, String ownerSurname) {
		this.ownerName = ownerName;
		this.ownerSurname = ownerSurname;

		notes = new ArrayList<Note>();

	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerSurname() {
		return ownerSurname;
	}

	public void setOwnerSurname(String ownerSurname) {
		this.ownerSurname = ownerSurname;
	}

	public void add(String text, int year, int month, int day) {
		Note newNote = new Note(text, new Date(year, month, day), true);
		notes.add(newNote);
	}

	public Note findNote(String text) { //println
		for(Note note : notes) {
						
		}		
		return null;
	}
	
	public List<Note> findNote(Date d) {
		return null;
	}
	
	public void remove(String text) {
		
		notes.remove(new Note());
		
	}
	
}
