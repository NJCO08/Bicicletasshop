package com.example.gameshop.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gameshop.Domain.PopularDomain;
import com.example.gameshop.R;

import java.util.ArrayList;

public class PopularListAdapter extends RecyclerView.Adapter<PopularListAdapter.ViewHolder> {
    ArrayList<PopularDomain> items;
    Context context;

    public PopularListAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public PopularListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_pop_list,parent,false);
        context=parent.getContext();
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularListAdapter.ViewHolder holder, int position) {
    holder.titleTxt.setText(items.get(position).getTitle());
    holder.feeTxt.setText("$"+items.get(position).getPrice());
    holder.scoreTxt.setText(""+items.get(position).getScore());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView  titleTxt,timeTxt,ScoreTxt;
        ImageView pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titleTxt=itemView.findViewById(R.id.titleTxt);
            feeTxt=itemView.findViewById(R.id.feeTxt);
            scoreTxt=itemView.findViewById(R.id.scoreTxt);
            pic=itemView.findViewById(R.id.pic);

        }
    }
}
