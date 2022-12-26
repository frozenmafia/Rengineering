package com.app.dream11.contest.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class PersistentBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        runAnimators.ag$a(coordinatorLayout, "parent");
        runAnimators.ag$a(v, "child");
        runAnimators.ag$a(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (motionEvent.getAction() == 0 && ag$a() == 3) {
            Rect rect = new Rect();
            v.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                ah$b(4);
            }
        }
        return super.onInterceptTouchEvent(coordinatorLayout, v, motionEvent);
    }
}
