package com.ben.accountapp2.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ben.accountapp2.R;


public class RegisterFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View root = inflater.inflate(R.layout.fragment_register, container, false);

        TextView go_login = root.findViewById(R.id.go_login);
        TextView go_forgotpassword = root.findViewById(R.id.go_forgotPassword);
        NavController controller = NavHostFragment.findNavController(this);
        go_login.setOnClickListener(v -> controller.navigate(R.id.action_registerFragment_to_loginFragment));
        go_forgotpassword.setOnClickListener(v -> controller.navigate(R.id.action_registerFragment_to_forgotPasswordFragment));


        return root;
    }
}