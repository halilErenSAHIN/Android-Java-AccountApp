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


public class LoginFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_login, container, false);

        TextView go_register = root.findViewById(R.id.btnRegister);
        TextView go_forgotpassword = root.findViewById(R.id.btnForgotPassword);


        NavController controller = NavHostFragment.findNavController(this);
        go_register.setOnClickListener(v -> controller.navigate(R.id.action_loginFragment_to_registerFragment));
        go_forgotpassword.setOnClickListener(v-> controller.navigate(R.id.action_loginFragment_to_forgotPasswordFragment));


        return root;
    }
}