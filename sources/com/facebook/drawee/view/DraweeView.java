package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import o.Fragment;
import o.dispatchOnFragmentDestroyed;
import o.dispatchOnFragmentPreAttached;
import o.dispatchOnFragmentPreCreated;
import o.dispatchOnFragmentPreCreated$ah$a;
import o.dispatchOnFragmentResumed;
/* loaded from: classes4.dex */
public class DraweeView<DH extends dispatchOnFragmentPreAttached> extends ImageView {
    private static boolean sGlobalLegacyVisibilityHandlingEnabled = false;
    private float mAspectRatio;
    private dispatchOnFragmentResumed<DH> mDraweeHolder;
    private boolean mInitialised;
    private boolean mLegacyVisibilityHandlingEnabled;
    private final dispatchOnFragmentPreCreated$ah$a mMeasureSpec;

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        sGlobalLegacyVisibilityHandlingEnabled = z;
    }

    public DraweeView(Context context) {
        super(context);
        this.mMeasureSpec = new dispatchOnFragmentPreCreated$ah$a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }

    public DraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMeasureSpec = new dispatchOnFragmentPreCreated$ah$a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMeasureSpec = new dispatchOnFragmentPreCreated$ah$a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mMeasureSpec = new dispatchOnFragmentPreCreated$ah$a();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }

    private void init(Context context) {
        boolean isTracing;
        try {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection("DraweeView#init");
            }
            if (this.mInitialised) {
                if (isTracing) {
                    return;
                }
                return;
            }
            boolean z = true;
            this.mInitialised = true;
            this.mDraweeHolder = dispatchOnFragmentResumed.values(null, context);
            if (Build.VERSION.SDK_INT >= 21) {
                ColorStateList imageTintList = getImageTintList();
                if (imageTintList == null) {
                    if (FrescoSystrace.isTracing()) {
                        FrescoSystrace.endSection();
                        return;
                    }
                    return;
                }
                setColorFilter(imageTintList.getDefaultColor());
            }
            if (!sGlobalLegacyVisibilityHandlingEnabled || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.mLegacyVisibilityHandlingEnabled = z;
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        } finally {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
    }

    public void setHierarchy(DH dh) {
        this.mDraweeHolder.ah$a((dispatchOnFragmentResumed<DH>) dh);
        super.setImageDrawable(this.mDraweeHolder.ag$a());
    }

    public DH getHierarchy() {
        return this.mDraweeHolder.values();
    }

    public boolean hasHierarchy() {
        return this.mDraweeHolder.ah$b();
    }

    public Drawable getTopLevelDrawable() {
        return this.mDraweeHolder.ag$a();
    }

    public void setController(dispatchOnFragmentDestroyed dispatchonfragmentdestroyed) {
        this.mDraweeHolder.values(dispatchonfragmentdestroyed);
        super.setImageDrawable(this.mDraweeHolder.ag$a());
    }

    public dispatchOnFragmentDestroyed getController() {
        return this.mDraweeHolder.ah$a();
    }

    public boolean hasController() {
        return this.mDraweeHolder.ah$a() != null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    protected void onAttach() {
        doAttach();
    }

    protected void onDetach() {
        doDetach();
    }

    protected void doAttach() {
        this.mDraweeHolder.HaptikSDK$a();
    }

    protected void doDetach() {
        this.mDraweeHolder.HaptikSDK$b();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mDraweeHolder.valueOf(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        init(getContext());
        this.mDraweeHolder.values((dispatchOnFragmentDestroyed) null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        init(getContext());
        this.mDraweeHolder.values((dispatchOnFragmentDestroyed) null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        init(getContext());
        this.mDraweeHolder.values((dispatchOnFragmentDestroyed) null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        init(getContext());
        this.mDraweeHolder.values((dispatchOnFragmentDestroyed) null);
        super.setImageURI(uri);
    }

    public void setAspectRatio(float f) {
        if (f == this.mAspectRatio) {
            return;
        }
        this.mAspectRatio = f;
        requestLayout();
    }

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.mLegacyVisibilityHandlingEnabled = z;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        this.mMeasureSpec.values = i;
        this.mMeasureSpec.valueOf = i2;
        dispatchOnFragmentPreCreated.ag$a(this.mMeasureSpec, this.mAspectRatio, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        super.onMeasure(this.mMeasureSpec.values, this.mMeasureSpec.valueOf);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        maybeOverrideVisibilityHandling();
    }

    private void maybeOverrideVisibilityHandling() {
        Drawable drawable;
        if (!this.mLegacyVisibilityHandlingEnabled || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    @Override // android.view.View
    public String toString() {
        Fragment.AnonymousClass7.values valueOf = Fragment.AnonymousClass7.valueOf(this);
        dispatchOnFragmentResumed<DH> dispatchonfragmentresumed = this.mDraweeHolder;
        return valueOf.ah$a("holder", dispatchonfragmentresumed != null ? dispatchonfragmentresumed.toString() : "<no holder set>").toString();
    }
}
