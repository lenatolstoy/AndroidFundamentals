package android.example.com.hellorelative;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount;
    private TextView mCountShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCountShow = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Context ctxt = getApplicationContext();
        Toast toast = Toast.makeText(ctxt, getString(R.string.toast_message), Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mCountShow!=null)
            mCountShow.setText(Integer.toString(mCount));
    }
}
