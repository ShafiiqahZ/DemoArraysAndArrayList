package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayActivity extends AppCompatActivity {

    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);

        tv = findViewById(R.id.textView1);

        //continue view the code in the worksheet
        String [] fruits = new String[3];

        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";


        String text = "Fruits\n";
        text += "=====\n";


        for (int i = 0; i < fruits.length; i ++){
            text += fruits[i] + "\n";
        }

        tv.setText(text);


    }
}