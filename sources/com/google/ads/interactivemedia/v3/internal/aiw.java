package com.google.ads.interactivemedia.v3.internal;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public final class aiw implements CompanionAdSlot {
    private int a;

    /* renamed from: b  reason: collision with root package name */
    private int f581b;
    private ViewGroup c;
    private String d;
    private final List e = new ArrayList(1);

    public final List a() {
        return this.e;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final void addClickListener(CompanionAdSlot.ClickListener clickListener) {
        this.e.add(clickListener);
    }

    public final void b(String str) {
        this.d = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final ViewGroup getContainer() {
        return this.c;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final int getHeight() {
        return this.f581b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final int getWidth() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final boolean isFilled() {
        return this.c.findViewWithTag(this.d) != null;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final void removeClickListener(CompanionAdSlot.ClickListener clickListener) {
        this.e.remove(clickListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final void setContainer(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAdSlot
    public final void setSize(int i, int i2) {
        this.a = i;
        this.f581b = i2;
    }
}
