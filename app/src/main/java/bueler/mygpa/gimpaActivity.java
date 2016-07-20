package bueler.mygpa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class gimpaActivity extends Activity  {
    private int arr_length=0;
    private String courseNum = null;
    private double[][] arr;
    Intent uni_grade=new Intent();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bueler.mygpa.R.layout.activity_gimpa);


        String []sch=getResources().getStringArray(bueler.mygpa.R.array.gimpa_grade);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sch);



        final AutoCompleteTextView one = (AutoCompleteTextView) findViewById(bueler.mygpa.R.id.g1);one.setVisibility(View.INVISIBLE);
        one.setAdapter(adapter);
        final AutoCompleteTextView two = (AutoCompleteTextView) findViewById(bueler.mygpa.R.id.g2); two.setVisibility(View.INVISIBLE);
        two.setAdapter(adapter);
        final AutoCompleteTextView three = (AutoCompleteTextView) findViewById(bueler.mygpa.R.id.g3); three.setVisibility(View.INVISIBLE);
        three.setAdapter(adapter);
        final AutoCompleteTextView four = (AutoCompleteTextView) findViewById(bueler.mygpa.R.id.g4); four.setVisibility(View.INVISIBLE);
        four.setAdapter(adapter);
        final AutoCompleteTextView five = (AutoCompleteTextView) findViewById(bueler.mygpa.R.id.g5); five.setVisibility(View.INVISIBLE);
        five.setAdapter(adapter);
        final AutoCompleteTextView six = (AutoCompleteTextView) findViewById(bueler.mygpa.R.id.g6); six.setVisibility(View.INVISIBLE);
        six.setAdapter(adapter);
        final AutoCompleteTextView seven = (AutoCompleteTextView) findViewById(bueler.mygpa.R.id.g7); seven.setVisibility(View.INVISIBLE);
        seven.setAdapter(adapter);

        final AutoCompleteTextView h_one = (AutoCompleteTextView) findViewById(bueler.mygpa.R.id.h1); h_one.setVisibility(View.INVISIBLE);
        h_one.setAdapter(adapter);
        final AutoCompleteTextView h_two = (AutoCompleteTextView) findViewById(bueler.mygpa.R.id.h2); h_two.setVisibility(View.INVISIBLE);
        h_two.setAdapter(adapter);
        final AutoCompleteTextView h_three = (AutoCompleteTextView) findViewById(bueler.mygpa.R.id.h3); h_three.setVisibility(View.INVISIBLE);
        h_three.setAdapter(adapter);
        final AutoCompleteTextView h_four = (AutoCompleteTextView) findViewById(bueler.mygpa.R.id.h4); h_four.setVisibility(View.INVISIBLE);
        h_four.setAdapter(adapter);
        final AutoCompleteTextView h_five = (AutoCompleteTextView) findViewById(bueler.mygpa.R.id.h5); h_five.setVisibility(View.INVISIBLE);
        h_five.setAdapter(adapter);
        final AutoCompleteTextView h_six = (AutoCompleteTextView) findViewById(bueler.mygpa.R.id.h6); h_six.setVisibility(View.INVISIBLE);
        h_six.setAdapter(adapter);
        final AutoCompleteTextView h_seven = (AutoCompleteTextView) findViewById(bueler.mygpa.R.id.h7); h_seven.setVisibility(View.INVISIBLE);
        h_seven.setAdapter(adapter);




        final Button calc = (Button) findViewById(bueler.mygpa.R.id.button_calculate);calc.setVisibility(View.INVISIBLE);

        final TextView result = (TextView) findViewById(bueler.mygpa.R.id.textView_displayGPA1); result.setVisibility(View.INVISIBLE);

        final EditText c = (EditText) findViewById(bueler.mygpa.R.id.editText_courseNum);

        c.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override

            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;

                if (actionId == EditorInfo.IME_ACTION_NEXT) {
                    courseNum = c.getEditableText().toString();//assigns number od courses to courseNum
                    arr_length = Integer.parseInt(courseNum);
                    arr = new double[arr_length][3];

                    calc.setVisibility(View.VISIBLE);
                    result.setVisibility(View.VISIBLE);


                    switch (arr_length) {
                        case 1:
                            one.setVisibility(View.VISIBLE);h_one.setVisibility(View.VISIBLE);

                            one.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                                @Override
                                public void onFocusChange(View v, boolean hasFocus) {
                                    uni_grade = new Intent(gimpaActivity.this, bueler.mygpa.uni_grade.class);
                                    startActivityForResult(uni_grade, 0);
                                }});





                            break;
                        case 2:
                            one.setVisibility(View.VISIBLE);
                            h_one.setVisibility(View.VISIBLE);
                            two.setVisibility(View.VISIBLE);
                            h_two.setVisibility(View.VISIBLE);
                            break;
                        case 3:
                            one.setVisibility(View.VISIBLE);
                            h_one.setVisibility(View.VISIBLE);
                            two.setVisibility(View.VISIBLE);
                            h_two.setVisibility(View.VISIBLE);
                            three.setVisibility(View.VISIBLE);
                            h_three.setVisibility(View.VISIBLE);
                            break;
                        case 4:
                            one.setVisibility(View.VISIBLE);
                            h_one.setVisibility(View.VISIBLE);
                            two.setVisibility(View.VISIBLE);
                            h_two.setVisibility(View.VISIBLE);
                            three.setVisibility(View.VISIBLE);
                            h_three.setVisibility(View.VISIBLE);
                            four.setVisibility(View.VISIBLE);
                            h_four.setVisibility(View.VISIBLE);
                            break;
                        case 5:
                            one.setVisibility(View.VISIBLE);
                            h_one.setVisibility(View.VISIBLE);
                            two.setVisibility(View.VISIBLE);
                            h_two.setVisibility(View.VISIBLE);
                            three.setVisibility(View.VISIBLE);
                            h_three.setVisibility(View.VISIBLE);
                            four.setVisibility(View.VISIBLE);
                            h_four.setVisibility(View.VISIBLE);
                            five.setVisibility(View.VISIBLE);
                            h_five.setVisibility(View.VISIBLE);
                            break;
                        case 6:
                            one.setVisibility(View.VISIBLE);
                            h_one.setVisibility(View.VISIBLE);
                            two.setVisibility(View.VISIBLE);
                            h_two.setVisibility(View.VISIBLE);
                            three.setVisibility(View.VISIBLE);
                            h_three.setVisibility(View.VISIBLE);
                            four.setVisibility(View.VISIBLE);
                            h_four.setVisibility(View.VISIBLE);
                            five.setVisibility(View.VISIBLE);
                            h_five.setVisibility(View.VISIBLE);
                            six.setVisibility(View.VISIBLE);
                            h_six.setVisibility(View.VISIBLE);
                            break;
                        case 7:
                            one.setVisibility(View.VISIBLE);
                            h_one.setVisibility(View.VISIBLE);
                            two.setVisibility(View.VISIBLE);
                            h_two.setVisibility(View.VISIBLE);
                            three.setVisibility(View.VISIBLE);
                            h_three.setVisibility(View.VISIBLE);
                            four.setVisibility(View.VISIBLE);
                            h_four.setVisibility(View.VISIBLE);
                            five.setVisibility(View.VISIBLE);
                            h_five.setVisibility(View.VISIBLE);
                            six.setVisibility(View.VISIBLE);
                            h_six.setVisibility(View.VISIBLE);
                            seven.setVisibility(View.VISIBLE);
                            h_seven.setVisibility(View.VISIBLE);
                            break;


                    }

                    handled = true;
                }
                return handled;
            }

        });




                calc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        switch (arr_length) {
                            case 1:

                                int i = 0;
                                arr[i][0] = converter(one.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_one.getText().toString());//input credit hours
                                double GPA = getGP(arr) / getCH(arr);
                                result.setText("GPA:" + GPA);
                                break;

                            case 2:

                                i = 0;
                                arr[i][0] = converter(one.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_one.getText().toString());//input credit hours

                                i = 1;
                                arr[i][0] = converter(two.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_two.getText().toString());//input credit h
                                GPA = getGP(arr) / getCH(arr);
                                result.setText("GPA: " + GPA);
                                break;

                            case 3:

                                i = 0;
                                arr[i][0] = converter(one.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_one.getText().toString());//input credit hours
                                two.isEnabled();
                                h_two.isEnabled();
                                i = 1;
                                arr[i][0] = converter(two.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_two.getText().toString());//input credit hours
                                three.isEnabled();
                                h_three.isEnabled();
                                i = 2;
                                arr[i][0] = converter(three.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_three.getText().toString());//input credit hours
                                GPA = getGP(arr) / getCH(arr);
                                result.setText("GPA: " + GPA);
                                break;

                            case 4:

                                i = 0;
                                arr[i][0] = converter(one.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_one.getText().toString());//input credit hours

                                i = 1;
                                arr[i][0] = converter(two.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_two.getText().toString());//input credit hours

                                i = 2;
                                arr[i][0] = converter(three.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_three.getText().toString());//input credit hours

                                i = 3;
                                arr[i][0] = converter(four.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_four.getText().toString());//input credit hours
                                GPA = getGP(arr) / getCH(arr);
                                result.setText("GPA: " + GPA);
                                break;
                            case 5:

                                i = 0;
                                arr[i][0] = converter(one.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_one.getText().toString());//input credit hours

                                i = 1;
                                arr[i][0] = converter(two.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_two.getText().toString());//input credit hours

                                i = 2;
                                arr[i][0] = converter(three.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_three.getText().toString());//input credit hours

                                i = 3;
                                arr[i][0] = converter(four.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_four.getText().toString());//input credit hours

                                i = 4;
                                arr[i][0] = converter(five.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_five.getText().toString());//input credit hours
                                GPA = getGP(arr) / getCH(arr);
                                result.setText("GPA: " + GPA);
                                break;
                            case 6:

                                i = 0;
                                arr[i][0] = converter(one.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_one.getText().toString());//input credit hours

                                i = 1;
                                arr[i][0] = converter(two.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_two.getText().toString());//input credit hours

                                i = 2;
                                arr[i][0] = converter(three.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_three.getText().toString());//input credit hours

                                i = 3;
                                arr[i][0] = converter(four.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_four.getText().toString());//input credit hours

                                i = 4;
                                arr[i][0] = converter(five.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_five.getText().toString());//input credit hours

                                i = 5;
                                arr[i][0] = converter(six.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_six.getText().toString());//input credit hours


                                GPA = getGP(arr) / getCH(arr);
                                result.setText("GPA:" + GPA);
                                break;
                            case 7:

                                i = 0;
                                arr[i][0] = converter(one.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_one.getText().toString());//input credit hours

                                i = 1;
                                arr[i][0] = converter(two.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_two.getText().toString());//input credit hours

                                i = 2;
                                arr[i][0] = converter(three.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_three.getText().toString());//input credit hours

                                i = 3;
                                arr[i][0] = converter(four.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_four.getText().toString());//input credit hours

                                i = 4;
                                arr[i][0] = converter(five.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_five.getText().toString());//input credit hours

                                i = 5;
                                arr[i][0] = converter(six.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_six.getText().toString());//input credit hours

                                i = 6;
                                arr[i][0] = converter(seven.getText().toString());//input grade
                                arr[i][1] = Integer.parseInt(h_seven.getText().toString());//input credit hours
                                GPA = getGP(arr) / getCH(arr);
                                result.setText("GPA:" + GPA);
                                break;
                        }

                    }


                });


}
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data) {

        if (requestCode == 0) {
            if (resultCode == RESULT_OK) {
                String grade=data.getStringExtra("grade").toString();
                Toast.makeText(gimpaActivity.this,grade,Toast.LENGTH_LONG).show();

            }
        }
    }
    public static double converter(String g) {
        double mark = 0;
        if (g.equals("A")) {
            mark = 4;
        } else if (g.equals("A-")) {
            mark = 3.75;
        } else if (g.equals("B+")) {
            mark = 3.5;
        } else if (g.equals("B")) {
            mark = 3;
        } else if (g.equals("C+")) {
            mark = 2.5;
        } else if (g.equals("C")) {
            mark = 2;
        } else if (g.equals("C-")) {
            mark = 1.75;
        } else if (g.equals("D")) {
            mark = 1.5;
        } else mark = 1;


        return mark;
    }

    double total_gp;
    double h,g;

    public double getGP(double[][] a) {
//method responsible for multiplying gpa and corresponding credit hours
        for (int row = 0; row < a.length; row++) {

            for (int column = 0; column <= 0; column++) {
                g = a[row][column];
                //System.out.println("g:"+g);


                for (column = 1; column <= 1; column++)
                    h = a[row][column];
                //System.out.println("h:"+h);


                for (column = 2; column <= 2; column++)
                    a[row][2] = g * h;

            }
        }
        total_gp = 0;
        for (int row = 0; row < a.length; row++) {
            for (int column = 2; column <= 2; column++)
                total_gp += a[row][column];
        }

        //System.out.println(total_gp);
        return total_gp;
    }

    //method responsible for calculating total hours
    public double getCH(double[][] h) {
        int total_hrs = 0;
        for (int row = 0; row < h.length; row++) {
            for (int column = 1; column <= 1; column++) {
                total_hrs += h[row][column];
            }
        }
        //System.out.println("total credit hours: "+total_hrs);
        return total_hrs;
    }











}
