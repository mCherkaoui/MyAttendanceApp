package mdc.myattendanceapp.Fragments;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mdc.myattendanceapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttendantsFragment extends Fragment {


    public AttendantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_attendants, container, false);
    }


}
