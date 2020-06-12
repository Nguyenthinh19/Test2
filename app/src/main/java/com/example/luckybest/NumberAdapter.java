package com.example.luckybest;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.ViewHolder> {
    Context context;
    ArrayList<Number> arrayList;
    OnClickItem onClickItem;

    public NumberAdapter(Context context, ArrayList<Number> arrayList,OnClickItem onClickItem) {
        this.context = context;
        this.arrayList = arrayList;
        this.onClickItem = onClickItem;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_custom1,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        final Number number = arrayList.get(position);

        holder.txt.setText(number.getNumber1());
        holder.txt1.setText(number.getNumber2());
        holder.txt2.setText(number.getNumber3());
        holder.txt3.setText(number.getNumber4());
        holder.txt4.setText(number.getNumber5());
        holder.txt5.setText(number.getNumber6());
        holder.txt6.setText(number.getNumber7());
        holder.txt7.setText(number.getNumber8());
        holder.txt8.setText(number.getNumber9());
        holder.txt9.setText(number.getNumber10());
        holder.txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.txt.setBackgroundResource(R.drawable.custom7);
                holder.txt.setTextColor(Color.WHITE);
                holder.txt1.setBackgroundResource(R.drawable.custom6);
                holder.txt1.setTextColor(Color.GRAY);
                holder.txt2.setBackgroundResource(R.drawable.custom6);
                holder.txt2.setTextColor(Color.GRAY);
                holder.txt3.setBackgroundResource(R.drawable.custom6);
                holder.txt3.setTextColor(Color.GRAY);
                holder.txt4.setBackgroundResource(R.drawable.custom6);
                holder.txt4.setTextColor(Color.GRAY);
                holder.txt5.setBackgroundResource(R.drawable.custom6);
                holder.txt5.setTextColor(Color.GRAY);
                holder.txt6.setBackgroundResource(R.drawable.custom6);
                holder.txt6.setTextColor(Color.GRAY);
                holder.txt7.setBackgroundResource(R.drawable.custom6);
                holder.txt7.setTextColor(Color.GRAY);
                holder.txt8.setBackgroundResource(R.drawable.custom6);
                holder.txt8.setTextColor(Color.GRAY);
                holder.txt9.setBackgroundResource(R.drawable.custom6);
                holder.txt9.setTextColor(Color.GRAY);
                onClickItem.onClickItem(number.getNumber1());
            }
        });
        holder.txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.txt1.setBackgroundResource(R.drawable.custom7);
                holder.txt1.setTextColor(Color.WHITE);
                holder.txt.setBackgroundResource(R.drawable.custom6);
                holder.txt.setTextColor(Color.GRAY);
                holder.txt2.setBackgroundResource(R.drawable.custom6);
                holder.txt2.setTextColor(Color.GRAY);
                holder.txt3.setBackgroundResource(R.drawable.custom6);
                holder.txt3.setTextColor(Color.GRAY);
                holder.txt4.setBackgroundResource(R.drawable.custom6);
                holder.txt4.setTextColor(Color.GRAY);
                holder.txt5.setBackgroundResource(R.drawable.custom6);
                holder.txt5.setTextColor(Color.GRAY);
                holder.txt6.setBackgroundResource(R.drawable.custom6);
                holder.txt6.setTextColor(Color.GRAY);
                holder.txt7.setBackgroundResource(R.drawable.custom6);
                holder.txt7.setTextColor(Color.GRAY);
                holder.txt8.setBackgroundResource(R.drawable.custom6);
                holder.txt8.setTextColor(Color.GRAY);
                holder.txt9.setBackgroundResource(R.drawable.custom6);
                holder.txt9.setTextColor(Color.GRAY);
                onClickItem.onClickItem(number.getNumber2());
            }
        });
        holder.txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.txt2.setBackgroundResource(R.drawable.custom7);
                holder.txt2.setTextColor(Color.WHITE);
                holder.txt1.setBackgroundResource(R.drawable.custom6);
                holder.txt1.setTextColor(Color.GRAY);
                holder.txt.setBackgroundResource(R.drawable.custom6);
                holder.txt.setTextColor(Color.GRAY);
                holder.txt3.setBackgroundResource(R.drawable.custom6);
                holder.txt3.setTextColor(Color.GRAY);
                holder.txt4.setBackgroundResource(R.drawable.custom6);
                holder.txt4.setTextColor(Color.GRAY);
                holder.txt5.setBackgroundResource(R.drawable.custom6);
                holder.txt5.setTextColor(Color.GRAY);
                holder.txt6.setBackgroundResource(R.drawable.custom6);
                holder.txt6.setTextColor(Color.GRAY);
                holder.txt7.setBackgroundResource(R.drawable.custom6);
                holder.txt7.setTextColor(Color.GRAY);
                holder.txt8.setBackgroundResource(R.drawable.custom6);
                holder.txt8.setTextColor(Color.GRAY);
                holder.txt9.setBackgroundResource(R.drawable.custom6);
                holder.txt9.setTextColor(Color.GRAY);
            }
        });
        holder.txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.txt3.setBackgroundResource(R.drawable.custom7);
                holder.txt3.setTextColor(Color.WHITE);
                holder.txt1.setBackgroundResource(R.drawable.custom6);
                holder.txt1.setTextColor(Color.GRAY);
                holder.txt2.setBackgroundResource(R.drawable.custom6);
                holder.txt2.setTextColor(Color.GRAY);
                holder.txt.setBackgroundResource(R.drawable.custom6);
                holder.txt.setTextColor(Color.GRAY);
                holder.txt4.setBackgroundResource(R.drawable.custom6);
                holder.txt4.setTextColor(Color.GRAY);
                holder.txt5.setBackgroundResource(R.drawable.custom6);
                holder.txt5.setTextColor(Color.GRAY);
                holder.txt6.setBackgroundResource(R.drawable.custom6);
                holder.txt6.setTextColor(Color.GRAY);
                holder.txt7.setBackgroundResource(R.drawable.custom6);
                holder.txt7.setTextColor(Color.GRAY);
                holder.txt8.setBackgroundResource(R.drawable.custom6);
                holder.txt8.setTextColor(Color.GRAY);
                holder.txt9.setBackgroundResource(R.drawable.custom6);
                holder.txt9.setTextColor(Color.GRAY);
            }
        });
        holder.txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.txt4.setBackgroundResource(R.drawable.custom7);
                holder.txt4.setTextColor(Color.WHITE);
                holder.txt1.setBackgroundResource(R.drawable.custom6);
                holder.txt1.setTextColor(Color.GRAY);
                holder.txt2.setBackgroundResource(R.drawable.custom6);
                holder.txt2.setTextColor(Color.GRAY);
                holder.txt3.setBackgroundResource(R.drawable.custom6);
                holder.txt3.setTextColor(Color.GRAY);
                holder.txt.setBackgroundResource(R.drawable.custom6);
                holder.txt.setTextColor(Color.GRAY);
                holder.txt5.setBackgroundResource(R.drawable.custom6);
                holder.txt5.setTextColor(Color.GRAY);
                holder.txt6.setBackgroundResource(R.drawable.custom6);
                holder.txt6.setTextColor(Color.GRAY);
                holder.txt7.setBackgroundResource(R.drawable.custom6);
                holder.txt7.setTextColor(Color.GRAY);
                holder.txt8.setBackgroundResource(R.drawable.custom6);
                holder.txt8.setTextColor(Color.GRAY);
                holder.txt9.setBackgroundResource(R.drawable.custom6);
                holder.txt9.setTextColor(Color.GRAY);
            }
        });
        holder.txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.txt5.setBackgroundResource(R.drawable.custom7);
                holder.txt5.setTextColor(Color.WHITE);
                holder.txt1.setBackgroundResource(R.drawable.custom6);
                holder.txt1.setTextColor(Color.GRAY);
                holder.txt2.setBackgroundResource(R.drawable.custom6);
                holder.txt2.setTextColor(Color.GRAY);
                holder.txt3.setBackgroundResource(R.drawable.custom6);
                holder.txt3.setTextColor(Color.GRAY);
                holder.txt4.setBackgroundResource(R.drawable.custom6);
                holder.txt4.setTextColor(Color.GRAY);
                holder.txt.setBackgroundResource(R.drawable.custom6);
                holder.txt.setTextColor(Color.GRAY);
                holder.txt6.setBackgroundResource(R.drawable.custom6);
                holder.txt6.setTextColor(Color.GRAY);
                holder.txt7.setBackgroundResource(R.drawable.custom6);
                holder.txt7.setTextColor(Color.GRAY);
                holder.txt8.setBackgroundResource(R.drawable.custom6);
                holder.txt8.setTextColor(Color.GRAY);
                holder.txt9.setBackgroundResource(R.drawable.custom6);
                holder.txt9.setTextColor(Color.GRAY);
            }
        });
        holder.txt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.txt6.setBackgroundResource(R.drawable.custom7);
                holder.txt6.setTextColor(Color.WHITE);
                holder.txt1.setBackgroundResource(R.drawable.custom6);
                holder.txt1.setTextColor(Color.GRAY);
                holder.txt2.setBackgroundResource(R.drawable.custom6);
                holder.txt2.setTextColor(Color.GRAY);
                holder.txt3.setBackgroundResource(R.drawable.custom6);
                holder.txt3.setTextColor(Color.GRAY);
                holder.txt4.setBackgroundResource(R.drawable.custom6);
                holder.txt4.setTextColor(Color.GRAY);
                holder.txt5.setBackgroundResource(R.drawable.custom6);
                holder.txt5.setTextColor(Color.GRAY);
                holder.txt.setBackgroundResource(R.drawable.custom6);
                holder.txt.setTextColor(Color.GRAY);
                holder.txt7.setBackgroundResource(R.drawable.custom6);
                holder.txt7.setTextColor(Color.GRAY);
                holder.txt8.setBackgroundResource(R.drawable.custom6);
                holder.txt8.setTextColor(Color.GRAY);
                holder.txt9.setBackgroundResource(R.drawable.custom6);
                holder.txt9.setTextColor(Color.GRAY);
            }
        });
        holder.txt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.txt7.setBackgroundResource(R.drawable.custom7);
                holder.txt7.setTextColor(Color.WHITE);
                holder.txt1.setBackgroundResource(R.drawable.custom6);
                holder.txt1.setTextColor(Color.GRAY);
                holder.txt2.setBackgroundResource(R.drawable.custom6);
                holder.txt2.setTextColor(Color.GRAY);
                holder.txt3.setBackgroundResource(R.drawable.custom6);
                holder.txt3.setTextColor(Color.GRAY);
                holder.txt4.setBackgroundResource(R.drawable.custom6);
                holder.txt4.setTextColor(Color.GRAY);
                holder.txt5.setBackgroundResource(R.drawable.custom6);
                holder.txt5.setTextColor(Color.GRAY);
                holder.txt6.setBackgroundResource(R.drawable.custom6);
                holder.txt6.setTextColor(Color.GRAY);
                holder.txt.setBackgroundResource(R.drawable.custom6);
                holder.txt.setTextColor(Color.GRAY);
                holder.txt8.setBackgroundResource(R.drawable.custom6);
                holder.txt8.setTextColor(Color.GRAY);
                holder.txt9.setBackgroundResource(R.drawable.custom6);
                holder.txt9.setTextColor(Color.GRAY);
            }
        });
        holder.txt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.txt8.setBackgroundResource(R.drawable.custom7);
                holder.txt8.setTextColor(Color.WHITE);
                holder.txt1.setBackgroundResource(R.drawable.custom6);
                holder.txt1.setTextColor(Color.GRAY);
                holder.txt2.setBackgroundResource(R.drawable.custom6);
                holder.txt2.setTextColor(Color.GRAY);
                holder.txt3.setBackgroundResource(R.drawable.custom6);
                holder.txt3.setTextColor(Color.GRAY);
                holder.txt4.setBackgroundResource(R.drawable.custom6);
                holder.txt4.setTextColor(Color.GRAY);
                holder.txt5.setBackgroundResource(R.drawable.custom6);
                holder.txt5.setTextColor(Color.GRAY);
                holder.txt6.setBackgroundResource(R.drawable.custom6);
                holder.txt6.setTextColor(Color.GRAY);
                holder.txt7.setBackgroundResource(R.drawable.custom6);
                holder.txt7.setTextColor(Color.GRAY);
                holder.txt.setBackgroundResource(R.drawable.custom6);
                holder.txt.setTextColor(Color.GRAY);
                holder.txt9.setBackgroundResource(R.drawable.custom6);
                holder.txt9.setTextColor(Color.GRAY);
            }
        });
        holder.txt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.txt9.setBackgroundResource(R.drawable.custom7);
                holder.txt9.setTextColor(Color.WHITE);
                holder.txt1.setBackgroundResource(R.drawable.custom6);
                holder.txt1.setTextColor(Color.GRAY);
                holder.txt2.setBackgroundResource(R.drawable.custom6);
                holder.txt2.setTextColor(Color.GRAY);
                holder.txt3.setBackgroundResource(R.drawable.custom6);
                holder.txt3.setTextColor(Color.GRAY);
                holder.txt4.setBackgroundResource(R.drawable.custom6);
                holder.txt4.setTextColor(Color.GRAY);
                holder.txt5.setBackgroundResource(R.drawable.custom6);
                holder.txt5.setTextColor(Color.GRAY);
                holder.txt6.setBackgroundResource(R.drawable.custom6);
                holder.txt6.setTextColor(Color.GRAY);
                holder.txt7.setBackgroundResource(R.drawable.custom6);
                holder.txt7.setTextColor(Color.GRAY);
                holder.txt8.setBackgroundResource(R.drawable.custom6);
                holder.txt8.setTextColor(Color.GRAY);
                holder.txt.setBackgroundResource(R.drawable.custom6);
                holder.txt.setTextColor(Color.GRAY);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt,txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.txtNumber1);
            txt1 = itemView.findViewById(R.id.txtNumber2);
            txt2 = itemView.findViewById(R.id.txtNumber3);
            txt3 = itemView.findViewById(R.id.txtNumber4);
            txt4 = itemView.findViewById(R.id.txtNumber5);
            txt5 = itemView.findViewById(R.id.txtNumber6);
            txt6 = itemView.findViewById(R.id.txtNumber7);
            txt7 = itemView.findViewById(R.id.txtNumber8);
            txt8 = itemView.findViewById(R.id.txtNumber9);
            txt9 = itemView.findViewById(R.id.txtNumber10);

        }
    }
}

