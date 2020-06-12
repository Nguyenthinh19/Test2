package com.example.luckybest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements OnClickItem {
    OnClickItem onClickItem = this;
    private Toolbar mToolbar;
    private TextView txtKynua,txtDongia,txtNgaythang,txtGia, txtSotuchon,txtOmdaiso1,txtOmdaiso2;
    private ImageView imageView1,imageView2, random;
    int preSelected = -1;
    public MainActivity() {

    }

    public void setOnClickItem(OnClickItem onClickItem) {
        this.onClickItem = onClickItem;
    }

    public  OnClickItem getOnClickItem() {
        return onClickItem;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar =( Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("ÔM MAX3D+");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        random =(ImageView) findViewById(R.id.imageView);
        txtKynua = (TextView) findViewById(R.id.txtKymua);
        txtDongia = (TextView) findViewById(R.id.txtDongia);
        txtNgaythang = (TextView) findViewById(R.id.txtNgaythang);
        txtGia = (TextView) findViewById(R.id.txtGia);
        txtSotuchon = (TextView) findViewById(R.id.textView10);
        txtOmdaiso1 = (TextView)findViewById(R.id.textView11);
        txtOmdaiso2 = (TextView)findViewById(R.id.textView12);
        txtNgaythang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               showAlerDialog1();
            }
        });
        txtGia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlerDialog2();
            }


        });
        txtSotuchon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlerDialog3();
            }
        });
        txtOmdaiso1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlerDialog4();
            }
        });
        txtOmdaiso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlerDialog5();
            }
        });
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ramdom();
            }
        });
    }

    private void ramdom() {
        Random random = new Random();
        int number = random.nextInt(1000) ;
        txtSotuchon.setText(number + "");
    }

    private void showAlerDialog1() {

        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dialog1);
        dialog.show();
        dialog.getWindow().setLayout(900,1000);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.cutom2);
        ListView listView = (ListView) dialog.findViewById(R.id.listDate);
        final ArrayList<Date> arrayList = new ArrayList<>();
        arrayList.add(new Date("04/09/2019",false));
        arrayList.add(new Date("06/09/2019",false));
        arrayList.add(new Date("09/09/2019",false));
        arrayList.add(new Date("11/09/2019",false));
        arrayList.add(new Date("13/09/2019",false));
        arrayList.add(new Date("16/09/2019",false));

        dialog.getWindow().setLayout(900,1000);
        final TextView txtXacnhan = (TextView) dialog.findViewById(R.id.txtXacnhan);
        final DateAdapter adapter = new DateAdapter(this,arrayList,onClickItem) ;
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Date date = arrayList.get(position);
                date.setChecked(true);
                arrayList.set(position,date);
                if (preSelected >-1) {
                    Date date1 = arrayList.get(preSelected);
                    date1.setChecked(false);
                    arrayList.set(preSelected,date1);
                }
                preSelected = position;
                adapter.UpdateListView(arrayList);
                txtXacnhan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onClickItem.onClickItem2(date.getDate());
                        dialog.dismiss();
                    }
                });
            }
        });

        adapter.notifyDataSetChanged();
    }

    private void showAlerDialog2() {

        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dailog5);
        dialog.show();
        dialog.getWindow().setLayout(900,1000);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.cutom2);
        ListView listView = (ListView) dialog.findViewById(R.id.listGia);
        final ArrayList<Gia> arrayList = new ArrayList<>();
        arrayList.add(new Gia("10.000đ",false));
        arrayList.add(new Gia("20.000đ",false));
        arrayList.add(new Gia("50.000đ",false));
        arrayList.add(new Gia("100.000đ",false));
        arrayList.add(new Gia("200.000đ",false));
        final TextView txtDong = (TextView) dialog.findViewById(R.id.txtDong);
        final TextView txtHoantat = (TextView) dialog.findViewById(R.id.txtHoantat);
        dialog.getWindow().setLayout(900,1000);
        final PriceAdapter adapter = new PriceAdapter(this,arrayList,onClickItem) ;
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                final Gia gia = arrayList.get(position);
                gia.setChecked(true);
                arrayList.set(position,gia);
                if (preSelected >-1) {
                    Gia gia1 = arrayList.get(preSelected);
                    gia1.setChecked(false);
                    arrayList.set(preSelected,gia1);
                }
                preSelected = position;
                 adapter.UpdateListView(arrayList);
                 txtHoantat.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         onClickItem.onClickItem(gia.getGia());
                         dialog.dismiss();
                     }
                 });
            }
        });
        txtDong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        adapter.notifyDataSetChanged();
    }

    private void showAlerDialog3() {

        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dialog3);
        dialog.show();
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.cutom2);
        ListView listView = (ListView) dialog.findViewById(R.id.listview);
        final ArrayList<Number> arrayList = new ArrayList<>();
        arrayList.add(new Number("0","0","0","0","0","0","0","0","0","0"));
        arrayList.add(new Number("1","1","1","1","1","1","1","1","1","1"));
        arrayList.add(new Number("2","2","2","2","2","2","2","2","2","2"));
        arrayList.add(new Number("3","3","3","3","3","3","3","3","3","3"));
        arrayList.add(new Number("4","4","4","4","4","4","4","4","4","4"));
        arrayList.add(new Number("5","5","5","5","5","5","5","5","5","5"));
        arrayList.add(new Number("6","6","6","6","6","6","6","6","6","6"));
        arrayList.add(new Number("7","7","7","7","7","7","7","7","7","7"));
        arrayList.add(new Number("8","8","8","8","8","8","8","8","8","8"));
        arrayList.add(new Number("9","9","9","9","9","9","9","9","9","9"));

        dialog.getWindow().setLayout(1000,1400);

        NumberAdapter2 adapter = new NumberAdapter2(this,R.layout.layout_custom2,arrayList,onClickItem) ;
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Number number = arrayList.get(position);
                Toast.makeText(MainActivity.this,number.getNumber1(),Toast.LENGTH_SHORT).show();
            }
        });


        adapter.notifyDataSetChanged();
    }

    private void showAlerDialog4() {
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dailog4);
        dialog.show();
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.cutom2);
        RecyclerView recyclerView1 = (RecyclerView) dialog.findViewById(R.id.list1);
        RecyclerView recyclerView2 = (RecyclerView) dialog.findViewById(R.id.list2);
        ArrayList<Number> arrayList = new ArrayList<>();
        arrayList.add(new Number("0","1","2","3","4","5","6","7","8","9"));
        arrayList.add(new Number("0","1","2","3","4","5","6","7","8","9"));
        arrayList.add(new Number("0","1","2","3","4","5","6","7","8","9"));
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this);

        linearLayoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        linearLayoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);

        recyclerView1.setLayoutManager(linearLayoutManager1);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        dialog.getWindow().setLayout(1000,1400);

        NumberAdapter adapter1 = new NumberAdapter(this,arrayList,onClickItem) ;
        NumberAdapter adapter2 = new NumberAdapter(this,arrayList,onClickItem) ;

        recyclerView1.setAdapter(adapter1);
        recyclerView2.setAdapter(adapter2);
        adapter1.notifyDataSetChanged();
        adapter2.notifyDataSetChanged();
    }

    private void showAlerDialog5() {
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dailog4);
        dialog.show();
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.cutom2);
        RecyclerView recyclerView1 = (RecyclerView) dialog.findViewById(R.id.list1);
        RecyclerView recyclerView2 = (RecyclerView) dialog.findViewById(R.id.list2);
        ArrayList<Number> arrayList = new ArrayList<>();
        arrayList.add(new Number("0","1","2","3","4","5","6","7","8","9"));
        arrayList.add(new Number("0","1","2","3","4","5","6","7","8","9"));
        arrayList.add(new Number("0","1","2","3","4","5","6","7","8","9"));
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this);

        linearLayoutManager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        linearLayoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);

        recyclerView1.setLayoutManager(linearLayoutManager1);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        dialog.getWindow().setLayout(1000,1400);

        NumberAdapter adapter1 = new NumberAdapter(this,arrayList,onClickItem) ;
        NumberAdapter adapter2 = new NumberAdapter(this,arrayList,onClickItem) ;

        recyclerView1.setAdapter(adapter1);
        recyclerView2.setAdapter(adapter2);
        adapter1.notifyDataSetChanged();
        adapter2.notifyDataSetChanged();
    }

    @Override
    public void onClickItem(String text) {
        txtGia.setText(text);
    }

    @Override
    public void onClickItem2(String text) {
        txtNgaythang.setText(text);
    }

    @Override
    public void onClickItem3(String text1, String text2, String text3) {

    }

}