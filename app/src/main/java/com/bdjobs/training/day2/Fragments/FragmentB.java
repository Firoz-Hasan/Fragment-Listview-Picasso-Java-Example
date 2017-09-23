package com.bdjobs.training.day2.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.bdjobs.training.day2.Adapters.SampleListAdapter;
import com.bdjobs.training.day2.Models.ContactDataModel;
import com.bdjobs.training.day2.Models.ContactModel;
import com.bdjobs.training.day2.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by FIROZ HASAN on 7/24/2017.
 */

public class FragmentB extends Fragment {

    ArrayList <ContactDataModel> contactDataArray = new ArrayList<>();
    ListView fragmentLV;
    View rootview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.fragment_b_xml, container, false);
        initialization(rootview);
        return rootview;

    }
    
    public void initialization (View view){
        fragmentLV = (ListView) view.findViewById(R.id.FragmentLV);
    }

    public void setsamplelistitemadapter(){

        SampleListAdapter sampleListAdapter = new SampleListAdapter(getActivity(), contactDataArray);
        fragmentLV.setAdapter(sampleListAdapter);



    }

    public void preparesampleData(){

        ContactDataModel cdm = new ContactDataModel();
        cdm.setName("Rahim");
        cdm.setNumber("55555");
        cdm.setAddress("baridhara");
        cdm.setEmail("helo@yahoo.com");
        contactDataArray.add(cdm);

        ContactDataModel cdm1 = new ContactDataModel();
        cdm1.setName("karim");
        cdm1.setNumber("6666");
        cdm1.setAddress("abdullahpur");
        cdm1.setEmail("karim@yahoo.com");
        contactDataArray.add(cdm1);

        ContactDataModel cdm2 = new ContactDataModel();
        cdm2.setName("kkkkk");
        cdm2.setNumber("99999");
        cdm2.setAddress("dsfdsfsfs");
        cdm2.setEmail("sdfsffs@yahoo.com");
        contactDataArray.add(cdm2);

        ContactDataModel cdm3 = new ContactDataModel();
        cdm3.setName("wewewe");
        cdm3.setNumber("767776");
        cdm3.setAddress("rewrwewre");
        cdm3.setEmail("qqqqqq@yahoo.com");
        contactDataArray.add(cdm3);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        preparesampleData();
        setsamplelistitemadapter();
    }
}
