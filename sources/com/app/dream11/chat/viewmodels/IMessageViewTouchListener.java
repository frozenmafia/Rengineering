package com.app.dream11.chat.viewmodels;

import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import o.runAnimators;
/* loaded from: classes.dex */
public interface IMessageViewTouchListener {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static void onMessageSingleClicked(IMessageViewTouchListener iMessageViewTouchListener, MotionEvent motionEvent) {
            runAnimators.ag$a(iMessageViewTouchListener, "this");
            runAnimators.ag$a(motionEvent, NotificationCompat.CATEGORY_EVENT);
        }
    }

    void onMessageDoubleTapped(MotionEvent motionEvent);

    void onMessageLongPressed(MotionEvent motionEvent);

    void onMessageSingleClicked(MotionEvent motionEvent);
}
