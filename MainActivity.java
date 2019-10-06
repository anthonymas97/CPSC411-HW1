package com.example.hwassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        HorizontalScrollView hsv = new HorizontalScrollView(this);

        GridLayout myLayout = new GridLayout(this);
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        myLayout.setLayoutParams(params);
        myLayout.setOrientation(GridLayout.HORIZONTAL);
        myLayout.setColumnCount(20);
        myLayout.setRowCount(11);

//Adding numbers
        TextView tv = new TextView(this);
        tv.setText(" 1 ");
        tv.setTextColor(Color.BLACK);
        //tv.setPadding(20,0,20,0);
        tv.setTextSize(20);
        tv.setGravity(Gravity.CENTER);
        tv.setBackgroundColor(Color.GRAY);


        GridLayout.Spec row_spec = GridLayout.spec(0, 1, GridLayout.LayoutParams.MATCH_PARENT);
        GridLayout.Spec col_spec = GridLayout.spec(0, 1,GridLayout.LayoutParams.MATCH_PARENT);
        GridLayout.LayoutParams cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);


        for(int i = 1; i < 11; i++)
        {
            tv = new TextView(this);
            tv.setText("" + (i + 1));
            tv.setTextColor(Color.BLACK);
            tv.setTextSize(20);
            row_spec = GridLayout.spec(i,1,GridLayout.LayoutParams.MATCH_PARENT);
            col_spec = GridLayout.spec(0,1, GridLayout.LayoutParams.MATCH_PARENT);
            cParams = new GridLayout.LayoutParams(row_spec,col_spec);
            tv.setLayoutParams(cParams);
            tv.setGravity(Gravity.CENTER);
            tv.setBackgroundColor(Color.GRAY);
            myLayout.addView(tv);

        }
// Row 1
        tv = new TextView(this);
        tv.setText("Rules void hello1(int hour)");
        tv.setTextColor(Color.WHITE);
        tv.setTextSize(20);
        tv.setBackgroundColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        row_spec = GridLayout.spec(0, 1,GridLayout.LayoutParams.MATCH_PARENT);
        col_spec = GridLayout.spec(1, 6, GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

// Row 2-3
        tv = new TextView(this);
        tv.setText("properties");
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(1, 2,GridLayout.LayoutParams.MATCH_PARENT);
        col_spec = GridLayout.spec(1, 1,GridLayout.CENTER);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("name");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(1, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(2, 2,GridLayout.CENTER);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("category");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(2, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(2, 2,GridLayout.CENTER);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("Day Hour Classification");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(1, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(4, 1,GridLayout.CENTER);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("Day and Time");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(2, 1,GridLayout.LEFT);
        col_spec = GridLayout.spec(4, 1,GridLayout.LEFT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);
// Row 4
        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTextColor(Color.BLACK);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setBackgroundColor(Color.CYAN);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(3, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(1, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("C1");
        tv.setTextColor(Color.BLACK);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setTextSize(20);
        tv.setBackgroundColor(Color.CYAN);
        tv.setGravity(Gravity.CENTER);
        row_spec = GridLayout.spec(3, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(2, 2,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("A1");
        tv.setTextColor(Color.BLACK);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setTextSize(20);
        tv.setBackgroundColor(Color.CYAN);
        tv.setGravity(Gravity.CENTER);
        row_spec = GridLayout.spec(3, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(4, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);
// Row 5
        tv = new TextView(this);
        tv.setText("");
        tv.setBackgroundColor(Color.CYAN);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(4, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(1, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("min <= hour && hour <= max");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(20);
        tv.setBackgroundColor(Color.CYAN);
        tv.setGravity(Gravity.CENTER);
        row_spec = GridLayout.spec(4, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(2, 2,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("System.out.println(greeting +\",World!\")");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(20);
        tv.setBackgroundColor(Color.CYAN);
        tv.setGravity(Gravity.CENTER);
        row_spec = GridLayout.spec(4, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(4, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);
// Row 6
        tv = new TextView(this);
        tv.setText("");
        tv.setBackgroundColor(Color.CYAN);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(5, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(1, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("int min");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.CYAN);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(5, 1,GridLayout.LayoutParams.MATCH_PARENT);
        col_spec = GridLayout.spec(2, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("int max");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.CYAN);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(5, 1,GridLayout.LayoutParams.MATCH_PARENT);
        col_spec = GridLayout.spec(3, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("String greeting");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(20);
        tv.setBackgroundColor(Color.CYAN);
        tv.setGravity(Gravity.CENTER);
        row_spec = GridLayout.spec(5, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(4, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);
// Row 7
        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTextColor(Color.BLACK);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(6, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(1, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("From");
        tv.setTextColor(Color.BLACK);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(6, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(2, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("To");
        tv.setTextColor(Color.BLACK);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(6, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(3, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("Greeting");
        tv.setTextColor(Color.BLACK);
        tv.setTypeface(Typeface.DEFAULT_BOLD);
        tv.setTextSize(20);
        tv.setBackgroundColor(Color.RED);
        tv.setGravity(Gravity.LEFT);
        row_spec = GridLayout.spec(6, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(4, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

// Row 8
        tv = new TextView(this);
        tv.setText("R10");
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(7, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(1, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("0");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setGravity(Gravity.RIGHT);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(7, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(2, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("11");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setGravity(Gravity.RIGHT);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(7, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(3, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Morning");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(20);
        tv.setBackgroundColor(Color.RED);
        tv.setGravity(Gravity.LEFT);
        row_spec = GridLayout.spec(7, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(4, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);
// Row 9
        tv = new TextView(this);
        tv.setText("R20");
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(8, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(1, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("12");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setGravity(Gravity.RIGHT);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(8, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(2, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("17");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setGravity(Gravity.RIGHT);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(8, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(3, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Afternoon");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(20);
        tv.setBackgroundColor(Color.RED);
        tv.setGravity(Gravity.LEFT);
        row_spec = GridLayout.spec(8, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(4, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);
// Row 10
        tv = new TextView(this);
        tv.setText("R30");
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(9, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(1, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("18");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setGravity(Gravity.RIGHT);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(9, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(2, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("21");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setGravity(Gravity.RIGHT);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(9, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(3, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Evening");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(20);
        tv.setBackgroundColor(Color.RED);
        tv.setGravity(Gravity.LEFT);
        row_spec = GridLayout.spec(9, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(4, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);
// Row 11
        tv = new TextView(this);
        tv.setText("R40");
        tv.setTextColor(Color.BLACK);
        tv.setGravity(Gravity.LEFT);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(10, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(1, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("22");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setGravity(Gravity.RIGHT);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(10, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(2, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("23");
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setGravity(Gravity.RIGHT);
        tv.setTextSize(20);
        row_spec = GridLayout.spec(10, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(3, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        tv = new TextView(this);
        tv.setText("Good Night");
        tv.setTextColor(Color.BLACK);
        tv.setTextSize(20);
        tv.setBackgroundColor(Color.RED);
        tv.setGravity(Gravity.LEFT);
        row_spec = GridLayout.spec(10, 1,GridLayout.CENTER);
        col_spec = GridLayout.spec(4, 1,GridLayout.LayoutParams.MATCH_PARENT);
        cParams = new GridLayout.LayoutParams(row_spec,col_spec);
        tv.setLayoutParams(cParams);
        myLayout.addView(tv);

        hsv.addView(myLayout);
        setContentView(hsv);
    }
}
