package com.spur_u.android.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.spur_u.android.Entity.FinishedTask;
import com.spur_u.android.R;

import java.util.List;

public class FinishedTaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {
    private List<FinishedTask> myTaskList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView taskName;
        TextView score;

    public ViewHolder(View view) {
        super(view);
        taskName = (TextView) view.findViewById(R.id.textView_taskName);
        score = (TextView) view.findViewById(R.id.textView_score);

        }
    }

    public FinishedTaskAdapter(List<FinishedTask> tasks) {
        myTaskList = tasks;
    }

    @NonNull
    @Override
    public TaskAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.single_task_list_item, viewGroup, false);
        TaskAdapter.ViewHolder holder = new TaskAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull TaskAdapter.ViewHolder viewHolder, int i) {
        FinishedTask task = myTaskList.get(i);
        viewHolder.score.setText(String.valueOf(task.getScore()));
        viewHolder.taskName.setText(task.getName());
    }

    @Override
    public int getItemCount() {
        return myTaskList.size();
    }
}