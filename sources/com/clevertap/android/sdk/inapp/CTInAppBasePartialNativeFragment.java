package com.clevertap.android.sdk.inapp;

import android.graphics.Color;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
/* loaded from: classes4.dex */
public abstract class CTInAppBasePartialNativeFragment extends CTInAppBasePartialFragment implements View.OnTouchListener, View.OnLongClickListener {
    final GestureDetector ah$b = new GestureDetector(this.valueOf, new values());
    View invoke;

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return true;
    }

    /* loaded from: classes4.dex */
    class values extends GestureDetector.SimpleOnGestureListener {
        private final int toString;
        private final int valueOf;

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        private values() {
            this.valueOf = 120;
            this.toString = 200;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent.getX() - motionEvent2.getX() > 120.0f && Math.abs(f) > 200.0f) {
                return ah$a(motionEvent, motionEvent2, false);
            }
            if (motionEvent2.getX() - motionEvent.getX() <= 120.0f || Math.abs(f) <= 200.0f) {
                return false;
            }
            return ah$a(motionEvent, motionEvent2, true);
        }

        private boolean ah$a(MotionEvent motionEvent, MotionEvent motionEvent2, boolean z) {
            TranslateAnimation translateAnimation;
            AnimationSet animationSet = new AnimationSet(true);
            if (z) {
                translateAnimation = new TranslateAnimation(0.0f, CTInAppBasePartialNativeFragment.this.valueOf(50), 0.0f, 0.0f);
            } else {
                translateAnimation = new TranslateAnimation(0.0f, -CTInAppBasePartialNativeFragment.this.valueOf(50), 0.0f, 0.0f);
            }
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
            animationSet.setDuration(300L);
            animationSet.setFillAfter(true);
            animationSet.setFillEnabled(true);
            animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: com.clevertap.android.sdk.inapp.CTInAppBasePartialNativeFragment.values.4
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    CTInAppBasePartialNativeFragment.this.ah$a(null);
                }
            });
            CTInAppBasePartialNativeFragment.this.invoke.startAnimation(animationSet);
            return true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.ah$b.onTouchEvent(motionEvent) || motionEvent.getAction() == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(Button button, Button button2) {
        button2.setVisibility(8);
        button.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 2.0f));
        button2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(Button button, CTInAppNotificationButton cTInAppNotificationButton, int i) {
        if (cTInAppNotificationButton != null) {
            button.setTag(Integer.valueOf(i));
            button.setVisibility(0);
            button.setText(cTInAppNotificationButton.HaptikSDK$c());
            button.setTextColor(Color.parseColor(cTInAppNotificationButton.ah$b()));
            button.setBackgroundColor(Color.parseColor(cTInAppNotificationButton.ah$a()));
            button.setOnClickListener(new CTInAppBaseFragment$ah$a(this));
            return;
        }
        button.setVisibility(8);
    }
}
