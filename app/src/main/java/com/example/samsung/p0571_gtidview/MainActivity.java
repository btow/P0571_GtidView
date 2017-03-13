package com.example.samsung.p0571_gtidview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        adapter = new ArrayAdapter<String>(
                this, R.layout.item, R.id.tvText,
                getResources().getStringArray(R.array.data)
        );
        gridView = (GridView) findViewById(R.id.gvMain);
        gridView.setAdapter(adapter);
        adjustGridView();
    }

    private void adjustGridView() {
        gridView.setNumColumns(GridView.AUTO_FIT);
        gridView.setColumnWidth(150);
        gridView.setVerticalSpacing(5);
        gridView.setHorizontalSpacing(5);
        gridView.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
    }
}
