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
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Yasser on 16/12/15.
 */
public class Comments extends Fragment{
//
//LayoutInflater l;
//private ArrayList<Post> POSTS = new ArrayList<Post>();
//@Nullable
//@Override
//public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//
//        View rootView = inflater.inflate(R.layout.fragment_timeline, container, false);
//        l = inflater;
//
//        populatePosts();
//
//        ListView listView = (ListView) rootView.findViewById(R.id.listview);
//        ArrayAdapter<Post> adapter = new PostAdapter();
//        listView.setAdapter(adapter);
//
//
//        return rootView;
//        }
//
//private void populatePosts() {
//        ArrayList<String> x= new ArrayList<String>();
//        x.add("hey");
//        x.add("hola");
//        POSTS.add(new Post("HII","Rana ",x));
//        x.clear();
//        x.add("bye");
//        POSTS.add(new Post("HII", "Rana ", x));
//        x.clear();
//        x.add("meh");
//        POSTS.add(new Post("HII","Rana ",x));
//        }
//
//
//public class PostAdapter extends ArrayAdapter<Post> {
//
//    public PostAdapter(){super(getActivity(), R.layout.list_item, POSTS);}
//
//
//    @Override
//    public View getView(final int position, View convertView, ViewGroup parent) {
//
//        View postView = convertView;
//        if (postView == null){
//            postView = l.inflate(R.layout.list_item,parent, false);
//        }
//
//        Post currentPost = POSTS.get(position);
//        TextView name = (TextView) postView.findViewById(R.id.list_item_name);
//        name.setText(currentPost.getUser_name());
//
//        TextView post = (TextView)postView.findViewById(R.id.list_item_text);
//        post.setText(currentPost.getPost());
//
//        Button comments = (Button) postView.findViewById(R.id.button5);
//        comments.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Fragment fragment = new Comments();
//                fragment.setArguments(null);
//                FragmentManager fragmentManager = getFragmentManager();
//                fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
//            }
//        });
//
//
//        final EditText comment = (EditText) postView.findViewById(R.id.list_item_edit);
//        final Button submit = (Button) postView.findViewById(R.id.list_item_btn);
//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getContext(), "Button was clicked for list item " + comment.getText().toString(), Toast.LENGTH_SHORT).show();
//            }
//        });
//        return postView;
//
//    }
}
