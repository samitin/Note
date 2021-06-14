package ru.samitin.notes.domain;

import java.util.ArrayList;
import java.util.List;

import ru.samitin.notes.R;

public class NoteRepositoriesImpl implements NoteRepositories{
    @Override
    public ArrayList<Note> getNotes() {
        ArrayList<Note>arrayNote=new ArrayList<Note>();
        arrayNote.add(new Note(R.string.name_1,R.string.description_1,R.string.date_1,R.string.note_1));
        arrayNote.add(new Note(R.string.name_2,R.string.description_2,R.string.date_2,R.string.note_2));
        arrayNote.add(new Note(R.string.name_3,R.string.description_3,R.string.date_3,R.string.note_3));
        arrayNote.add(new Note(R.string.name_4,R.string.description_4,R.string.date_4,R.string.note_4));
        arrayNote.add(new Note(R.string.name_5,R.string.description_5,R.string.date_5,R.string.note_5));
        return arrayNote;
    }
}
