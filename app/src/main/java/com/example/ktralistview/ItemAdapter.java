package com.example.ktralistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class ItemAdapter extends ArrayAdapter<Item> {
    public ItemAdapter(Context context, List<Item> data) {
        super(context, 0, data);
    }

    //
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.activity_item_list, parent, false);


        Item item = getItem(position);
        if (item != null) {
            // activity item list
            ImageView imgAvatar = view.findViewById(R.id.imgAvatar);
            TextView tvName = view.findViewById(R.id.tvName);
            TextView tvContent = view.findViewById(R.id.tvContent);
            TextView tvTime = view.findViewById(R.id.tvTime);

            // set data
            imgAvatar.setImageResource(item.avatar);
            tvName.setText(item.ten);
            tvContent.setText(item.tinNhan);
            tvTime.setText(item.thoiGian);
        }

        return view;
    }
}