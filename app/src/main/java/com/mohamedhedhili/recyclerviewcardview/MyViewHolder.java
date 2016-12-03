package com.mohamedhedhili.recyclerviewcardview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by mohamedHedhili on 02/12/2016.
 */
public class MyViewHolder extends RecyclerView.ViewHolder{

    private TextView textViewView;
    private ImageView imageView;

    // itemView is the view corresponding to 1 cell
    public MyViewHolder(View itemView) {
        super(itemView);


        textViewView = (TextView) itemView.findViewById(R.id.text);
        imageView = (ImageView) itemView.findViewById(R.id.image);
    }

// then add a function to fill the cell according to a MyObject
  public void bind(MyObject myObject){
        textViewView.setText(myObject.getText());
        Glide.with(imageView.getContext()).load(myObject.getImageUrl()).centerCrop().into(imageView);
    }
}