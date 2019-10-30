package com.example.lovee.main.nearby;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lovee.R;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class AllNearbyFrag extends Fragment {

    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;

    ArrayList<Integer> personImages = new ArrayList<>();
    List<String> personName;

    public AllNearbyFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_all_users_nearby, container, false);

        personName = Arrays.asList("Person1", "Person2", "Person3", "Person4");
        personImages.add(R.drawable.btnfav_checkbox_invisible);
        personImages.add(R.drawable.person2);
        personImages.add(R.drawable.person3);
        personImages.add(R.drawable.person4);
        recyclerView = view.findViewById(R.id.recyclerView_nearby);
        gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);

//        FavAdapter usersAdapter = new FavAdapter(personName, personImages, getActivity());
//        recyclerView.setAdapter(usersAdapter); // set the Adapter to RecyclerView

        return view;

    }

}
