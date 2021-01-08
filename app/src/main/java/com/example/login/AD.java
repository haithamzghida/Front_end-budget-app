package com.example.login;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.login.ui.products;

import java.util.List;

public class AD extends RecyclerView.Adapter<AD.MyViewHolder> {

    private Context mContext ;
    private List<products> mData ;

    public AD(Context mContext, List<products> mData ) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view=mInflater.inflate(R.layout.cardveiw_item_products,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.prodtitle.setText(mData.get(position).getTitle());
        holder.prodprice.setText(mData.get(position).getPrice());
        //Picasso.get().load(mData.get(position).getT()).into(holder.prodimg);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView prodtitle ;
        TextView prodprice;
        ImageView prodimg;
        CardView cardView;
        public MyViewHolder(View itemView) {
            super(itemView);

            prodtitle = (TextView) itemView.findViewById(R.id.title);
            prodprice = (TextView) itemView.findViewById(R.id.price);
            prodimg = (ImageView) itemView.findViewById(R.id.prodimg);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
        }
    }


}
