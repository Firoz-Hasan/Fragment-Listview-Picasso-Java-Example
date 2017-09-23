package com.bdjobs.training.day2.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.bdjobs.training.day2.Adapters.BaseAdapters;
import com.bdjobs.training.day2.Models.BaseDataModel;
import com.bdjobs.training.day2.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by FIROZ HASAN on 7/24/2017.
 */

public class FragmentC extends Fragment {

    ArrayList<BaseDataModel> basecontactDataModel =  new ArrayList<>();
    ListView baselistView;
    View rootview;



    public void populateData()
    {
        BaseDataModel bdm1 = new BaseDataModel("aaaaa", "bbbbb");
        BaseDataModel bdm2 = new BaseDataModel("ccccc", "dddddd");
        BaseDataModel bdm3 = new BaseDataModel("eeeee", "ffffff");
        BaseDataModel bdm4 = new BaseDataModel("aaaaa", "bbbbb");
        BaseDataModel bdm5 = new BaseDataModel("ccccc", "dddddd");
        BaseDataModel bdm6 = new BaseDataModel("eeeee", "ffffff");
        BaseDataModel bdm7 = new BaseDataModel("aaaaa", "bbbbb");
        BaseDataModel bdm8 = new BaseDataModel("ccccc", "dddddd");
        BaseDataModel bdm9 = new BaseDataModel("eeeee", "ffffff");
        BaseDataModel bdm10 = new BaseDataModel("aaaaa", "bbbbb");
        BaseDataModel bdm11 = new BaseDataModel("ccccc", "dddddd");
        BaseDataModel bdm12 = new BaseDataModel("eeeee", "ffffff");
        basecontactDataModel.add(bdm1);
        basecontactDataModel.add(bdm2);
        basecontactDataModel.add(bdm3);
        basecontactDataModel.add(bdm4);
        basecontactDataModel.add(bdm5);
        basecontactDataModel.add(bdm6);

        basecontactDataModel.add(bdm7);
        basecontactDataModel.add(bdm8);
        basecontactDataModel.add(bdm9);

        basecontactDataModel.add(bdm10);
        basecontactDataModel.add(bdm12);
        basecontactDataModel.add(bdm11);


    }

    public void initialize(View view){
        baselistView = (ListView) view.findViewById(R.id.BaseLV);
    }

    public void setBaseAdapter(){
        BaseAdapters baseAdapters =  new BaseAdapters(basecontactDataModel, getActivity());
        baselistView.setAdapter(baseAdapters);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        populateData();
        setBaseAdapter();

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.fragment_c_xml, container, false);
        initialize(rootview);
        return rootview;
    }



}



