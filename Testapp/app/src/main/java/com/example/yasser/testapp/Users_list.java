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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Yasser on 16/12/15.
 */
public class Users_list extends Fragment {
    LayoutInflater l;
    private ArrayList<User> USERS = new ArrayList<User>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_user_list, container, false);
        l = inflater;

        populatePosts();

        ListView listView = (ListView) rootView.findViewById(R.id.listview);
        ArrayAdapter<User> adapter = new UserAdapter();
        listView.setAdapter(adapter);

        return rootView;
    }

    private void populatePosts() {

        USERS.add(new User("Doola ", ""));
        USERS.add(new User("Karim ", ""));
        USERS.add(new User("Yasser ", ""));
    }


    public class UserAdapter extends ArrayAdapter<User> {

        public UserAdapter(){super(getActivity(), R.layout.list_user, USERS);}


        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {

            View postView = convertView;
            if (postView == null){
                postView = l.inflate(R.layout.list_user,parent, false);
            }

            User currentUser = USERS.get(position);
            final TextView name = (TextView) postView.findViewById(R.id.list_user_txt);
            name.setText(currentUser.getUser_name());

            ImageView post = (ImageView)postView.findViewById(R.id.list_user_img);
            //post.setImageDrawable(currentUser.getUser_img());

            Button submit = (Button) postView.findViewById(R.id.list_user_btn);
            submit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(), "Button was clicked for list item " + name.getText().toString(), Toast.LENGTH_SHORT).show();

                    Fragment fragment = new profile();
                    fragment.setArguments(null);
                    FragmentManager fragmentManager = getFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();
                }
            });
            return postView;

        }
    }
}
