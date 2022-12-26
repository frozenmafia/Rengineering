package com.appsamurai.storyly.storylypresenter.storylylayer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class x0 extends Lambda implements Styleable.ChangeBounds<List<f1>, setAnimationMatrix> {
    public final /* synthetic */ Canvas a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Canvas canvas) {
        super(1);
        this.a = canvas;
    }

    @Override // o.Styleable.ChangeBounds
    public setAnimationMatrix invoke(List<f1> list) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        List<f1> list2 = list;
        runAnimators.ag$a(list2, "it");
        Canvas canvas = this.a;
        for (f1 f1Var : list2) {
            Bitmap a = f1Var.a();
            if (a != null) {
                ViewGroup.LayoutParams layoutParams = f1Var.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                float f = marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0;
                ViewGroup.LayoutParams layoutParams2 = f1Var.getLayoutParams();
                if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams2 = null;
                }
                canvas.drawBitmap(a, f, ((ViewGroup.MarginLayoutParams) layoutParams2) != null ? marginLayoutParams.topMargin : 0, (Paint) null);
            }
        }
        return setAnimationMatrix.ag$a;
    }
}
