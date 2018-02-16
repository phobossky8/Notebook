package by.ldy.notebook.go;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class NoteBookTestDrive {

	public static void main(String[] args) throws CloneNotSupportedException {
		Note note1 = new Note("note1", new Date(2018, 2, 2), true);
		Note note2 = new Note("note1", new Date(2017, 3, 3), true);
		Note note3 = new Note("note1", new Date(2019, 4, 4), true);
		Note note4 = new Note("note1", new Date(2022, 5, 5), true);
		Note note5 = new Note("note1", new Date(2020, 6, 1), true);
		
		
	NoteBook notebook = new NoteBook ("James", "Phobossky");
	
	notebook.add("My spendings during January", 2018, 1, 31);
		
		//note1.compareTo(note2);
		
		/*TreeSet<Note> set = new TreeSet<Note>();
		
		set.add(note1);
		set.add(note2);
		set.add(note3);
		
		for(Note n : set) {
			System.out.println(n.getDate().getYear());
		}*/
		
		NoteComparator comparator = new NoteComparator();
		TreeSet<Note> set2 = new TreeSet<Note>(comparator);
		
		set2.add(note1);
		set2.add(note2);
		set2.add(note3);
		
		for(Note n : set2) {
			System.out.println(n.getDate().getYear());
		}
		
		
		
		// COmparable
		// Comparator

	}
}
