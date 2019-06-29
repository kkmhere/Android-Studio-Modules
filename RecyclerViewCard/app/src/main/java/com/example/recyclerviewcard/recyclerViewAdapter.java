package com.example.recyclerviewcard;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.ViewHolder> {

    private List<Person1> persons;
    private Context context;

    public recyclerViewAdapter(List<Person1> persons, Context context)
    {
        this.persons=persons;
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_list_item,parent,false);
        return new ViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Person1 person1 =  persons.get(position);
        holder.txtname.setText(person1.getName());
        holder.txtJob.setText(person1.getJob());

    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {   public TextView txtname;
        public TextView txtJob;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtname=itemView.findViewById(R.id.txtName);
            txtJob=itemView.findViewById(R.id.txtJob);
        }
    }
}
