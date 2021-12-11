package ru.geekbrains.android1homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Object CalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main2);

//        EditText name = (EditText) this.findViewById(R.id.name);
//        Switch experienceYear = (Switch) findViewById(R.id.experience_year);
//        CheckBox subscription1 = (CheckBox) findViewById(R.id.subscription1);
//        CheckBox subscription2 = (CheckBox) findViewById(R.id.subscription2);
//        CheckBox subscription3 = (CheckBox) findViewById(R.id.subscription3);
//        ToggleButton agree = (ToggleButton) findViewById(R.id.agree);
//
//        Button buttonClick = (Button) this.findViewById(R.id.send);
//        buttonClick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Форма отправлена", Toast.LENGTH_SHORT).show();
//            }
//        } );

        EditText name = (EditText) this.findViewById(R.id.name);
        EditText phone = (EditText) this.findViewById(R.id.phone);
        EditText age = (EditText) this.findViewById(R.id.age);
        EditText password = (EditText) this.findViewById(R.id.password);
        EditText email = (EditText) this.findViewById(R.id.email);
        CalendarView = (CalendarView)findViewById(R.id.calendar_view);
    }
}