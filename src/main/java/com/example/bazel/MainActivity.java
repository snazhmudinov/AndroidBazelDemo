package com.example.bazel;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import common.calculator.IntCalculator;
import snazhmudinov.lib.bar.Bar;

/**
 * Main class for the Bazel Android "Hello, World" app.
 */
public class MainActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.v("Bazel", "Hello, Android");

		setContentView(R.layout.activity_main);

		Button clickMeButton = findViewById(R.id.clickMeButton);
		TextView helloBazelTextView = findViewById(R.id.helloBazelTextView);

		Greeter greeter = new Greeter();
		Foo foo = new Foo();
		Bar bar = new Bar();
		IntCalculator calculator = new IntCalculator();
		final int result = calculator.add(1, 3);

		// Bazel supports Java 8 language features like lambdas!
		final StringBuilder sb = new StringBuilder();
		sb.append(greeter.sayHello());
		sb.append(" ");
		sb.append(bar.getBarAsString());
		
		clickMeButton.setOnClickListener(v -> helloBazelTextView.setText(sb.toString()));
	}
}
