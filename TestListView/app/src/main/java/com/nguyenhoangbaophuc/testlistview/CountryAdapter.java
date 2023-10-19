package com.nguyenhoangbaophuc.testlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CountryAdapter extends BaseAdapter {
    private ArrayList<Country> countryList; // data src
    private Context context;
    private LayoutInflater inflater; // mapping XML to Java

    // adapter Constructor
    public CountryAdapter(ArrayList<Country> countryList, Context context) {
        this.countryList = countryList;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    //create a Holder inner class to contain Controls from XML (inner class)
    // tuong ung voi file item_layout
    class ControlHolder{
        ImageView imageViewFlag;
        TextView textViewName;
        TextView textViewPopulation;
    }

    @Override
    public int getCount() {
        return countryList.size();
    }

    @Override
    public Object getItem(int i) {
        return countryList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // get Item's View for setting data
        ControlHolder itemControlHolder;
        if(view == null){ // inflate from layout item XML
            view = inflater.inflate(R.layout.item_country_layout, null);
            // set refs for controls
            itemControlHolder = new ControlHolder();
            itemControlHolder.imageViewFlag = view.findViewById(R.id.imageViewFlag);
            itemControlHolder.textViewName = view.findViewById(R.id.textViewCountryName);
            itemControlHolder.textViewPopulation = view.findViewById(R.id.textViewPopulation);

            view.setTag(itemControlHolder);
        }else {
            itemControlHolder = (ControlHolder)view.getTag();
        }

        // set data for controls which hold in itemControlHolder
            //data
        Country nationI = countryList.get(i);
        itemControlHolder.textViewName.setText(nationI.getCountryName());
        itemControlHolder.textViewPopulation.setText("Populations: " + nationI.getPopulation());
            // image
        int resImageID = context.getResources().getIdentifier(
                nationI.getCountryFlag(),
                "mipmap",
                context.getPackageName()
        );
        itemControlHolder.imageViewFlag.setImageResource(resImageID);

        return view;
    }
}
