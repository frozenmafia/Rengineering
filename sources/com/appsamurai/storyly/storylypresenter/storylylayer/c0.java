package com.appsamurai.storyly.storylypresenter.storylylayer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.dispatchNestedScroll;
/* loaded from: classes3.dex */
public final class c0 extends Lambda implements Styleable.ArcMotion<Bitmap> {
    public final /* synthetic */ dispatchNestedScroll a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(dispatchNestedScroll dispatchnestedscroll) {
        super(0);
        this.a = dispatchnestedscroll;
    }

    @Override // o.Styleable.ArcMotion
    public Bitmap invoke() {
        dispatchNestedScroll dispatchnestedscroll = this.a;
        ViewParent parent = dispatchnestedscroll.ag$a.getParent();
        RelativeLayout relativeLayout = parent instanceof RelativeLayout ? (RelativeLayout) parent : null;
        if (relativeLayout == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(relativeLayout.getWidth(), relativeLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        relativeLayout.draw(canvas);
        dispatchnestedscroll.ICustomTabsCallback$Default.values(new x0(canvas));
        return createBitmap;
    }
}
