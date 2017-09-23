package com.bdjobs.training.day2.Adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.bdjobs.training.day2.Models.ContactModel;
import com.bdjobs.training.day2.R;

import java.util.ArrayList;

/**
 * Created by FIROZ HASAN on 7/25/2017.
 */

public class SampleAdapter extends ArrayAdapter {

    ArrayList<ContactModel> contactModels = new ArrayList<>();
    Context context;
    LayoutInflater inflater;

    public SampleAdapter(Context context, ArrayList<ContactModel> contactModels) {
        super(context, R.layout.sample_list_item,contactModels);
        this.contactModels = contactModels;
        this.context = context;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//-----------------viewHolder_initialization-----------------------------------------//
        ViewHolder viewHolder = new ViewHolder();
        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_list_item, parent, false);
            viewHolder.nameTV = (TextView) convertView.findViewById(R.id.sampleNameTV);
            viewHolder.numberTV = (TextView) convertView.findViewById(R.id.sampleMobileTV);

            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }
//--------------Logic_set_below_this_line-------------------------------------------//

        viewHolder.nameTV.setText(contactModels.get(position).getName());
        viewHolder.numberTV.setText(contactModels.get(position).getMobileNumber());

        return convertView;
    }

    public  static  class ViewHolder {
        TextView nameTV;
        TextView numberTV;
    }


}
