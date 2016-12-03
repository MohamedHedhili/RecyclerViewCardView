package com.mohamedhedhili.recyclerviewcardview;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

/**
 * Created by mohamedHedhili on 02/12/2016.
 */

public class MyViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{

    private TextView textViewView;
    private ImageView imageView;

    // itemView is the view corresponding to 1 cell
    public MyViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        textViewView = (TextView) itemView.findViewById(R.id.text);
        imageView = (ImageView) itemView.findViewById(R.id.image);
    }
    @Override
    public void onClick(View view) {

        Toast.makeText(view.getContext(),""+textViewView.getText().toString(),Toast.LENGTH_SHORT).show();
    }

// then add a function to fill the cell according to a MyObject
  public void bind(MyObject myObject){
      textViewView.setText(myObject.getText());
        Glide.with(imageView.getContext()).load(myObject.getImageUrl()).centerCrop().into(imageView);

    }



}