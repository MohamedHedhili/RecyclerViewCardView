package com.mohamedhedhili.recyclerviewcardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by mohamedHedhili on 02/12/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    List<MyObject> list;

    // add a constructor to input a list
    public MyAdapter(List<MyObject> list) {
        this.list = list;
    }
// this function allows to create the viewHolder
// and by the same to indicate the view to inflate (from the layouts xml)
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cards,viewGroup,false);
        return new MyViewHolder(view);
    }

    // here we will fill our cell with the text / image of each MyObjects
    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        MyObject myObject = list.get(position);
        myViewHolder.bind(myObject);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
