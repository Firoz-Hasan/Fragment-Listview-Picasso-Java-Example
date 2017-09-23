package com.bdjobs.training.day2.Adapters;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.bdjobs.training.day2.Models.ContactDataModel;
import com.bdjobs.training.day2.Models.ContactModel;
import com.bdjobs.training.day2.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

import static com.bdjobs.training.day2.R.id.sampleNameTV;
import static com.bdjobs.training.day2.R.id.sampleNameTV1;

/**
 * Created by FIROZ HASAN on 7/25/2017.
 */

public class SampleListAdapter extends ArrayAdapter{
    ArrayList <ContactDataModel> cdmsampleadaptor = new ArrayList<>();
    Context context;
    LayoutInflater inflater;


    public SampleListAdapter(Context context, ArrayList<ContactDataModel> cdmsampleadaptor) {
        super(context, R.layout.sample_list_item_part2,cdmsampleadaptor);

        this.cdmsampleadaptor = cdmsampleadaptor;
        this.context = context;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //-----------------viewHolder_initialization-----------------------------------------//

        ViewHolderSampleListItempart2 viewHolderSampleListItempart2 = new ViewHolderSampleListItempart2();

        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_list_item_part2, parent, false);

            viewHolderSampleListItempart2.nameTVSample2 = (TextView) convertView.findViewById(R.id.sampleNameTV1);
            viewHolderSampleListItempart2.numberTVSample2 = (TextView) convertView.findViewById(R.id.sampleNumberTV1);
            viewHolderSampleListItempart2.addressTVSample2 = (TextView) convertView.findViewById(R.id.sampleAddressTV1);
            viewHolderSampleListItempart2.emailTVSample2 = (TextView) convertView.findViewById(R.id.sampleEmailTV1);

            convertView.setTag(viewHolderSampleListItempart2);
        }
        else
        {
            viewHolderSampleListItempart2 = (ViewHolderSampleListItempart2) convertView.getTag();

        }
//--------------Logic_set_below_this_line-------------------------------------------//
        viewHolderSampleListItempart2.nameTVSample2.setText( cdmsampleadaptor.get(position).getName());
        viewHolderSampleListItempart2.numberTVSample2.setText(cdmsampleadaptor.get(position).getNumber());
        viewHolderSampleListItempart2.addressTVSample2.setText(cdmsampleadaptor.get(position).getAddress());
        viewHolderSampleListItempart2.emailTVSample2.setText(cdmsampleadaptor.get(position).getEmail());


        return convertView;
    }

    public  static class ViewHolderSampleListItempart2 {
        TextView nameTVSample2;
        TextView numberTVSample2;
        TextView addressTVSample2;
        TextView emailTVSample2;

    }
}
