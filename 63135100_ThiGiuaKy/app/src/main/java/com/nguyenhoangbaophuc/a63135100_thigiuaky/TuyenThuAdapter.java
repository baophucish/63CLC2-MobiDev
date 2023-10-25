package com.nguyenhoangbaophuc.a63135100_thigiuaky;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TuyenThuAdapter extends BaseAdapter {
    private ArrayList<TuyenThu> tuyenThus;
    private Context context;
    private LayoutInflater inflater;

    public TuyenThuAdapter(ArrayList<TuyenThu> tuyenThus, Context context) {
        this.tuyenThus = tuyenThus;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    class ControlHolder{
        ImageView imageView;
        TextView textViewName;
        TextView textViewAge;
    }
    @Override
    public int getCount() {
        return tuyenThus.size();
    }

    @Override
    public Object getItem(int i) {
        return tuyenThus.get(i);
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
            view = inflater.inflate(R.layout.item_tuyenthu_layout, null);
            // set refs for controls
            itemControlHolder = new ControlHolder();
            itemControlHolder.imageView = view.findViewById(R.id.imageView);
            itemControlHolder.textViewName = view.findViewById(R.id.textViewTuyenThuName);
            itemControlHolder.textViewAge= view.findViewById(R.id.textViewNamSinh);

            view.setTag(itemControlHolder);
        }else {
            itemControlHolder = (ControlHolder)view.getTag();
        }

        // set data for controls which hold in itemControlHolder
        //data
        TuyenThu tuyenThu = tuyenThus.get(i);
        itemControlHolder.textViewName.setText(tuyenThu.getName());
        itemControlHolder.textViewAge.setText("Ages: " + tuyenThu.getNamSinh());
        // image
        int resImageID = context.getResources().getIdentifier(
                tuyenThu.getAnhTT(),
                "mipmap",
                context.getPackageName()
        );
        itemControlHolder.imageView.setImageResource(resImageID);

        return view;
    }
}
