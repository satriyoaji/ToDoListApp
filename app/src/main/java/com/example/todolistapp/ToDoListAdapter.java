package com.example.todolistapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ToDoListAdapter extends RecyclerView.Adapter<ToDoListAdapter.MyViewHolder> {

    Context context;
    ArrayList<ToDoList> toDoLists;

    public ToDoListAdapter(Context context, ArrayList<ToDoList> toDoLists) {
        this.context = context;
        this.toDoLists = toDoLists;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        myViewHolder.titledoes.setText(toDoLists.get(position).getTitledoes());
        myViewHolder.descdoes.setText(toDoLists.get(position).getDescdoes());
        myViewHolder.prioritydoes.setText(toDoLists.get(position).getPrioritydoes());
    }

    @Override
    public int getItemCount() {
        return toDoLists.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titledoes, descdoes, prioritydoes;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            titledoes = (TextView) itemView.findViewById(R.id.titledoes);
            descdoes = (TextView) itemView.findViewById(R.id.descdoes);
            prioritydoes = (TextView) itemView.findViewById(R.id.prioritydoes);
        }
    }

}
