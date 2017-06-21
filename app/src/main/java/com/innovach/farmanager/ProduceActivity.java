package com.innovach.farmanager;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.innovach.farmanager.produce.details.FrenchBeansActivity;
import com.innovach.farmanager.produce.details.MaizeActivity;
import com.innovach.farmanager.produce.details.OnionsActivity;
import com.innovach.farmanager.produce.details.PotatoesActivity;
import com.innovach.farmanager.produce.details.TomatoesActivity;

import java.util.ArrayList;
import java.util.List;

public class ProduceActivity extends Activity implements AdapterView.OnItemClickListener {

    String[] produce_names;
    TypedArray produce_pics;

    List<RowItem> rowItems;
    ListView mylistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produce);

        rowItems = new ArrayList<RowItem>();

        produce_names = getResources().getStringArray(R.array.Produce_names);

        produce_pics = getResources().obtainTypedArray(R.array.produce_pics);

        for (int i = 0; i < produce_names.length; i++) {
            RowItem item = new RowItem(produce_names[i],
                    produce_pics.getResourceId(i, -1));
            rowItems.add(item);
        }

        mylistview = (ListView) findViewById(R.id.list);
        CustomAdapter adapter = new CustomAdapter(this, rowItems);
        mylistview.setAdapter(adapter);

        mylistview.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {
//
//        String member_name = rowItems.get(position).getProduce_name();
//        Toast.makeText(getApplicationContext(), "" + member_name,
//                Toast.LENGTH_SHORT).show();
        if (position == 0) {
            Intent myIntent = new Intent(view.getContext(), TomatoesActivity.class);
            startActivityForResult(myIntent, 0);
        }
        if (position == 1) {
            Intent myIntent = new Intent(view.getContext(), OnionsActivity.class);
            startActivityForResult(myIntent, 1);
        }
        if (position == 2) {
            Intent myIntent = new Intent(view.getContext(), MaizeActivity.class);
            startActivityForResult(myIntent, 2);
        }
        if (position == 3) {
            Intent myIntent = new Intent(view.getContext(), PotatoesActivity.class);
            startActivityForResult(myIntent, 3);
        }
        if (position == 4) {
            Intent myIntent = new Intent(view.getContext(), FrenchBeansActivity.class);
            startActivityForResult(myIntent, 4);
        }

    }
}

