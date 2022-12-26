package com.appsamurai.storyly.storylypresenter.storylyheader;

import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.appsamurai.storyly.storylypresenter.storylyheader.a;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.extract$ah$a;
/* loaded from: classes3.dex */
public final class a$c$a extends Lambda implements Styleable.ArcMotion<Drawable> {
    public final /* synthetic */ a.toString a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$c$a(a.toString tostring) {
        super(0);
        this.a = tostring;
    }

    @Override // o.Styleable.ArcMotion
    public Drawable invoke() {
        return ContextCompat.getDrawable(this.a.invoke.ag$a.getRoot().getContext(), extract$ah$a.st_close);
    }
}
