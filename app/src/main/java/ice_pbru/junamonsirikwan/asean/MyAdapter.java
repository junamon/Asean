package ice_pbru.junamonsirikwan.asean;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by ice on 16/5/2559.
 */
public class MyAdapter extends BaseAdapter {
    //Explicit
    private Context objContext;
    private int[] aseanInts;
    private String[] aseanStrings;

    public MyAdapter(Context objContext, int[] aseanInts, String[] aseanStrings) {
        this.objContext = objContext;
        this.aseanInts = aseanInts;
        this.aseanStrings = aseanStrings;
    }

    public MyAdapter(MainActivity mainActivity, String[] strTile) {
    }

    @Override
    public int getCount() {
        return aseanStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = objLayoutInflater.inflate(R.layout.listview, viewGroup, false);

        //Show Titie
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        titleTextView.setText(aseanStrings[i]);

        return view1;
    }//getview
}//main class

