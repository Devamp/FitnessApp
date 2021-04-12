package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startLog = (Button)findViewById(R.id.startLogButton);
        Button loadLog = (Button)findViewById(R.id.loadLogButton);
        Button quitLog = (Button)findViewById(R.id.quitButton);

        EditText nameText = (EditText)findViewById(R.id.nameText);

        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.exerciseGroup);
        RadioButton benchPress = findViewById(R.id.benchPressRadio);
        RadioButton squats = findViewById(R.id.squatRadio);
        RadioButton deadlift = findViewById(R.id.deadliftRadio);

        startLog.setOnClickListener(this);
        loadLog.setOnClickListener(this);
        quitLog.setOnClickListener(this);

        radioGroup.setOnCheckedChangeListener(this);
        benchPress.setOnClickListener(this);
        squats.setOnClickListener(this);
        deadlift.setOnClickListener(this);

        //Database database = new Database(nameText, )
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.startLogButton){
            setContentView(R.layout.newloglayout);

        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

    }

}