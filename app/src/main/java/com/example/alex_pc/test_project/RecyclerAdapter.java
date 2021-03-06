package com.example.alex_pc.test_project;


import android.content.Intent;
import android.view.View;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import java.util.List;

import static android.support.v4.content.ContextCompat.startActivity;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RemindViewHolder> {

    View view;
    List<Note> data;



    public RecyclerAdapter(List<Note> data, View v) {
        this.data = data;
    }

    @Override
    public RemindViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.note_fragment, parent,false);
        return new RemindViewHolder(view);


    }

    @Override
    public void onBindViewHolder(RemindViewHolder holder, int position) {
        holder.currentItem = position;
//        new ImageLoadTask(data.get(position).getImageHref(), holder.itemImage).execute();
//        holder.itemName.setText(data.get(position).getName());
//        if(data.get(position).getShortDescription() != "") holder.itemShortDescription.setText(data.get(position).getShortDescription());
//        holder.itemRating.setRating(data.get(position).getRating());
    }




    @Override
    public int getItemCount() {
        return data.size();
    }

    public class RemindViewHolder extends RecyclerView.ViewHolder {
        public int currentItem;
        ImageView itemImage;
        TextView itemName;
        TextView itemShortDescription;
        RatingBar itemRating;

        public RemindViewHolder(View itemView){
            super(itemView);
//            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
//            itemName = (TextView)itemView.findViewById(R.id.item_name);
//            itemShortDescription = (TextView)itemView.findViewById(R.id.item_shortDescription);
//            itemRating = (RatingBar)itemView.findViewById(R.id.item_rating);

            view = itemView;
            view.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
//                    Intent intent = new Intent(v.getContext(), OfficeLongDescription.class);
//                    intent.putExtra("position", currentItem);
//                    startActivity(v.getContext(), intent, null);
                }
            });
        }

    }


}
