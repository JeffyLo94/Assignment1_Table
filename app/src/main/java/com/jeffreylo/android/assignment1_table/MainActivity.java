package com.jeffreylo.android.assignment1_table;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.time.Year;

public class MainActivity extends AppCompatActivity {

    static final int TABLE_ROWS = 11;
    static final int TABLE_COLS = 5;

    static final String WHITE = "#FFFFFF";
    static final String BLACK = "#000000";
    static final String BLUE = "#CEFFFF";
    static final String YELLOW = "#FFFE9F";
    static final String ORANGE = "#FECB9C";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        HorizontalScrollView sv = new HorizontalScrollView(this);
        HorizontalScrollView.LayoutParams svLps = new HorizontalScrollView.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        sv.setLayoutParams(svLps);

        GridLayout grid = new GridLayout(this);
        grid.setBackgroundColor(Color.BLACK);
        grid.setRowCount(TABLE_ROWS);
        grid.setColumnCount(TABLE_COLS);
        grid.setOrientation(GridLayout.VERTICAL);
//        GridLayout.LayoutParams glp = new GridLayout.LayoutParams();
//        glp.setGravity(Gravity.FILL_HORIZONTAL);
//        glp.width = ViewGroup.LayoutParams.WRAP_CONTENT;
//        glp.height = ViewGroup.LayoutParams.WRAP_CONTENT;
//        grid.setLayoutParams( glp );
        grid.setLayoutParams( new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));

        //Add
        for( int i = 0; i < TABLE_ROWS; i++) {
            createTextViewAtCell(grid, i, 0, Integer.toString(i+1));
        }

        // ROW 1
        createTextViewAtCell(grid,
                            0, 1,
                            1,4,
                            0f, 4f,
                            "Rules void hello1(int hour)",
                            BLACK, WHITE );

        // ROWS 2 and 3
        createTextViewAtCell(grid,
                            1, 1,
                            2, 1,
                            2f, 0f,
                            "properties",
                            WHITE, BLACK );
        createTextViewAtCell(grid, 1, 2,
                            1, 2,
                            0f, 2f,
                            "name",
                            WHITE, BLACK );
        createTextViewAtCell(grid, 1, 4,
                            1, 1,
                            0f, 0f,
                            "Day Hour Classification",
                            WHITE, BLACK, Gravity.LEFT );
        createTextViewAtCell(grid, 2, 2,
                            1, 2,
                            0f, 2f,
                            "category",
                            WHITE, BLACK );
        createTextViewAtCell(grid, 2, 4,
                            1, 1,
                            0f, 0f,
                            "Day and Time",
                            WHITE, BLACK, Gravity.LEFT );

        // ROW 4
        createBoldTextViewAtCell(grid,
                            3, 1,
                            1, 1,
                            0f, 0f,
                            "RULE",
                            BLUE, BLACK );
        createBoldTextViewAtCell(grid,
                            3, 2,
                            1, 2,
                            0f, 2f,
                            "C1",
                            BLUE, BLACK );
        createBoldTextViewAtCell(grid,
                            3, 4,
                            1, 1,
                            0f, 0f,
                            "A1",
                            BLUE, BLACK );
        // ROW 5
        createTextViewAtCell(grid,
                            4, 1,
                            1, 1,
                            0f, 0f,
                            "",
                            BLUE, BLACK );
        createTextViewAtCell(grid,
                            4, 2,
                            1, 2,
                            0f, 2f,
                            "min <= hour && hour <= max",
                            BLUE, BLACK );
        createTextViewAtCell(grid,
                            4, 4,
                            1, 1,
                            0f, 0f,
                            "System.out.println(greeting +\", World!\")",
                            BLUE, BLACK );
//        GridLayout innerGrid = new GridLayout(this);
//        innerGrid.setBackgroundColor(Color.BLACK);
//        innerGrid.setRowCount(6);
//        innerGrid.setColumnCount(2);
//        innerGrid.setOrientation(GridLayout.VERTICAL);
//        innerGrid.setLayoutParams( new ViewGroup.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.MATCH_PARENT
//        ));
//        GridLayout.Spec rowSpec;
//        GridLayout.Spec colSpec;
//        rowSpec = GridLayout.spec(5, 6, GridLayout.FILL, 0f);
//        colSpec = GridLayout.spec(2, 2, GridLayout.FILL, 0f);
//        GridLayout.LayoutParams p = new GridLayout.LayoutParams(rowSpec, colSpec);
//        grid.addView(innerGrid, p);

//        GridLayout.Spec rowSpec;
//        GridLayout.Spec colSpec;
//        rowSpec = GridLayout.spec(5, 6, GridLayout.FILL, 0f);
//        colSpec = GridLayout.spec(2, 2, GridLayout.FILL, 0f);
//        GridLayout.LayoutParams p = new GridLayout.LayoutParams(rowSpec, colSpec);
//        grid.addView(innerGrid, p);

        View childGrid = LayoutInflater.from(this).inflate(
                R.layout.inner_grid, null
        );
        GridLayout.Spec rowSpec;
        GridLayout.Spec colSpec;
        rowSpec = GridLayout.spec(5, 6, GridLayout.FILL, 0f);
        colSpec = GridLayout.spec(2, 2, GridLayout.FILL, 0f);
        GridLayout.LayoutParams p = new GridLayout.LayoutParams(rowSpec, colSpec);
        grid.addView(childGrid, p);


        // ROW 6
        createTextViewAtCell(grid,
                5, 1,
                1, 1,
                0f, 0f,
                "",
                BLUE, BLACK );
//        createTextViewAtCell(innerGrid,
//                0, 0,
//                1, 1, 0f, 0f, "int min", BLUE, BLACK);
//        createTextViewAtCell(innerGrid,
//                0, 1,
//                1, 1, 0f, 0f, "int max", BLUE, BLACK);
//        createTwoColumnTextViewGrid(innerGrid,
//                0, 1,
//                1, 2,
//                0f, 0f,
//                "int min", "int max",
//                BLUE, BLACK, false);
        createTextViewAtCell(grid,
                5, 4,
                1, 1,
                0f, 0f,
                "String greeting",
                BLUE, BLACK );
        // ROW 7
        createBoldTextViewAtCell(grid,
                6, 1,
                1, 1,
                0f, 0f,
                "Rule",
                WHITE, BLACK );
//        createBoldTextViewAtCell(innerGrid,
//                1, 0,
//                1, 1, 0f, 1f, "From", YELLOW, BLACK);
//        createBoldTextViewAtCell(innerGrid,
//                1, 1,
//                1, 1, 0f, 1f, "To", YELLOW, BLACK);
        createBoldTextViewAtCell(grid,
                6, 4,
                1, 1,
                0f, 0f,
                "Greeting",
                ORANGE, BLACK );
        // ROW 8
        createTextViewAtCell(grid,
                7, 1,
                1, 1,
                0f, 0f,
                "R10",
                WHITE, BLACK, Gravity.LEFT );
//        createTextViewAtCell(innerGrid,
//                2, 0,
//                1, 1, 0f, 1f, "0", YELLOW, BLACK, Gravity.RIGHT);
//        createTextViewAtCell(innerGrid,
//                2, 1,
//                1, 1, 0f, 1f, "11", YELLOW, BLACK, Gravity.RIGHT);
        createTextViewAtCell(grid,
                7, 4,
                1, 1,
                0f, 0f,
                "Good Morning",
                ORANGE, BLACK, Gravity.LEFT );
        // ROW 9
        createTextViewAtCell(grid,
                8, 1,
                1, 1,
                0f, 0f,
                "R20",
                WHITE, BLACK, Gravity.LEFT );
//        createTextViewAtCell(innerGrid,
//                3, 0,
//                1, 1, 0f, 1f, "12", YELLOW, BLACK, Gravity.RIGHT);
//        createTextViewAtCell(innerGrid,
//                3, 1,
//                1, 1, 0f, 1f, "17", YELLOW, BLACK, Gravity.RIGHT);
        createTextViewAtCell(grid,
                8, 4,
                1, 1,
                0f, 0f,
                "Good Afternoon",
                ORANGE, BLACK, Gravity.LEFT );

        // ROW 10
        createTextViewAtCell(grid,
                9, 1,
                1, 1,
                0f, 0f,
                "R30",
                WHITE, BLACK, Gravity.LEFT );
//        createTextViewAtCell(innerGrid,
//                4, 0,
//                1, 1, 0f, 1f, "18", YELLOW, BLACK, Gravity.RIGHT);
//        createTextViewAtCell(innerGrid,
//                4, 1,
//                1, 1, 0f, 1f, "21", YELLOW, BLACK, Gravity.RIGHT);
        createTextViewAtCell(grid,
                9, 4,
                1, 1,
                0f, 0f,
                "Good Evening",
                ORANGE, BLACK, Gravity.LEFT );

        // ROW 11
        createTextViewAtCell(grid,
                10, 1,
                1, 1,
                0f, 0f,
                "R40",
                WHITE, BLACK, Gravity.LEFT );
//        createTextViewAtCell(innerGrid,
//                5, 0,
//                1, 1, 0f, 1f, "22", YELLOW, BLACK, Gravity.RIGHT);
//        createTextViewAtCell(innerGrid,
//                5, 1,
//                1, 1, 0f, 1f, "23", YELLOW, BLACK, Gravity.RIGHT);
        createTextViewAtCell(grid,
                10, 4,
                1, 1,
                0f, 0f,
                "Good Night",
                ORANGE, BLACK, Gravity.LEFT );

        sv.addView(grid);
        setContentView(sv);

    }



    private void createTextViewAtCell(GridLayout l, int row, int col, String str) {
        TextView tv = new TextView(this);
        tv.setText(str);
        tv.setTextSize(24);
        tv.setBackgroundColor(Color.LTGRAY);
        tv.setPadding(30, 1, 30, 1);
        tv.setGravity(Gravity.CENTER);


        GridLayout.Spec rowSpec = GridLayout.spec(row, GridLayout.CENTER, 0f);
        GridLayout.Spec colSpec = GridLayout.spec(col, 1f);

        GridLayout.LayoutParams p = new GridLayout.LayoutParams(rowSpec, colSpec);
        p.setMargins(2, 2, 2, 2);

        l.addView(tv, p);
    }

    private void createBoldTextViewAtCell(GridLayout l,
                                      int row, int col,
                                      int rowspan, int colspan,
                                      float rWeight, float cWeight,
                                      String str,
                                      String backgroundColor, String textColor) {
        TextView tv = new TextView(this);
        tv.setText(str);
        tv.setTextSize(24);
        tv.setTypeface(null, Typeface.BOLD);
        tv.setTextColor(Color.parseColor(textColor));
        tv.setBackgroundColor(Color.parseColor(backgroundColor));
        tv.setPadding(30, 1, 30, 1);

        if (row == 1 || row == 2) {
            if(col == 4 ){
                tv.setGravity(Gravity.LEFT);
            }
        } else if( row > 6) {
            if (col >= 2 && col < 4) {
                tv.setGravity(Gravity.RIGHT);
            } else {
                tv.setGravity(Gravity.LEFT);
            }
        } else if (row == 6 ){
            tv.setGravity(Gravity.LEFT);
        } else {
            tv.setGravity(Gravity.CENTER);
        }

        GridLayout.Spec rowSpec = GridLayout.spec(row, rowspan, GridLayout.FILL, rWeight);
        GridLayout.Spec colSpec = GridLayout.spec(col, colspan, GridLayout.FILL, cWeight);
        GridLayout.LayoutParams p = new GridLayout.LayoutParams(rowSpec, colSpec);
        p.setMargins(2, 2, 2, 2);

        l.addView(tv, p);
    }

    private void createTextViewAtCell(GridLayout l,
                                          int row, int col,
                                          int rowspan, int colspan,
                                          float rWeight, float cWeight,
                                          String str,
                                          String backgroundColor, String textColor) {
        TextView tv = new TextView(this);
        tv.setText(str);
        tv.setTextSize(24);
        tv.setTextColor(Color.parseColor(textColor));
        tv.setBackgroundColor(Color.parseColor(backgroundColor));
        tv.setPadding(30, 1, 30, 1);

//        if( row > 6) {
//            if (col >= 2 && col < 4) {
//                tv.setGravity(Gravity.RIGHT);
//            } else {
//                tv.setGravity(Gravity.LEFT);
//            }
//        } else if (row == 6 ){
//            tv.setGravity(Gravity.LEFT);
//        } else {
            tv.setGravity(Gravity.CENTER);
//        }

        GridLayout.Spec rowSpec;
        GridLayout.Spec colSpec;
//        if (row >= 5 && (col == 2 || col == 3)){
//            rowSpec = GridLayout.spec(row, rowspan, GridLayout.FILL, rWeight);
//            colSpec = GridLayout.spec(col, colspan, GridLayout.FILL, cWeight);
//        } else {
            rowSpec = GridLayout.spec(row, rowspan, GridLayout.FILL, rWeight);
            colSpec = GridLayout.spec(col, colspan, GridLayout.FILL, cWeight);
//        }

        GridLayout.LayoutParams p = new GridLayout.LayoutParams(rowSpec, colSpec);
        p.setMargins(2, 2, 2, 2);

        l.addView(tv, p);
    }

    private void createTextViewAtCell(GridLayout l,
                                      int row, int col,
                                      int rowspan, int colspan,
                                      float rWeight, float cWeight,
                                      String str,
                                      String backgroundColor, String textColor,
                                      int grav) {
        TextView tv = new TextView(this);
        tv.setText(str);
        tv.setTextSize(24);
        tv.setTextColor(Color.parseColor(textColor));
        tv.setBackgroundColor(Color.parseColor(backgroundColor));
        tv.setPadding(30, 1, 30, 1);
        tv.setGravity(grav);

        GridLayout.Spec rowSpec;
        GridLayout.Spec colSpec;
//        if (row >= 5 && (col == 2 || col == 3)){
//            rowSpec = GridLayout.spec(row, rowspan, GridLayout.FILL, rWeight);
//            colSpec = GridLayout.spec(col, colspan, GridLayout.FILL, cWeight);
//        } else {
            rowSpec = GridLayout.spec(row, rowspan, GridLayout.FILL, rWeight);
            colSpec = GridLayout.spec(col, colspan, GridLayout.FILL, cWeight);
//        }

        GridLayout.LayoutParams p = new GridLayout.LayoutParams(rowSpec, colSpec);
        p.setMargins(2, 2, 2, 2);

        l.addView(tv, p);
    }

}
