package com.app.dream11.spotlight.interfaces;

import android.view.MotionEvent;
import com.app.dream11.spotlight.ShowcaseView;
/* loaded from: classes3.dex */
public interface OnShowcaseEventListener {
    public static final OnShowcaseEventListener NONE = new OnShowcaseEventListener() { // from class: com.app.dream11.spotlight.interfaces.OnShowcaseEventListener.1
        @Override // com.app.dream11.spotlight.interfaces.OnShowcaseEventListener
        public void onShowcaseViewDidHide(ShowcaseView showcaseView) {
        }

        @Override // com.app.dream11.spotlight.interfaces.OnShowcaseEventListener
        public void onShowcaseViewHide(ShowcaseView showcaseView) {
        }

        @Override // com.app.dream11.spotlight.interfaces.OnShowcaseEventListener
        public void onShowcaseViewShow(ShowcaseView showcaseView) {
        }

        @Override // com.app.dream11.spotlight.interfaces.OnShowcaseEventListener
        public void onShowcaseViewTouchBlocked(MotionEvent motionEvent) {
        }
    };

    void onShowcaseViewDidHide(ShowcaseView showcaseView);

    void onShowcaseViewHide(ShowcaseView showcaseView);

    void onShowcaseViewShow(ShowcaseView showcaseView);

    void onShowcaseViewTouchBlocked(MotionEvent motionEvent);
}
