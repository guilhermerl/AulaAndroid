package com.example.projeto1;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.sax.TextElementListener;
import android.view.Menu;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Message Dialog
       EditText edtValor1 = (EditText) findViewById(R.id.edtValor1);
       EditText edtValor2 = (EditText) findViewById(R.id.editValor2);
       
       String iValor1 = edtValor1.getText().toString();
       String iValor2 = edtValor2.getText().toString();
       
       new AlertDialog.Builder(this).setTitle("Alerta").
       setMessage("teste").
       setNeutralButton("Olá mundo", new DialogInterface.OnClickListener() {
		
		@Override
		public void onClick(DialogInterface dialog, int which) {
			// TODO Auto-generated method stub
			Toast.makeText(MainActivity.this, "Voce está saindo!", Toast.LENGTH_SHORT).show();
		}
 
	
	}).show();
    
       
  
       
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
