package com.example.luckybest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class DateAdapter extends BaseAdapter {
    Context context;
    ArrayList<Date> dates;
    OnClickItem onClickItem;

    public DateAdapter(Context context, ArrayList<Date> dates, OnClickItem onClickItem) {
        this.context = context;
        this.dates = dates;
        this.onClickItem = onClickItem;
    }


    @Override
    public int getCount() {
        return dates.size();
    }

    @Override
    public Object getItem(int position) {
        return dates.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    class ViewHolder {
        TextView txtDate;
        CheckBox checkBox;
    }
    public  void UpdateListView(ArrayList<Date> dates2) {
        this.dates = dates2;
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        DateAdapter.ViewHolder viewHolder =null;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.layout_cutom4,null);
            viewHolder = new DateAdapter.ViewHolder();
            viewHolder.txtDate = convertView.findViewById(R.id.textViewDate);
            viewHolder.checkBox = convertView.findViewById(R.id.checkbox2);
            convertView.setTag(viewHolder);

        }else {
            viewHolder = (DateAdapter.ViewHolder) convertView.getTag();
        }
        Date date = (Date) getItem(position);
        viewHolder.txtDate.setText(date.getDate());
        if (date.isChecked()) {
            viewHolder.checkBox.setChecked(true);
        } else {
            viewHolder.checkBox.setChecked(false);
        }
        return convertView;
    }
}
