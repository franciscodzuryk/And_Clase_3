package com.aplicacion.nueva.clase_3;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by francisco on 8/19/17.
 */

class MyAdapter extends RecyclerView.Adapter {
    private String[] mDataset;

    public MyAdapter(String[] myDataSet) {
        mDataset = myDataSet;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_card_view, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v);
        return vh;

    }

    @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myHolder = (MyViewHolder)holder;
        String product = mDataset[position];
        myHolder.mProduct = product;
        myHolder.mTextName.setText(product);
        myHolder.mTextPrice.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView mTextName;
        public TextView mTextPrice;
        public int position;
        public String mProduct;

        public MyViewHolder(View v) {
            super(v);
            mTextName = (TextView)v.findViewById(R.id.textView);
            mTextPrice = (TextView)v.findViewById(R.id.textViewPrice);

            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            //if (this.mListener != null) mListener.onProductSelected(this.position);
        }
    }

}
