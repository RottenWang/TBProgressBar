package progress.drwang.tbprogressbaar.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import progress.drwang.tbprogressbaar.R;
import progress.drwang.tbprogressbaar.view.TBProgressView;

public class MainActivity extends AppCompatActivity {

    private TBProgressView tbpv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tbpv = (TBProgressView) findViewById(R.id.tbpv);
    }

    @Override
    protected void onResume() {
        super.onResume();
        tbpv.startShowAnimate();
    }

    @Override
    protected void onPause() {
        super.onPause();
        tbpv.stopShowAnimate();
    }
}
