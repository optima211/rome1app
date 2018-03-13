package com.example.nedmk.rome1;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {
    String[] posits = {"Страна", "Город", "Улица", "Дом", "Квартира", "Служебное помощение"};
    String[] types = {"Не установлен", "Введен в эксплуатацию"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        //адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, posits);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner countryspinner = (Spinner) findViewById(R.id.countryspinner);
        countryspinner.setAdapter(adapter);
        //заголовок
        countryspinner.setPrompt("Место установки");
        //выделяем элемент
        countryspinner.setSelection(1);
        //устанавливаем обработчик нажатия
        countryspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //показываем позицию нажатого элемента
                Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, types);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner statusspinner = (Spinner) findViewById(R.id.statusspinner);
        statusspinner.setAdapter(adapter1);
        //заголовок
        statusspinner.setPrompt("Статус установки");
        //выделяем элемент
        statusspinner.setSelection(1);
        //устанавливаем обработчик нажатия
        statusspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //показываем позицию нажатого элемента
                Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}