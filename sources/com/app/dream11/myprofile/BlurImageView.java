package com.app.dream11.myprofile;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.app.dream11Pro.R;
import com.apxor.androidsdk.core.ce.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AnyRes;
import o.createPopup;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class BlurImageView extends FrameLayout {
    private Drawable ag$a;
    public Map<Integer, View> ah$a;
    private final createPopup.valueOf<Bitmap> values;

    public View ah$a(int i) {
        Map<Integer, View> map = this.ah$a;
        View view = map.get(Integer.valueOf(i));
        if (view == null) {
            View findViewById = findViewById(i);
            if (findViewById == null) {
                return null;
            }
            map.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }
        return view;
    }

    public final void setErrorImageDrawable(Drawable drawable) {
        this.ag$a = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurImageView(Context context) {
        super(context);
        runAnimators.ag$a(context, "context");
        this.ah$a = new LinkedHashMap();
        this.values = new values();
        addView(LayoutInflater.from(getContext()).inflate(R.layout.res_0x7f0d0470, (ViewGroup) this, false));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.ah$a = new LinkedHashMap();
        this.values = new values();
        addView(LayoutInflater.from(getContext()).inflate(R.layout.res_0x7f0d0470, (ViewGroup) this, false));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(attributeSet, Constants.META_ATTRIBUTES);
        this.ah$a = new LinkedHashMap();
        this.values = new values();
        addView(LayoutInflater.from(getContext()).inflate(R.layout.res_0x7f0d0470, (ViewGroup) this, false));
    }

    /* loaded from: classes6.dex */
    public static final class values implements createPopup.valueOf<Bitmap> {
        values() {
        }

        @Override // o.createPopup.valueOf
        public void onDrawableLoadFailed() {
            BlurImageView.this.ah$a();
        }

        @Override // o.createPopup.valueOf
        /* renamed from: ag$a */
        public void onDrawableLoadSuccess(Bitmap bitmap) {
            if (bitmap == null) {
                return;
            }
            BlurImageView blurImageView = BlurImageView.this;
            blurImageView.values().setImageBitmap(bitmap);
            blurImageView.valueOf().setImageBitmap(blurImageView.ag$a(bitmap));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ah$a() {
        Drawable drawable = this.ag$a;
        if (drawable == null) {
            return;
        }
        values().setImageDrawable(drawable);
    }

    public final ImageView values() {
        return (ImageView) ah$a(AnyRes.values.backgroundImageView);
    }

    public final ImageView valueOf() {
        return (ImageView) ah$a(AnyRes.values.blurBackgroundImageView);
    }

    public final Bitmap ag$a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            if (createPopup.ag$a(getContext())) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap);
                RenderScript create = RenderScript.create(getContext());
                Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
                Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                create2.setRadius(25.0f);
                create2.setInput(createFromBitmap);
                create2.forEach(createFromBitmap2);
                createFromBitmap2.copyTo(createBitmap);
                return createBitmap;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
