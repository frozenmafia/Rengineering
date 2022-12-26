package o;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
/* loaded from: classes6.dex */
public final class applyAppSystemUiTheme extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, SplashScreen$Impl$setKeepOnScreenCondition$1$ah$a {
    private final GestureDetector ah$a;
    private final float toString;
    private final applyAppSystemUiTheme$ah$a valueOf;
    private final PointF ag$a = new PointF();
    private final PointF values = new PointF();
    private volatile float HaptikSDK$a = 3.1415927f;

    public applyAppSystemUiTheme(Context context, applyAppSystemUiTheme$ah$a applyappsystemuitheme_ah_a, float f) {
        this.valueOf = applyappsystemuitheme_ah_a;
        this.toString = f;
        this.ah$a = new GestureDetector(context, this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.ah$a.onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.ag$a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.ag$a.x) / this.toString;
        float y = (motionEvent2.getY() - this.ag$a.y) / this.toString;
        this.ag$a.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.HaptikSDK$a;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        this.values.x -= (cos * x) - (sin * y);
        this.values.y += (sin * x) + (cos * y);
        PointF pointF = this.values;
        pointF.y = Math.max(-45.0f, Math.min(45.0f, pointF.y));
        this.valueOf.toString(this.values);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.valueOf.toString(motionEvent);
    }

    @Override // o.SplashScreen$Impl$setKeepOnScreenCondition$1$ah$a
    public void toString(float[] fArr, float f) {
        this.HaptikSDK$a = -f;
    }
}
