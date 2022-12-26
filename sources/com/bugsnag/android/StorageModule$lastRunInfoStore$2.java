package com.bugsnag.android;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setClipBounds;
import o.setContentChangeTypes;
/* loaded from: classes3.dex */
public final class StorageModule$lastRunInfoStore$2 extends Lambda implements Styleable.ArcMotion<setClipBounds> {
    final /* synthetic */ setContentChangeTypes $immutableConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageModule$lastRunInfoStore$2(setContentChangeTypes setcontentchangetypes) {
        super(0);
        this.$immutableConfig = setcontentchangetypes;
    }

    @Override // o.Styleable.ArcMotion
    public final setClipBounds invoke() {
        return new setClipBounds(this.$immutableConfig);
    }
}
