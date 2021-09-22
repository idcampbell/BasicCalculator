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

    public Integer[] parseNumbers() throws Exception {
        EditText numberText1 = (EditText) findViewById(R.id.numberText1);
        EditText numberText2 = (EditText) findViewById(R.id.numberText2);
        String number1 = numberText1.getText().toString();
        String number2 = numberText2.getText().toString();

        // If the user doesn't enter input, throw an exception.
        if (number1.equals("") || number2.equals("")) {
            throw new Exception("number not provided");
        }
        // Store the resulting numbers in an array.
        Integer[] numbers = new Integer[] {Integer.parseInt(number1), Integer.parseInt(number2)};
        return numbers;
    }

    public void doMath(View view) {
        // Parse the user input.
        Integer[] numbers;
        try {
            numbers = parseNumbers();
        } catch(Exception e) {
            return;
        }
        // Compute the result of applying the selected operation to the input numbers.
        String result = "";
        switch(view.getId()){
            case R.id.addition:
                result = Integer.toString(numbers[0]+numbers[1]);
                break;
            case R.id.subtraction:
                result = Integer.toString(numbers[0]-numbers[1]);
                break;
            case R.id.multiplication:
                result = Integer.toString(numbers[0]*numbers[1]);
                break;
            case R.id.division:
                result = Integer.toString(numbers[0]/numbers[1]);
                break;
            default:
        }
        goToActivity2(result);
    }

    public void addNumbers(View view) {
        Integer[] numbers;
        try {
            numbers = parseNumbers();
        } catch(Exception e) {
            return;
        }
        String result = Integer.toString(numbers[0]+numbers[1]);
        goToActivity2(result);
    }

    public void subtractNumbers(View view) {
        Integer[] numbers;
        try {
            numbers = parseNumbers();
        } catch(Exception e) {
            return;
        }
        String result = Integer.toString(numbers[0]-numbers[1]);
        goToActivity2(result);
    }

    public void multiplyNumbers(View view) {
        Integer[] numbers;
        try {
            numbers = parseNumbers();
        } catch(Exception e) {
            return;
        }
        String result = Integer.toString(numbers[0]*numbers[1]);
        goToActivity2(result);
    }

    public void divideNumbers(View view) {
        Integer[] numbers;
        try {
             numbers = parseNumbers();
        } catch(Exception e) {
            return;
        }
        String result = Integer.toString(numbers[0]/numbers[1]);
        goToActivity2(result);
    }
}