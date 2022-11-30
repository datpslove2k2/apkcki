package com.example.conganapk126;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class listAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<listTPitem> ItemList;

    public listAdapter(Context context, int layout, List<listTPitem> ItemList) {
        this.context = context;
        this.layout = layout;
        this.ItemList = ItemList;
    }
    @Override
    public int getCount() {
        return ItemList.size();
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
        private TextView txtName, txtDir;

    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        listAdapter.ViewHolder holder;
        if(view == null) {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new listAdapter.ViewHolder();
            // anh xa view
            holder.txtName = (TextView) view.findViewById(R.id.txt_Name);
            holder.txtDir = (TextView) view.findViewById(R.id.txt_Dir);
            view.setTag(holder);
        } else {
            holder = (listAdapter.ViewHolder) view.getTag();
        }

        // gan gia tri
        listTPitem listTP= ItemList.get(i);


        holder.txtName.setText(listTP.getTxtName());
        holder.txtDir.setText(listTP.getTxtDir());
        return view;
    }
}
