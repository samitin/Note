package ru.samitin.notes;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import ru.samitin.notes.domain.Note;
import ru.samitin.notes.ui.list.ditails.NoteDitailsFragment;


public class NoteDetalsActivity extends AppCompatActivity
    {

        public static final String ARG_NOTE="ARS_NOTE";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_note_ditails);

            Note note = getIntent().getParcelableExtra(ARG_NOTE);
            if (savedInstanceState == null) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, NoteDitailsFragment.newInstance(note))
                        .commit();
            }

        }
}