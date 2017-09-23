package com.bdjobs.training.day2.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bdjobs.training.day2.Models.BaseDataModel;
import com.bdjobs.training.day2.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

import static com.bdjobs.training.day2.R.layout.base_list_item;

/**
 * Created by FIROZ HASAN on 7/27/2017.
 */

public class BaseAdapters extends BaseAdapter {

    ArrayList<BaseDataModel> bdm =  new ArrayList<>();
    LayoutInflater layoutInflater;
    Context context;

    public BaseAdapters(ArrayList<BaseDataModel> bdm, Context context) {
        super();
        this.bdm = bdm;
        this.context= context;
    }

    @Override
    public int getCount() {
        return bdm.size();
    }

    @Override
    public Object getItem(int position) {
        return bdm.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BaseViewHolder baseViewHolder = new BaseViewHolder();

        if(convertView == null){
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.base_list_item, parent, false);

            baseViewHolder.nameBaseHolder = (TextView) convertView.findViewById(R.id.basenameTV);
            baseViewHolder.addressBaseHolder = (TextView) convertView.findViewById(R.id.baseaddressTV);

            convertView.setTag(baseViewHolder);
        }
        else {
            baseViewHolder = (BaseViewHolder) convertView.getTag();

        }
        baseViewHolder.nameBaseHolder.setText(bdm.get(position).getName());
        baseViewHolder.addressBaseHolder.setText(bdm.get(position).getAddress());

        return convertView;
    }

    public class BaseViewHolder{
        TextView nameBaseHolder, addressBaseHolder;

    }
}
