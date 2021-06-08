package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        tv = findViewById(R.id.textView2);

        //continue view the code in the worksheet
        //ArrayList <String> fruits = new ArrayList<String>();
        fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        String text = "Fruits\n";
        text += "=====\n";


        for (int i = 0; i < fruits.size(); i ++){
            text += fruits.get(i) + "\n";
        }

        /*fruits.add(3, "durian");
        String theFruit = fruits.get(1);
        fruits.remove(0);
        fruits.set(fruits.size()-1, "dragon fruit");*/

        tv.setText(text);




    }
}