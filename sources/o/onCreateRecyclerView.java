package o;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* loaded from: classes7.dex */
public class onCreateRecyclerView implements View.OnTouchListener {
    private final int ah$a;
    private final Dialog toString;
    private final int valueOf;
    private final int values;

    public onCreateRecyclerView(Dialog dialog, Rect rect) {
        this.toString = dialog;
        this.ah$a = rect.left;
        this.valueOf = rect.top;
        this.values = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int top;
        View findViewById = view.findViewById(16908290);
        int left = this.ah$a + findViewById.getLeft();
        int width = findViewById.getWidth();
        if (new RectF(left, this.valueOf + findViewById.getTop(), width + left, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            float f = (-this.values) - 1;
            obtain.setLocation(f, f);
        }
        view.performClick();
        return this.toString.onTouchEvent(obtain);
    }
}
