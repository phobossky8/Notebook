package by.ldy.notebook.go;

import java.util.Comparator;

public class NoteComparator implements Comparator<Note> {

	@Override
	public int compare(Note arg0, Note arg1) {
		int year1;
		int year2;

		year1 = arg0.getDate().getYear();
		year2 = arg1.getDate().getYear();

		if (year1 > year2) {
			return 1;
		}
		
		if (year1 < year2) {
			return -1;
		}
		
		return 0;
	}

}
