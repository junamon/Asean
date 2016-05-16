package ice_pbru.junamonsirikwan.asean;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Create ListView
        createListView();

    }//main Met

    private void createListView() {

        Mydata objMydata = new Mydata();
        String[] strTile = objMydata.title();

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this,strTile);
        ListView myListView = (ListView) findViewById(R.id.listView);
        myListView.setAdapter(objMyAdapter);


    }//createlistview



}//main class
