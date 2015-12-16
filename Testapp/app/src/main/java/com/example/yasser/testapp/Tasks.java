package com.example.yasser.testapp;


import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.yasser.testapp.model.Task;

import java.util.ArrayList;

public class Tasks extends Fragment {

    LayoutInflater l;
    private ArrayList<task_item> TASKS = new ArrayList<task_item>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_tasks, container, false);
        l = inflater;

        populatePosts();

        ListView listView = (ListView) rootView.findViewById(R.id.listView2);
        ArrayAdapter<task_item> adapter = new TaskAdapter();
        listView.setAdapter(adapter);

        return rootView;
    }

    private void populatePosts() {

        TASKS.add(new task_item("Kill ourselves ", "","with a gun","Yasser"));
        TASKS.add(new task_item("Save ourselves ", "","with a bonus","Doola"));
        TASKS.add(new task_item("meh ", "","...","Karim"));
    }


    public class TaskAdapter extends ArrayAdapter<task_item> {

        public TaskAdapter(){super(getActivity(), R.layout.task_item, TASKS);}


        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            View postView = convertView;
            if (postView == null){
                postView = l.inflate(R.layout.task_item,parent, false);
            }

            task_item currentTask = TASKS.get(position);

            final TextView name = (TextView) postView.findViewById(R.id.task_item_title);
            name.setText(currentTask.getTitle());

            ImageView post = (ImageView)postView.findViewById(R.id.task_item_img);
            //post.setImageDrawable(currentUser.getUser_img());

            TextView desc = (TextView) postView.findViewById(R.id.task_item_desc);
            desc.setText(currentTask.getDesc());

            TextView assigner = (TextView) postView.findViewById(R.id.task_item_assigner);
            assigner.setText(currentTask.getAssigner());

            return postView;

        }
    }

}
