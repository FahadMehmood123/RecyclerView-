package com.fahadmehmood.recyclerview_191088;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    List<Random> studentList;
    Context context;

    public RecyclerViewAdapter(List<Random> studentList, Context context) {
        this.studentList = studentList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        Random student=studentList.get(position);
        holder.txtName.setText("Name :"+student.getName());
        holder.txtRollno.setText("RollNo :"+student.getRollno());
        holder.txtdep.setText("Depart :"+student.getDepartment());
        holder.txtsem.setText("Semester :"+student.getSemester());
        holder.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentList.remove(position);
                notifyItemRemoved(position);
                notifyItemRangeChanged(holder.getAdapterPosition(), studentList.size());
            }
        });

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txtName,txtRollno,txtdep,txtsem;
        Button btn1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtRollno = itemView.findViewById(R.id.txtRollno);
            txtdep = itemView.findViewById(R.id.Department);
            txtsem = itemView.findViewById(R.id.semester);
            btn1 = itemView.findViewById(R.id.button2);

        }
        @Override
        public void onClick(View v) {

        }



    }
}

