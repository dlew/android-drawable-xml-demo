package com.idunnolol.drawables.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class DrawableXmlDemoActivity extends Activity {

	private LayoutInflater mInflater;

	private float mDensity;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		mInflater = getLayoutInflater();
		mDensity = getResources().getDisplayMetrics().density;

		setContentView(R.layout.main);

		ViewGroup container = (ViewGroup) findViewById(R.id.container);

		// Add all the demos
		addDrawable(container, "shape_rectangle.xml", R.drawable.shape_rectangle, 50, 100);
		addDrawable(container, "shape_oval.xml", R.drawable.shape_oval, 50, 100);
		addDrawable(container, "shape_ring.xml", R.drawable.shape_ring, 75, 75);
		addDrawable(container, "shape_line.xml", R.drawable.shape_line, 25, 100);
		addDrawable(container, "shape_gradient.xml", R.drawable.shape_gradient, 100, 100);
		addDrawable(container, "shape_gradient_radial.xml", R.drawable.shape_gradient_radial, 100, 100);
		addDrawable(container, "shape_gradient_sweep.xml", R.drawable.shape_gradient_sweep, 100, 100);
		addDrawable(container, "shape_stroke.xml", R.drawable.shape_stroke, 75, 100);
		addDrawable(container, "shape_corners.xml", R.drawable.shape_corners, 75, 100);
		addDrawable(container, "layer_list.xml", R.drawable.layer_list, 100, 100);
		addDrawable(container, "bitmap_tile.xml", R.drawable.bitmap_tile, 110, 190);
	}

	public void addDrawable(ViewGroup container, String label, int resId, int heightDp, int widthDp) {
		View example = mInflater.inflate(R.layout.snippet_drawable, null);
		TextView tv = (TextView) example.findViewById(R.id.text);
		tv.setText(label);
		View v = example.findViewById(R.id.drawable);
		v.setBackgroundResource(resId);
		v.setLayoutParams(new LayoutParams((int) (widthDp * mDensity), (int) (heightDp * mDensity)));

		container.addView(example);
	}
}