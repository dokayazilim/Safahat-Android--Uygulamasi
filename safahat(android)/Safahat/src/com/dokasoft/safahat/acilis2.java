package com.dokasoft.safahat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class acilis2 extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.main);
	Button button1=(Button)findViewById(R.id.button1);
	Button button2=(Button)findViewById(R.id.button2);
	Button button3=(Button)findViewById(R.id.button3);

button3.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
		startActivity(new Intent("com.dokasoft.safahat.GIRIS"));
			
		}
	});

	
	
	
	button2.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
		startActivity(new Intent("com.dokasoft.safahat.HAYATI"));
			
		}
	});
	
	
	
	
	button1.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
		startActivity(new Intent("com.dokasoft.safahat.ISTIKLAL"));
			
		}
	});
	}

}
