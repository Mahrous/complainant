package com.example.shehab.complainant;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyRecyclerViewAdapter_phones extends RecyclerView.Adapter<MyRecyclerViewAdapter_phones.ViewHolder2> {

    private String[] mData;
    private String[] mData_name;
    private LayoutInflater mInflater;
    private ItemClickListener2 mClickListener;

    // data is passed into the constructor
    MyRecyclerViewAdapter_phones(Context context, String[] data,String[] data_name) {
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;
        this.mData_name = data_name;
    }

    // inflates the cell layout from xml when needed
    @Override
    @NonNull
    public ViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.coustom_grid_phones, parent, false);
        return new ViewHolder2(view);
    }

    // binds the data to the TextView in each cell
    @Override
    public void onBindViewHolder(@NonNull ViewHolder2 holder, int position) {
        holder.myTextView.setText(mData[position]);
        holder.myTextView_name.setText(mData_name[position]);
    }

    // total number of cells
    @Override
    public int getItemCount() {
        return mData.length;
    }


    // stores and recycles views as they are scrolled off screen
    public class ViewHolder2 extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView myTextView;
        TextView myTextView_name;
        ViewHolder2(View itemView) {
            super(itemView);
            myTextView =(TextView) itemView.findViewById(R.id.text_enfo);
            myTextView_name =(TextView) itemView.findViewById(R.id.text_name);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    String getItem(int id) {
        return mData[id];
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener2 itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener2 {
        void onItemClick(View view, int position);
    }
}
