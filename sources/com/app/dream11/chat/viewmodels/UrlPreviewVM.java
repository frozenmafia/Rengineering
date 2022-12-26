package com.app.dream11.chat.viewmodels;

import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.app.dream11.chat.viewmodels.UrlPreviewVM;
import o.Styleable;
import o.measureChildView;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class UrlPreviewVM {
    private final Styleable.ArcMotion<setAnimationMatrix> onClickListener;
    private final measureChildView urlPreview;
    private final URLPreviewClickListener urlPreviewCLickListener;
    private final IMessageViewTouchListener viewLongPressListener;

    /* loaded from: classes.dex */
    public interface URLPreviewClickListener {
        void onUrlPreviewClicked(String str, UrlPreviewVM urlPreviewVM);

        void onUrlPreviewDoubleTapped(MotionEvent motionEvent);

        void onUrlPreviewLongClick(MotionEvent motionEvent);
    }

    public UrlPreviewVM(measureChildView measurechildview, URLPreviewClickListener uRLPreviewClickListener) {
        runAnimators.ag$a(measurechildview, "urlPreview");
        this.urlPreview = measurechildview;
        this.urlPreviewCLickListener = uRLPreviewClickListener;
        this.onClickListener = new UrlPreviewVM$onClickListener$1(this);
        this.viewLongPressListener = new IMessageViewTouchListener() { // from class: com.app.dream11.chat.viewmodels.UrlPreviewVM$viewLongPressListener$1
            @Override // com.app.dream11.chat.viewmodels.IMessageViewTouchListener
            public void onMessageLongPressed(MotionEvent motionEvent) {
                UrlPreviewVM.URLPreviewClickListener uRLPreviewClickListener2;
                runAnimators.ag$a(motionEvent, NotificationCompat.CATEGORY_EVENT);
                uRLPreviewClickListener2 = UrlPreviewVM.this.urlPreviewCLickListener;
                if (uRLPreviewClickListener2 == null) {
                    return;
                }
                uRLPreviewClickListener2.onUrlPreviewLongClick(motionEvent);
            }

            @Override // com.app.dream11.chat.viewmodels.IMessageViewTouchListener
            public void onMessageDoubleTapped(MotionEvent motionEvent) {
                UrlPreviewVM.URLPreviewClickListener uRLPreviewClickListener2;
                runAnimators.ag$a(motionEvent, NotificationCompat.CATEGORY_EVENT);
                uRLPreviewClickListener2 = UrlPreviewVM.this.urlPreviewCLickListener;
                if (uRLPreviewClickListener2 == null) {
                    return;
                }
                uRLPreviewClickListener2.onUrlPreviewDoubleTapped(motionEvent);
            }

            @Override // com.app.dream11.chat.viewmodels.IMessageViewTouchListener
            public void onMessageSingleClicked(MotionEvent motionEvent) {
                UrlPreviewVM.URLPreviewClickListener uRLPreviewClickListener2;
                runAnimators.ag$a(motionEvent, NotificationCompat.CATEGORY_EVENT);
                String HaptikSDK$c = UrlPreviewVM.this.getUrlPreview().HaptikSDK$c();
                if (HaptikSDK$c == null) {
                    return;
                }
                UrlPreviewVM urlPreviewVM = UrlPreviewVM.this;
                uRLPreviewClickListener2 = urlPreviewVM.urlPreviewCLickListener;
                if (uRLPreviewClickListener2 == null) {
                    return;
                }
                uRLPreviewClickListener2.onUrlPreviewClicked(HaptikSDK$c, urlPreviewVM);
            }
        };
    }

    public final measureChildView getUrlPreview() {
        return this.urlPreview;
    }

    public final String getTitle() {
        String ah$b = this.urlPreview.ah$b();
        return ah$b == null ? "" : ah$b;
    }

    public final String getImage() {
        String valueOf = this.urlPreview.valueOf();
        return valueOf == null ? getFavIcon() : valueOf;
    }

    public final String getFavIcon() {
        return this.urlPreview.values();
    }

    public final String getDescription() {
        return this.urlPreview.ag$a();
    }

    public final String getHost() {
        return this.urlPreview.ah$a();
    }

    public final Styleable.ArcMotion<setAnimationMatrix> getOnClickListener() {
        return this.onClickListener;
    }

    public final IMessageViewTouchListener getViewLongPressListener() {
        return this.viewLongPressListener;
    }
}
