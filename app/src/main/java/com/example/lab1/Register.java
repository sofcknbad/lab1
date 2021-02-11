package com.example.lab1;

import androidx.fragment.app.Fragment;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Register extends Fragment {
	SQLiteDatabase db;


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_register, container, false);
	}

	@Override
	public void onStart() {
		super.onStart();

		db = (new DBHelper(getActivity())).getWritableDatabase();
	}

	@Override
	public void onStop() {
		super.onStop();

		db.close();
	}

}