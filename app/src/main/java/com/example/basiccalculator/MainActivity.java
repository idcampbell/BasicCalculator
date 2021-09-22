package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity2(String result) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    public Integer[] parseNumbers() {
        EditText numberText1 = (EditText) findViewById(R.id.numberText1);
        EditText numberText2 = (EditText) findViewById(R.id.numberText2);
        Integer number1 = Integer.parseInt(numberText1.getText().toString());
        Integer number2 = Integer.parseInt(numberText2.getText().toString());
        Integer[] numbers = new Integer[] {number1, number2};
        return numbers;
    }

    public void addNumbers(View view) {
        Integer[] numbers = parseNumbers();
        String result = Integer.toString(numbers[0]+numbers[1]);
        goToActivity2(result);
    }

    public void subtractNumbers(View view) {
        Integer[] numbers = parseNumbers();
        String result = Integer.toString(numbers[0]-numbers[1]);
        goToActivity2(result);
    }

    public void multiplyNumbers(View view) {
        Integer[] numbers = parseNumbers();
        String result = Integer.toString(numbers[0]*numbers[1]);
        goToActivity2(result);
    }

    public void divideNumbers(View view) {
        Integer[] numbers = parseNumbers();
        String result = Integer.toString(numbers[0]/numbers[1]);
        goToActivity2(result);
    }
}