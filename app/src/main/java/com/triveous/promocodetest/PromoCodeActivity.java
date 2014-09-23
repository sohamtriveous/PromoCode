package com.triveous.promocodetest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.triveous.promocode.OnPromocodeChecked;
import com.triveous.promocode.PromoCode;
import com.triveous.promocode.model.Code;


public class PromoCodeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo_code);

        PromoCode.validate("ABCasdasdD", new OnPromocodeChecked() {
            @Override
            public void onPromocodeSuccess(Code code) {
                Toast.makeText(PromoCodeActivity.this, "Code is " + code.getCouponCode(), Toast.LENGTH_SHORT).show();
                // code is correct
                // now check time validity
                // if valid, then check features and activate those features
                //
            }

            @Override
            public void onPromocodeFailure(String error) {
                Toast.makeText(PromoCodeActivity.this, "Error is " + error, Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.promo_code, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
