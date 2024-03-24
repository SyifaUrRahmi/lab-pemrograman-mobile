package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {

    private final ArrayList<Student> students;

    private ClickListener clickListener;

    public StudentAdapter(ArrayList<Student> students) {
        this.students = students;
    }

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public StudentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_student, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentAdapter.ViewHolder holder, int position) {
        Student student = students.get(position);
        holder.setData(student);
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView tvName;
        private final TextView tvUniv;
        private final ImageView ivImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvUniv = itemView.findViewById(R.id.tv_univ);
            ivImage = itemView.findViewById(R.id.iv_image);
        }

        public void setData(Student student) {
            tvName.setText(student.getName());
            tvUniv.setText(student.getUniversity());
            ivImage.setImageResource(student.getImage());
            itemView.setOnClickListener(view -> {
                clickListener.onItemClicked(student);
            });
        }
    }
    interface ClickListener {
        void onItemClicked(Student student);
    }
}
