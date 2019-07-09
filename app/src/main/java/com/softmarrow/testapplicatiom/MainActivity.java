package com.softmarrow.testapplicatiom;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.widget.Button;
import android.widget.LinearLayout;

import com.softmarrow.testapplicatiom.view.PersonalPageDrawView;

public class MainActivity extends AppCompatActivity {

    private float width;
    private float height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PersonalPageDrawView drawCross = new PersonalPageDrawView(this);
        LinearLayout layout1 = (LinearLayout) findViewById(R.id.drawcross);
        layout1.addView(drawCross);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;

        Button button = findViewById(R.id.button2);
        button.setText("Изменения за месяц");
        button.setX(width * 0.19f);
        button.setY(height * 0.7f);

    }
}
