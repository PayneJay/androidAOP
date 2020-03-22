package m.com.aop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testMethod();
        testMethodReturning();

        findViewById(R.id.tv_test1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TestAspect.TAG, "我是普通点击");
            }
        });
        findViewById(R.id.tv_test2).setOnClickListener(new MyListener());
    }

    private void testMethod() {
        getCount();
    }

    private String testMethodReturning() {
        return "where amazing happening..." + getCount();
    }

    private int getCount() {
        Log.e(TestAspect.TAG, "method_getCount");
        return 100;
    }
}
