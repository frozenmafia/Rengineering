package com.bugsnag.android;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.ViewCompat;
import o.setContentChangeTypes;
import o.setImportantForAccessibility;
/* loaded from: classes3.dex */
public final class StorageModule$sessionStore$2 extends Lambda implements Styleable.ArcMotion<ViewCompat.AnonymousClass1> {
    final /* synthetic */ setContentChangeTypes $immutableConfig;
    final /* synthetic */ setImportantForAccessibility $logger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageModule$sessionStore$2(setContentChangeTypes setcontentchangetypes, setImportantForAccessibility setimportantforaccessibility) {
        super(0);
        this.$immutableConfig = setcontentchangetypes;
        this.$logger = setimportantforaccessibility;
    }

    @Override // o.Styleable.ArcMotion
    public final ViewCompat.AnonymousClass1 invoke() {
        return new ViewCompat.AnonymousClass1(this.$immutableConfig, this.$logger, null);
    }
}
