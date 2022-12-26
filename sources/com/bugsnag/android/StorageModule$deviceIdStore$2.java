package com.bugsnag.android;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.checkPaneVisibility;
import o.notifyViewAccessibilityStateChangedIfNeeded;
import o.setImportantForAccessibility;
/* loaded from: classes3.dex */
public final class StorageModule$deviceIdStore$2 extends Lambda implements Styleable.ArcMotion<notifyViewAccessibilityStateChangedIfNeeded> {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ setImportantForAccessibility $logger;
    final /* synthetic */ checkPaneVisibility this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageModule$deviceIdStore$2(checkPaneVisibility checkpanevisibility, Context context, setImportantForAccessibility setimportantforaccessibility) {
        super(0);
        this.this$0 = checkpanevisibility;
        this.$appContext = context;
        this.$logger = setimportantforaccessibility;
    }

    @Override // o.Styleable.ArcMotion
    public final notifyViewAccessibilityStateChangedIfNeeded invoke() {
        return new notifyViewAccessibilityStateChangedIfNeeded(this.$appContext, null, null, null, null, this.this$0.ah$b(), this.$logger, 30, null);
    }
}
