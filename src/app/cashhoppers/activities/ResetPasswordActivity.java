package app.cashhoppers.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class ResetPasswordActivity extends Activity {
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.reset_pass_activity);
	    }


	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.home_page, menu);
	        return true;
	    }
	    
}
