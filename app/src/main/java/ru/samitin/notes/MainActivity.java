package ru.samitin.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import ru.samitin.notes.domain.Note;
import ru.samitin.notes.ui.list.NoteListFragment;
import ru.samitin.notes.ui.list.ditails.NoteDitailsFragment;

public class MainActivity extends AppCompatActivity implements NoteListFragment.OnNoteClicked {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onNoteClick(Note note) {
        boolean isLandscape = getResources().getBoolean(R.bool.isLandscape);
        if (isLandscape) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.notes_ditails_fragment, NoteDitailsFragment.newInstance(note))
                    .commit();
        } else {
            Intent intent = new Intent(this, NoteDetalsActivity.class);
            intent.putExtra(NoteDitailsFragment.ARG_NOTE, note);
            startActivity(intent);
        }
    }
}