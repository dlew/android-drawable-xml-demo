package com.idunnolol.drawables.demo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.menu);

		final Context context = this;
		((Button) findViewById(R.id.drawable_demo)).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(context, DrawableXmlDemoActivity.class);
				startActivity(intent);
			}
		});

		((Button) findViewById(R.id.button_demo)).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(context, ButtonDemoActivity.class);
				startActivity(intent);
			}
		});
	}
}