package m.com.aop;

import android.util.Log;
import android.view.View;

public class MyListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Log.d(TestAspect.TAG, "我们可以在这里监听点击事件……");
    }
}
