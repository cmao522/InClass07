/*
Assignment 07
InClass07.zip
Jessica Lu and Carrie Mao
Group 15
 */

package com.example.myprofile;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements ProfileFragment.OnFragmentInteractionListener, DisplayFragment.OnFragmentInteractionListener, SelectAvatarFragment.OnFragmentInteractionListener{
    @Override
    protected void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.contentView, new ProfileFragment())
                .commit();
    }


    @Override
    public void onFragmentInteraction(Uri uri) {
        
    }
}


