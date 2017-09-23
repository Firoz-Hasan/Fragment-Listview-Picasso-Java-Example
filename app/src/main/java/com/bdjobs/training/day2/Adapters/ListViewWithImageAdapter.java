package com.bdjobs.training.day2.Adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bdjobs.training.day2.Models.ListviewModelwithImage;
import com.bdjobs.training.day2.R;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by FIROZ HASAN on 7/27/2017.
 */

public class ListViewWithImageAdapter extends BaseAdapter {


    ArrayList<ListviewModelwithImage> listviewModelwithImages = new ArrayList<>();
    LayoutInflater layoutInflater;
    Context context;

    public ListViewWithImageAdapter(ArrayList<ListviewModelwithImage> listviewModelwithImages, Context context) {
        this.listviewModelwithImages = listviewModelwithImages;
        this.context = context;


    }


    @Override
    public int getCount() {
        return listviewModelwithImages.size();
    }

    @Override
    public Object getItem(int position) {
        return listviewModelwithImages;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        BaseImageViewHolder baseImageViewHolder = new BaseImageViewHolder();
        if (convertView == null) {

            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.listview_with_image, parent, false);
            //mapping between XML & java
            baseImageViewHolder.textViewHolder1 = (TextView) convertView.findViewById(R.id.FragdTV1);
            baseImageViewHolder.textViewHolder2 = (TextView) convertView.findViewById(R.id.FragdTV2);
            baseImageViewHolder.imageViewHolder = (ImageView) convertView.findViewById(R.id.FragdIV);
            convertView.setTag(baseImageViewHolder);


            //---------------
        } else {
            baseImageViewHolder = (BaseImageViewHolder) convertView.getTag();

        }

        Picasso.with(context)
                .load(listviewModelwithImages.get(position).getImageURL())
                .resize(800, 450)
                .into(baseImageViewHolder.imageViewHolder);

        baseImageViewHolder.textViewHolder1.setText(listviewModelwithImages.get(position).getFirstText());
        baseImageViewHolder.textViewHolder2.setText(listviewModelwithImages.get(position).getSecondText());



        return convertView;
    }

    public class BaseImageViewHolder {
        ImageView imageViewHolder;
        TextView textViewHolder1, textViewHolder2;
    }
}
