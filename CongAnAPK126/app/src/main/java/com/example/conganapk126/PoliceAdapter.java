package com.example.conganapk126;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PoliceAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List <PoliceItem> policeItemList;

    public PoliceAdapter(Context context, int layout, List<PoliceItem> policeItemList) {
        this.context = context;
        this.layout = layout;
        this.policeItemList = policeItemList;
    }
    @Override
    public int getCount() {
        return policeItemList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        private ImageView img;
        private TextView txtName, txtDir, txtCountry, txtStar;

    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null) {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            // anh xa view
            holder.txtName = (TextView) view.findViewById(R.id.txt_Name);
            holder.txtCountry = (TextView) view.findViewById(R.id.txt_Country);
            holder.txtStar = (TextView) view.findViewById(R.id.txt_Star);
            holder.txtDir = (TextView) view.findViewById(R.id.txt_Dir);
            holder.img = (ImageView) view.findViewById(R.id.img);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        // gan gia tri
        PoliceItem policeList= policeItemList.get(i);


        holder.txtName.setText(policeList.getTxtName());
        holder.txtCountry.setText(policeList.getTxtCountry());
        holder.txtDir.setText(policeList.getTxtDir());
        holder.txtStar.setText(String.valueOf(policeList.getTxtStar()));
        holder.img.setImageResource(policeList.getImg());
        return view;
    }
}

