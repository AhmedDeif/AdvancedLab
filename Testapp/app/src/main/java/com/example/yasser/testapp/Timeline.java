package com.example.yasser.testapp;

import android.app.Fragment;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Timeline extends Fragment{

    LayoutInflater l;
    private ArrayList<Post> POSTS = new ArrayList<Post>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_timeline, container, false);
        l = inflater;

        populatePosts();

        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        ArrayAdapter<Post> adapter = new PostAdapter();
        listView.setAdapter(adapter);

        return rootView;
    }

    private void populatePosts() {

        POSTS.add(new Post("HII","Rana "));
        POSTS.add(new Post("HII","Rana "));
        POSTS.add(new Post("HII","Rana "));
    }


    public class PostAdapter extends ArrayAdapter<Post> {

        public PostAdapter(){super(getActivity(), R.layout.list_item, POSTS);}


        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            View postView = convertView;
            if (postView == null){
                postView = l.inflate(R.layout.list_item,parent, false);
            }

            Post currentPost = POSTS.get(position);
            TextView name = (TextView) postView.findViewById(R.id.list_item_name);
            name.setText(currentPost.getUser_name());

            TextView post = (TextView)postView.findViewById(R.id.list_item_text);
            post.setText(currentPost.getPost());

            final EditText comment = (EditText) postView.findViewById(R.id.list_item_edit);
            final Button submit = (Button) postView.findViewById(R.id.list_item_btn);
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(), "Button was clicked for list item " + comment.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });
            return postView;

        }
    }
}