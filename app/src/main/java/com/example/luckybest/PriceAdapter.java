package com.example.luckybest;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PriceAdapter extends BaseAdapter {
    Context context;
    ArrayList<Gia> gias;
    OnClickItem onClickItem;

    public PriceAdapter(Context context, ArrayList<Gia> gias,OnClickItem onClickItem) {
        this.context = context;
        this.gias = gias;
        this.onClickItem = onClickItem;
    }

    @Override
    public int getCount() {
        return gias.size();
    }

    @Override
    public Object getItem(int position) {
        return gias.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    class ViewHolder {
        TextView txtGia;
        RadioButton checkBox;
    }
    public  void UpdateListView(ArrayList<Gia> gias2) {
        this.gias = gias2;
        notifyDataSetChanged();
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder =null;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.layout_custom3,null);
            viewHolder = new ViewHolder();
            viewHolder.txtGia = convertView.findViewById(R.id.textViewGia);
            viewHolder.checkBox = convertView.findViewById(R.id.checkbox1);
            convertView.setTag(viewHolder);

        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Gia gia = (Gia) getItem(position);
        viewHolder.txtGia.setText(gia.getGia());
        if (gia.isChecked()) {
            viewHolder.checkBox.setChecked(true);
        } else {
            viewHolder.checkBox.setChecked(false);
        }
        return convertView;
    }
}
