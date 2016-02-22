package com.bignerdranch.android.criminalintent;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import java.io.File;

public class ImageEnlarge extends DialogFragment {

    private static final String ARG_IMAGE = "image";
    private ImageView mImageView;

    public static ImageEnlarge newInstance(File image) {
        Bundle args = new Bundle();
        args.putSerializable(ARG_IMAGE, image);

        ImageEnlarge fragment = new ImageEnlarge();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        super.onCreateDialog(savedInstanceState);

        File image = (File) getArguments().getSerializable(ARG_IMAGE);
        View v = LayoutInflater.from(getActivity()).inflate(R.layout.image_enlarge, null);
        mImageView = (ImageView) v.findViewById(R.id.crime_large_pic);

        Bitmap bitmapImage = PictureUtils.getScaledBitmap(image.getPath(), getActivity());
        mImageView.setImageBitmap(bitmapImage);

        return new AlertDialog.Builder(getActivity()).setView(mImageView).create();
    }
}
