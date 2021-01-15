package com.youtube.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button converterButton;
    TextView poundTitle;
    TextView poundResult;
    EditText inputNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        converterButton = findViewById(R.id.main_button);
        converterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                converter();
            }
        });
    }

    private void converter()
    {
       poundTitle = findViewById(R.id.main_pounds_title);
       poundResult = findViewById(R.id.main_pounds_result);

       inputNumber = findViewById(R.id.main_input_number);
       String inputNumberValue = inputNumber.getText().toString();

       if(inputNumberValue.isEmpty())
       {
           Toast.makeText(this, "You did not enter a unit", Toast.LENGTH_SHORT).show();
       }
       else
       {
           poundTitle.setVisibility(View.VISIBLE);
           poundResult.setVisibility(View.VISIBLE);

           double result = Integer.parseInt(inputNumberValue) * 2.2046226218;
           result = Math.round(result * 100);
           result = result / 100;
           poundResult.setText(Double.toString(result));
       }
    }
}