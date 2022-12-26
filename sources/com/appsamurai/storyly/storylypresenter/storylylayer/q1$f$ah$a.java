package com.appsamurai.storyly.storylypresenter.storylylayer;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.appsamurai.storyly.storylypresenter.storylylayer.q1;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class q1$f$ah$a implements View.OnTouchListener {
    public final GestureDetector ah$a;
    public final /* synthetic */ q1.f toString;

    public q1$f$ah$a(q1.f fVar) {
        runAnimators.ag$a(fVar, "this$0");
        this.toString = fVar;
        this.ah$a = new GestureDetector(fVar.getContext(), new GestureDetector.SimpleOnGestureListener(this) { // from class: com.appsamurai.storyly.storylypresenter.storylylayer.q1$f$ah$a$ag$a
            public final /* synthetic */ q1$f$ah$a ag$a;

            {
                runAnimators.ag$a(this, "this$0");
                this.ag$a = this;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                runAnimators.ag$a(motionEvent, "e1");
                runAnimators.ag$a(motionEvent2, "e2");
                float y = motionEvent2.getY() - motionEvent.getY();
                if (Math.abs(motionEvent2.getX() - motionEvent.getX()) >= Math.abs(y) || Math.abs(y) <= 30.0f || y >= 0.0f) {
                    return true;
                }
                q1$f$ah$a q1_f_ah_a = this.ag$a;
                q1_f_ah_a.toString.ah$b.invoke().invoke(q1_f_ah_a.toString.ah$b.ak$a(), "SwipeUp");
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                q1$f$ah$a q1_f_ah_a = this.ag$a;
                q1_f_ah_a.toString.ah$b.invoke().invoke(q1_f_ah_a.toString.ah$b.ak$a(), "Click");
                return super.onSingleTapConfirmed(motionEvent);
            }
        });
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.ah$a.onTouchEvent(motionEvent);
        return true;
    }
}
