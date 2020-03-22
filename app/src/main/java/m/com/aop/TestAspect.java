package m.com.aop;

import android.util.Log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestAspect {
    public static final String TAG = "TestAspect";

//    @Before("execution(* m.com.aspectj.MainActivity.test*(..))")
//    public void testAspectBefore(JoinPoint joinPoint) {
//        Log.e(TAG, joinPoint.getSignature().getName() + "-before ");
//    }
//
//    @After("execution(* m.com.aspectj.MainActivity.test*(..))")
//    public void testAspectAfter(JoinPoint joinPoint) {
//        Log.e(TAG, joinPoint.getSignature().getName() + "-after ");
//    }
//
//    @AfterReturning(value = "execution(* m.com.aspectj.MainActivity.testMethodReturning(..))", returning = "text")
//    public void testAspectAfterReturning(String text) {
//        Log.e(TAG, "-after returning = " + text);
//    }
//
//    @AfterReturning(value = "call(* m.com.aspectj.MainActivity.getCount(..))", returning = "num")
//    public void testAspectRun(int num) {
//        Log.e(TAG, "-run " + num);
//    }

    // getCount()方法内
    @Pointcut("withincode(* m.com.aspectj.MainActivity.testMethodReturning(..))")
    public void invoke2() {
    }

    // getCount()方法的时候
    @Pointcut("call(* m.com.aspectj.MainActivity.getCount(..))")
    public void invoke() {
        Log.e(TAG, "-getCount ");
    }
}
