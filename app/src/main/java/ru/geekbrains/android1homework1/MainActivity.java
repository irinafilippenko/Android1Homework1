package ru.geekbrains.android1homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = (EditText) this.findViewById(R.id.name);
        Switch experienceYear = (Switch) findViewById(R.id.experience_year);
        CheckBox subscription1 = (CheckBox) findViewById(R.id.subscription1);
        CheckBox subscription2 = (CheckBox) findViewById(R.id.subscription2);
        CheckBox subscription3 = (CheckBox) findViewById(R.id.subscription3);
        ToggleButton agree = (ToggleButton) findViewById(R.id.agree);

        Button buttonClick = (Button) this.findViewById(R.id.send);
        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Форма отправлена", Toast.LENGTH_SHORT).show();
            }
        } );
    }
}