package ru.samitin.notes.ui.list.ditails;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ru.samitin.notes.R;
import ru.samitin.notes.domain.Note;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NoteDitailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NoteDitailsFragment extends Fragment {

    public static String ARG_NOTE="ARG_NOTE";


    public static NoteDitailsFragment newInstance(Note note){
        NoteDitailsFragment fragment=new NoteDitailsFragment();
        Bundle bundle=new Bundle();
        bundle.putParcelable(ARG_NOTE,note);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note_ditails, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView nameDetals=view.findViewById(R.id.name_detals);
        TextView descriptionDetals=view.findViewById(R.id.description_detals);
        TextView dateDetals=view.findViewById(R.id.date_detals);
        TextView noteDetals=view.findViewById(R.id.note_detals);
        Note note=getArguments().getParcelable(ARG_NOTE);
        nameDetals.setText(note.getName());
        descriptionDetals.setText(note.getDescription());
        dateDetals.setText(note.getDate());
        noteDetals.setText(note.getNote());
    }
}