package com.example.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityTipping extends Activity {
	//
	public EditText etPrice ;
	public TextView tvTaxed ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity_tipping);
		
		etPrice = (EditText) findViewById(R.id.etPrice);
		tvTaxed = (TextView) findViewById(R.id.tvTaxed);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity_tipping, menu);
		return true;
	}
	
	public void onTip(View v) {
		// Get tax percentage
		double tax = 0.00, price ;
		
		tax = Float.valueOf( ((String) v.getTag()) ) ;
		
		// Get Value
		if ( !(etPrice.getText().toString().isEmpty()) ) {
			price = Float.valueOf( etPrice.getText().toString() );
		
		// Output to text view
		String outText = String.format("Tip is:\t$%.2f", price * tax) ;
		tvTaxed.setText(outText);
		}
		else {
			tvTaxed.setText("Tip is:");
		}
	}

}
