package bueler.mygpa;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.lang.*;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Second extends Activity   {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bueler.mygpa.R.layout.activity_second);

        String courseNum=null;
        int arr_length=0;
        EditText c=(EditText)findViewById(bueler.mygpa.R.id.editText_courseNum);
        courseNum=c.getEditableText().toString();
        arr_length=Integer.parseInt(courseNum);

        double [][]arr=new double[arr_length][3];

        EditText one=(EditText)findViewById(bueler.mygpa.R.id.editText_G1);
        EditText two=(EditText)findViewById(bueler.mygpa.R.id.editText_G2);
        EditText three=(EditText)findViewById(bueler.mygpa.R.id.editText_G3);
        EditText four=(EditText)findViewById(bueler.mygpa.R.id.editText_G4);
        EditText five=(EditText)findViewById(bueler.mygpa.R.id.editText_G5);
        EditText six=(EditText)findViewById(bueler.mygpa.R.id.editText_G6);
        EditText seven=(EditText)findViewById(bueler.mygpa.R.id.editText_G7);

        EditText h_one=(EditText)findViewById(bueler.mygpa.R.id.editText_H1);
        EditText h_two=(EditText)findViewById(bueler.mygpa.R.id.editText_H2);
        EditText h_three=(EditText)findViewById(bueler.mygpa.R.id.editText_H3);
        EditText h_four=(EditText)findViewById(bueler.mygpa.R.id.editText_H4);
        EditText h_five=(EditText)findViewById(bueler.mygpa.R.id.editText_H5);
        EditText h_six=(EditText)findViewById(bueler.mygpa.R.id.editText_H6);
        EditText h_seven=(EditText)findViewById(bueler.mygpa.R.id.editText_H7);

        EditText idcont=(EditText)findViewById(0 );
        boolean enable=idcont.isEnabled();
        if(idcont==one||idcont==two||idcont==three||idcont==four||idcont==five||idcont==six||idcont==seven){
            enable=false;
        }
        if(idcont==h_one||idcont==h_two||idcont==h_three||idcont==h_four||idcont==h_five||idcont==h_six||idcont==h_seven){
            enable=false;
        }

        TextView result=(TextView)findViewById(bueler.mygpa.R.id.textView_displayGPA2);

        switch(arr_length)
        {
            case 1:one.isEnabled();h_one.isEnabled();
               int i=0;
                   arr[i][0] = converter(one.getText().toString());//input grade
                   arr[i][1]=Integer.parseInt(h_one.getText().toString());//input credit hours
                   double GPA=getGP(arr)/getCH(arr);
                result.setText("GPA:"+GPA);
                break;

            case 2:one.isEnabled();h_one.isEnabled();
                 i=0;
                arr[i][0] = converter(one.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_one.getText().toString());//input credit hours
                   two.isEnabled();h_two.isEnabled();
                i=1;
                arr[i][0] = converter(two.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_two.getText().toString());//input credit h
                 GPA=getGP(arr)/getCH(arr);
                result.setText("GPA: "+GPA);
                break;

            case 3:one.isEnabled();h_one.isEnabled();
                i=0;
                arr[i][0] = converter(one.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_one.getText().toString());//input credit hours
                two.isEnabled();h_two.isEnabled();
                i=1;
                arr[i][0] = converter(two.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_two.getText().toString());//input credit hours
                   three.isEnabled();h_three.isEnabled();
            i=2;
            arr[i][0] = converter(three.getText().toString());//input grade
            arr[i][1]=Integer.parseInt(h_three.getText().toString());//input credit hours
                 GPA=getGP(arr)/getCH(arr);
                result.setText("GPA: "+GPA);
            break;

            case 4:one.isEnabled();h_one.isEnabled();
                i=0;
                arr[i][0] = converter(one.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_one.getText().toString());//input credit hours
                two.isEnabled();h_two.isEnabled();
                i=1;
                arr[i][0] = converter(two.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_two.getText().toString());//input credit hours
                three.isEnabled();h_three.isEnabled();
                i=2;
                arr[i][0] = converter(three.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_three.getText().toString());//input credit hours
                   four.isEnabled();h_four.isEnabled();
                i=3;
                arr[i][0] = converter(four.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_four.getText().toString());//input credit hours
                 GPA=getGP(arr)/getCH(arr);
                result.setText("GPA: "+GPA);
                break;
            case 5:one.isEnabled();h_one.isEnabled();
                i=0;
                arr[i][0] = converter(one.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_one.getText().toString());//input credit hours
                two.isEnabled();h_two.isEnabled();
                i=1;
                arr[i][0] = converter(two.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_two.getText().toString());//input credit hours
                three.isEnabled();h_three.isEnabled();
                i=2;
                arr[i][0] = converter(three.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_three.getText().toString());//input credit hours
                four.isEnabled();h_four.isEnabled();
                i=3;
                arr[i][0] = converter(four.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_four.getText().toString());//input credit hours
                   five.isEnabled();h_five.isEnabled();
                i=4;
                arr[i][0] = converter(five.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_five.getText().toString());//input credit hours
                 GPA=getGP(arr)/getCH(arr);
                result.setText("GPA: "+GPA);
                break;
            case 6:one.isEnabled();h_one.isEnabled();
                i=0;
                arr[i][0] = converter(one.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_one.getText().toString());//input credit hours
                two.isEnabled();h_two.isEnabled();
                i=1;
                arr[i][0] = converter(two.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_two.getText().toString());//input credit hours
                three.isEnabled();h_three.isEnabled();
                i=2;
                arr[i][0] = converter(three.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_three.getText().toString());//input credit hours
                four.isEnabled();h_four.isEnabled();
                i=3;
                arr[i][0] = converter(four.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_four.getText().toString());//input credit hours
                five.isEnabled();h_five.isEnabled();
                i=4;
                arr[i][0] = converter(five.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_five.getText().toString());//input credit hours
                   six.isEnabled();h_six.isEnabled();
                i=5;
                arr[i][0] = converter(five.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_five.getText().toString());//input credit hours
                 GPA=getGP(arr)/getCH(arr);
                result.setText("GPA:"+GPA);
                break;
            case 7:one.isEnabled();h_one.isEnabled();
                i=0;
                arr[i][0] = converter(one.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_one.getText().toString());//input credit hours
                two.isEnabled();h_two.isEnabled();
                i=1;
                arr[i][0] = converter(two.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_two.getText().toString());//input credit hours
                three.isEnabled();h_three.isEnabled();
                i=2;
                arr[i][0] = converter(three.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_three.getText().toString());//input credit hours
                four.isEnabled();h_four.isEnabled();
                i=3;
                arr[i][0] = converter(four.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_four.getText().toString());//input credit hours
                five.isEnabled();h_five.isEnabled();
                i=4;
                arr[i][0] = converter(five.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_five.getText().toString());//input credit hours
                six.isEnabled();h_six.isEnabled();
                i=5;
                arr[i][0] = converter(six.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_six.getText().toString());//input credit hours
                   seven.isEnabled();h_seven.isEnabled();
                i=6;
                arr[i][0] = converter(seven.getText().toString());//input grade
                arr[i][1]=Integer.parseInt(h_seven.getText().toString());//input credit hours
                 GPA=getGP(arr)/getCH(arr);
                result.setText("GPA:"+GPA);
                break;
}

    }

    public static double converter(String g){
        double mark=0;
        if(g.equals("A")){
            mark=4;}
        else if(g.equals("A-")){
            mark=3.75;}
        else if (g.equals("B+")){
            mark=3.5;}
        else if (g.equals("B")){
            mark = 3;}
        else if (g.equals("C+")){
            mark = 2.5;}
        else if (g.equals("C")){
            mark = 2;}
        else if (g.equals("C-")){
            mark = 1.75;}
        else if (g.equals("D")){
            mark = 1.5;}
        else mark = 1;


        return mark;
    }
    double total_gp;double h, g;

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
        total_gp=0;
        for(  int row=0;row<a.length;row++){
            for(  int column=2;column<=2;column++)
                total_gp+=a[row][column];}

        //System.out.println(total_gp);
        return total_gp;
    }
    //method responsible for calculating total hours
    public double getCH(double[][]h){
        int total_hrs=0;
        for(int row=0;row<h.length;row++){
            for(int column=1;column<=1;column++){
                total_hrs+=h[row][column];
            }}
        //System.out.println("total credit hours: "+total_hrs);
        return total_hrs;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(bueler.mygpa.R.menu.menu_second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == bueler.mygpa.R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
