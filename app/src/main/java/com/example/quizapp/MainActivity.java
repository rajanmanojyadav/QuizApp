package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    RadioButton radioButton;
    CheckBox checkBox, checkBox2, checkBox3, checkBox4;
    int finalScore = 0;
    boolean flag = false, flag2 = false, flag3 = false, flag4 = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.score);
        //textView.setText("Score : " + finalScore);
    }

    public void answerOne(View view) {
        textView = findViewById(R.id.score);
        editText = findViewById(R.id.edit_query);
        String name = editText.getText().toString();
        if (name.equals(null) || name.length() == 0) {
            Toast.makeText(this, "Please Type Your Answer", Toast.LENGTH_SHORT).show();
            return;
        } else if (name.equalsIgnoreCase("Delhi")) {
            if (flag == false) {
                finalScore = finalScore + 5;
              //  textView.setText("Score : " + finalScore);
                flag = true;
                Toast.makeText(this, "Correct Answer" + "\n" + "5 marks is added.", Toast.LENGTH_SHORT).show();
                return;
            }
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Incorrect Answer" + "\n" + "Correct Answer is : Delhi", Toast.LENGTH_SHORT).show();
        }

    }

    public void answerTwo(View view) {
        textView = findViewById(R.id.score);
        radioButton = findViewById(R.id.maharashtra);
        if (radioButton.isChecked()) {
            if (flag2 == false) {
                finalScore = finalScore + 5;
              //  textView.setText("Score : " + finalScore);
                flag2 = true;
                Toast.makeText(this, "Correct Answer" + "\n" + "5 marks is added.", Toast.LENGTH_SHORT).show();
                return;
            }
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Incorrect Answer " + "\n" + "Correct Answer is : Rajasthan", Toast.LENGTH_SHORT).show();
        }

    }

    public void answerThree(View view) {
        textView = findViewById(R.id.score);
        checkBox = findViewById(R.id.lucknow);
        checkBox2 = findViewById(R.id.pune);
        checkBox3 = findViewById(R.id.new_york);
        checkBox4 = findViewById(R.id.california);

        if ((checkBox2.isChecked() && checkBox.isChecked()) && (!checkBox3.isChecked() && !checkBox4.isChecked())) {
            if (flag3 == false) {
                finalScore = finalScore + 5;
              //  textView.setText("Score : " + finalScore);
                flag3 = true;
                Toast.makeText(this, "Correct Answer" + "\n" + "5 marks is added.", Toast.LENGTH_SHORT).show();
                return;
            }
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Incorrect Answer " + "\n" + "Correct Answer is : Lucknow and Pune", Toast.LENGTH_SHORT).show();
        }

    }

    public void answerFour(View view) {
        textView = findViewById(R.id.score);
        editText = findViewById(R.id.edit_query2);
        String name = editText.getText().toString();
        if (name.equals(null) || name.length() == 0) {
            Toast.makeText(this, "Please Type Your Answer", Toast.LENGTH_SHORT).show();
            return;
        } else if (name.equalsIgnoreCase("Amitabh Bachchan") || name.equalsIgnoreCase("amitabhbachchan")
                || name.equalsIgnoreCase("amitabh")) {
            if (flag4 == false) {
                finalScore = finalScore + 5;
              //  textView.setText("Score : " + finalScore);
                flag4 = true;
                Toast.makeText(this, "Correct Answer" + "\n" + "5 marks is added.", Toast.LENGTH_SHORT).show();
                return;
            }
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Incorrect Answer" + "\n" + "Correct Answer is : Amitabh Bachchan", Toast.LENGTH_SHORT).show();
        }
    }

    public void score(View view) {
        if (finalScore == 5){
            Toast.makeText(this, "Your Final Score is 5", Toast.LENGTH_SHORT).show();
        }
        else if (finalScore == 10){
            Toast.makeText(this, "Your Final Score is 10", Toast.LENGTH_SHORT).show();
        }
        else if (finalScore == 15){
            Toast.makeText(this, "Your Final Score is 15", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Your Final Score is 20", Toast.LENGTH_SHORT).show();
        }

    }
}
