package bueler.mygpa;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View;


public class uni_grade extends ListActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bueler.mygpa.R.layout.activity_uni_grade);

setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,getResources().getStringArray(bueler.mygpa.R.array.gimpa_grade)));




    }



    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Object object=this.getListAdapter().getItem(position);
        String g=object.toString();
        Intent data=new Intent();
        data.putExtra("grade",g);
        setResult(RESULT_OK,data);
        uni_grade.this.finish();
    }
}
