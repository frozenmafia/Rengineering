package com.appsamurai.storyly.storylypresenter.storylyheader;

import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.extract$ah$a;
/* loaded from: classes3.dex */
public final class a$d$a extends Lambda implements Styleable.ArcMotion<Drawable> {
    public final /* synthetic */ a$ah$a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$d$a(a$ah$a a_ah_a) {
        super(0);
        this.a = a_ah_a;
    }

    @Override // o.Styleable.ArcMotion
    public Drawable invoke() {
        return ContextCompat.getDrawable(this.a.invoke.ag$a.getRoot().getContext(), extract$ah$a.st_header_options);
    }
}
