package com.appsamurai.storyly.storylypresenter;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import kotlin.jvm.internal.Lambda;
import o.DragStartHelper;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class n0 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    public final /* synthetic */ o a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o oVar) {
        super(0);
        this.a = oVar;
    }

    @Override // o.Styleable.ArcMotion
    public setAnimationMatrix invoke() {
        DragStartHelper.AnonymousClass1 receiveFile;
        this.a.extraCallbackWithResult();
        receiveFile = this.a.receiveFile();
        receiveFile.values.setBackgroundColor(Color.parseColor("#CC000000"));
        receiveFile.ah$a().setVisibility(0);
        Styleable.ArcMotion<setAnimationMatrix> arcMotion = receiveFile.toString;
        if (arcMotion == null) {
            runAnimators.valueOf("onOptionsSheetPresent");
            arcMotion = null;
        }
        arcMotion.invoke();
        receiveFile.values.setVisibility(0);
        receiveFile.ah$a().setY(receiveFile.values.getHeight());
        receiveFile.ah$a().setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(receiveFile.ah$a(), "y", receiveFile.values.getHeight() - receiveFile.ah$a().getHeight());
        ofFloat.setDuration(300L);
        ofFloat.start();
        return setAnimationMatrix.ag$a;
    }
}
