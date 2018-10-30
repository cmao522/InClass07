package com.example.myprofile;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class SelectAvatarFragment extends Fragment implements View.OnClickListener{

    private OnFragmentInteractionListener mListener;

    public SelectAvatarFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_select_avatar, container, false);
        view.findViewById(R.id.femaleOneID).setOnClickListener(this);
        view.findViewById(R.id.femaleTwoID).setOnClickListener(this);
        view.findViewById(R.id.femaleThreeID).setOnClickListener(this);
        view.findViewById(R.id.maleOneID).setOnClickListener(this);
        view.findViewById(R.id.maleTwoID).setOnClickListener(this);
        view.findViewById(R.id.maleThreeID).setOnClickListener(this);
        return view;

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + "OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.femaleOneID:
                mListener.setIconId(R.drawable.avatar_f_1);
                break;
            case R.id.femaleTwoID:
                mListener.setIconId(R.drawable.avatar_f_2);
                break;
            case R.id.femaleThreeID:
                mListener.setIconId(R.drawable.avatar_f_3);
                break;
            case R.id.maleOneID:
                mListener.setIconId(R.drawable.avatar_m_1);
                break;
            case R.id.maleTwoID:
                mListener.setIconId(R.drawable.avatar_m_2);
                break;
            case R.id.maleThreeID:
                mListener.setIconId(R.drawable.avatar_m_3);
                break;
        }

        getActivity().getSupportFragmentManager().popBackStack();

    }

    public interface OnFragmentInteractionListener {
        void setIconId(int iconId);
    }


}
