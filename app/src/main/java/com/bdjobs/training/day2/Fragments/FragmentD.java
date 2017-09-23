package com.bdjobs.training.day2.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.bdjobs.training.day2.Adapters.ListViewWithImageAdapter;
import com.bdjobs.training.day2.Models.ListviewModelwithImage;
import com.bdjobs.training.day2.R;

import java.util.ArrayList;

/**
 * Created by FIROZ HASAN on 7/24/2017.
 */

public class FragmentD extends Fragment {

    ArrayList<ListviewModelwithImage> LMI = new ArrayList<>();
    View rootview;
    ListView imageLV;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // return super.onCreateView(inflater, container, savedInstanceState);
        rootview = inflater.inflate(R.layout.fragment_d_xml, container, false);
        initializer(rootview);
        return rootview;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        populateData();
        setImageAdapter();
    }

    public void initializer(View view) {
        imageLV = (ListView) view.findViewById(R.id.imageLV);
    }

    public void setImageAdapter() {
        ListViewWithImageAdapter listViewWithImageAdapter = new ListViewWithImageAdapter(LMI, getActivity());
        imageLV.setAdapter(listViewWithImageAdapter);
    }

    public void populateData() {
        ListviewModelwithImage listviewModelwithImage1 = new ListviewModelwithImage("Ozark", "Welcome to the last resort", "http://i.imgur.com/rFLNqWI.jpg");
        ListviewModelwithImage listviewModelwithImage2 = new ListviewModelwithImage("Ozark", "Welcome to the last resort", "http://i.imgur.com/C9pBVt7.jpg");
        ListviewModelwithImage listviewModelwithImage3 = new ListviewModelwithImage("Ozark", "Welcome to the last resort", "http://i.imgur.com/rT5vXE1.jpg");
        ListviewModelwithImage listviewModelwithImage4 = new ListviewModelwithImage("Ozark", "Welcome to the last resort", "http://i.imgur.com/aIy5R2k.jpg");
        ListviewModelwithImage listviewModelwithImage5 = new ListviewModelwithImage("Ozark", "Welcome to the last resort", "http://i.imgur.com/MoJs9pT.jpg");
//sfdsdfdsffdsfsdf

        LMI.add(listviewModelwithImage1);
        LMI.add(listviewModelwithImage2);
        LMI.add(listviewModelwithImage3);
        LMI.add(listviewModelwithImage4);
        LMI.add(listviewModelwithImage5);
    }
}
