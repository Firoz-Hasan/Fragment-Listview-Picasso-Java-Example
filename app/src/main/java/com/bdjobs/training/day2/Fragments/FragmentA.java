package com.bdjobs.training.day2.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.bdjobs.training.day2.Adapters.SampleAdapter;
import com.bdjobs.training.day2.Models.ContactModel;
import com.bdjobs.training.day2.R;

import java.util.ArrayList;

/**
 * Created by FIROZ HASAN on 7/24/2017.
 */

public class FragmentA extends Fragment {

    // Context context;
    View rootView;
    ListView homeLV;
    ArrayList<ContactModel> contactModels = new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_a_xml, container, false);
        intialization(rootView);
        return rootView;
    }

    private void setAdapter() {
        SampleAdapter sampleAdapter = new SampleAdapter(getActivity(),contactModels);
        homeLV.setAdapter(sampleAdapter);



    }

    private void intialization(View view) {
        homeLV = (ListView) view.findViewById(R.id.homeLV);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        prepareSampleData();
        setAdapter();

        // Toast.makeText(context,"enter into onactivitycreated FRAGMENT A", Toast.LENGTH_SHORT).show();
    }

    private void prepareSampleData() {

        for(int i=0;i<20;i++)
        {
            ContactModel contactModel = new ContactModel();
            contactModel.setName("Name"+String.valueOf(i));
            contactModel.setMobileNumber(String.valueOf(i)+String.valueOf(i));
            contactModels.add(i,contactModel);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        //Toast.makeText(context,"enter into onstart FRAGMENT A", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        // this.context=context;
        //Toast.makeText(context,"enter into onattach FRAGMENT A", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Toast.makeText(context,"enter into oncreate FRAGMENT A", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        // Toast.makeText(context,"enter into onresume FRAGMENT A", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        //Toast.makeText(context,"enter into onpause FRAGMENT A", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
        //Toast.makeText(context,"enter into onstop FRAGMENT A", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // Toast.makeText(context,"enter into ondestroyview FRAGMENT A", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        // Toast.makeText(context,"enter into ondestroy FRAGMENT A", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        //Toast.makeText(context,"enter into ondetach FRAGMENT A", Toast.LENGTH_SHORT).show();
    }
}
