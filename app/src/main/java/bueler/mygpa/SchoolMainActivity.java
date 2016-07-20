package bueler.mygpa;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class SchoolMainActivity extends ListActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bueler.mygpa.R.layout.activity_school_main);

        String []school= {
                "GIMPA",

        };
       // ListView sch=(ListView)findViewById(R.id.);

        ArrayAdapter<String> s=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,school);
        setListAdapter(s);
    }

    @Override
    protected void onListItemClick(ListView l,View v,int position,long id){
        switch((int)position)
        {
            case 0:
                final Intent gimpa=new Intent(SchoolMainActivity.this,gimpaActivity.class);
                startActivity(gimpa);
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(bueler.mygpa.R.menu.menu_school_main, menu);
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
