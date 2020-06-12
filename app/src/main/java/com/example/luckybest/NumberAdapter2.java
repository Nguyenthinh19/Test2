package com.example.luckybest;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class NumberAdapter2 extends ArrayAdapter<Number> {
    Context context;
    ArrayList<Number> arrayList;
    OnClickItem onClickItem;
    public NumberAdapter2(@NonNull Context context, int resource, @NonNull ArrayList<Number> objects,OnClickItem onClickItem) {
        super(context, resource, objects);
        this.context = context;
        this.arrayList = objects;
        this.onClickItem = onClickItem;
    }
    class ViewHolder{
        TextView txtNumber1, txtNumber2, txtNumber3;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.layout_custom2,parent, false);
            viewHolder = new ViewHolder();
            viewHolder.txtNumber1 = convertView.findViewById(R.id.txtNumber1);
            viewHolder.txtNumber2 = convertView.findViewById(R.id.txtNumber2);
            viewHolder.txtNumber3 = convertView.findViewById(R.id.txtNumber3);
            convertView.setTag(viewHolder);
        }
        else {
            viewHolder =(ViewHolder) convertView.getTag();
        }
        final Number number = getItem(position);
        viewHolder.txtNumber1.setText(number.getNumber1());
        viewHolder.txtNumber2.setText(number.getNumber2());
        viewHolder.txtNumber3.setText(number.getNumber3());
        final ViewHolder finalViewHolder1 = viewHolder;
        viewHolder.txtNumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalViewHolder1.txtNumber1.setBackgroundResource(R.drawable.custom7);
                finalViewHolder1.txtNumber1.setTextColor(Color.WHITE);
                onClickItem.onClickItem(number.getNumber1());
            }
        });
        viewHolder.txtNumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalViewHolder1.txtNumber2.setBackgroundResource(R.drawable.custom7);
                finalViewHolder1.txtNumber2.setTextColor(Color.WHITE);
                onClickItem.onClickItem(number.getNumber1());
            }
        });
        viewHolder.txtNumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalViewHolder1.txtNumber3.setBackgroundResource(R.drawable.custom7);
                finalViewHolder1.txtNumber3.setTextColor(Color.WHITE);
                onClickItem.onClickItem(number.getNumber1());
            }
        });
        return convertView;
    }
}

