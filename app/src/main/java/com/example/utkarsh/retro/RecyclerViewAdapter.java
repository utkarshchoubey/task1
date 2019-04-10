package com.example.utkarsh.retro;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.SwitchCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.utkarsh.retro.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    LayoutInflater layoutInflater;
    Context context;
    ArrayList<Model> arrayList=new ArrayList<>();

    public RecyclerViewAdapter(Context context,ArrayList<Model> arrayList) {

        this.context = context;
        layoutInflater=LayoutInflater.from(context);
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itemview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        if(arrayList.get(position).getType()=="PHOTO"){
            holder.radio.setVisibility(View.GONE);
            holder.commentb.setVisibility(View.GONE);
        }
        if(arrayList.get(position).getType()=="SINGLE_CHOICE"){
            holder.ImageCard.setVisibility(View.GONE);
            holder.commentb.setVisibility(View.GONE);
        }
        if(arrayList.get(position).getType()=="COMMENT"){
            holder.radio.setVisibility(View.GONE);
            holder.ImageCard.setVisibility(View.GONE);
        }

        Log.d("arrived", String.valueOf(arrayList));


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        SwitchCompat switchButton;
        TextView commentBox;
        ImageView image;
        RadioButton op1,op2,op3;
        LinearLayout ImageCard,radio,commentb;

        public ViewHolder(View itemView) {
            super(itemView);
            switchButton=itemView.findViewById(R.id.switchButton);
            commentBox=itemView.findViewById(R.id.commentBox);
            image=itemView.findViewById(R.id.imageview);
            op1 =itemView.findViewById(R.id.optionA);
            op2=itemView.findViewById(R.id.optionB);
            op3=itemView.findViewById(R.id.optionC);
            ImageCard=itemView.findViewById(R.id.photo);
            radio=itemView.findViewById(R.id.single);
            commentb=itemView.findViewById(R.id.comment);


        }
    }
}