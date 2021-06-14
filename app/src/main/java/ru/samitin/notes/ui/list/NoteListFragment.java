package ru.samitin.notes.ui.list;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import ru.samitin.notes.R;
import ru.samitin.notes.domain.Note;
import ru.samitin.notes.domain.NoteRepositories;
import ru.samitin.notes.domain.NoteRepositoriesImpl;

public class NoteListFragment extends Fragment {

    public interface OnNoteClicked{
        void onNoteClick(Note note);
    }
    NoteRepositories repositories;

    private OnNoteClicked onCityClicked;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnNoteClicked){
            onCityClicked=(OnNoteClicked)context;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        onCityClicked=null;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        repositories=new NoteRepositoriesImpl();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_note_list,container,false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LinearLayout noteList=view.findViewById(R.id.note_list_container);
        List<Note> notes=repositories.getNotes();
        for (Note note:notes){
            View itemView=LayoutInflater.from(requireContext()).inflate(R.layout.item_note,noteList,false);
            TextView cityName=itemView.findViewById(R.id.note_name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (onCityClicked!=null){
                        onCityClicked.onNoteClick(note);
                    }
                }
            });
            cityName.setText(note.getName());
            noteList.addView(itemView);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}