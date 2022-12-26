package com.appsamurai.storyly.storylypresenter.storylyheader;

import android.widget.LinearLayout;
import com.appsamurai.storyly.storylypresenter.storylyheader.a;
import kotlin.jvm.internal.Lambda;
import o.InputDeviceCompat;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class a$a$a extends Lambda implements Styleable.ArcMotion<InputDeviceCompat> {
    public final /* synthetic */ a.valueOf a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f121b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$a$a(a.valueOf valueof, a aVar) {
        super(0);
        this.a = valueof;
        this.f121b = aVar;
    }

    @Override // o.Styleable.ArcMotion
    public InputDeviceCompat invoke() {
        LinearLayout linearLayout = this.a.values.ag$a;
        runAnimators.ah$a(linearLayout, "binding.pagerView");
        return new InputDeviceCompat(linearLayout, this.f121b.values);
    }
}
