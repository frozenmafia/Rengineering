package o;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.wheelpicker.LoopView;
/* loaded from: classes5.dex */
public final class unregisterOnSharedPreferenceChangeListener extends GestureDetector.SimpleOnGestureListener {
    final LoopView values;

    public unregisterOnSharedPreferenceChangeListener(LoopView loopView) {
        this.values = loopView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.values.ah$a();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.values.values(f2);
        return true;
    }
}
