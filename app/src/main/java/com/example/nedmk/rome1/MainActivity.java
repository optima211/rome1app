package com.example.nedmk.rome1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton addbutton, selectbutton, updatebutton, deletebutton, mapbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addbutton = (ImageButton)findViewById(R.id.addbutton);
        selectbutton = (ImageButton)findViewById(R.id.selectbutton);
        updatebutton = (ImageButton)findViewById(R.id.updatebutton);
        deletebutton = (ImageButton)findViewById(R.id.deletebutton);
        mapbutton = (ImageButton)findViewById(R.id.mapbutton);
        addbutton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.nedmk.rome1.AddActivity");
                        startActivity(intent);
                    }
                }
        );
        mapbutton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.nedmk.rome1.MapActivity");
                        startActivity(intent);
                    }
                }
        );
        selectbutton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.nedmk.rome1.SelectActivity");
                        startActivity(intent);
                    }
                }
        );
        updatebutton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.nedmk.rome1.UpdateActivity");
                        startActivity(intent);
                    }
                }
        );
        deletebutton.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.nedmk.rome1.DeleteActivity");
                        startActivity(intent);
                    }
                }
        );
    }
}
