package com.app.dream11.core;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.app.dream11.ui.Dream11ToolTipManager;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes2.dex */
final class DreamTooltipHelper$tooltip$2 extends Lambda implements Styleable.ArcMotion<Dream11ToolTipManager> {
    final /* synthetic */ Context $context;
    final /* synthetic */ LifecycleOwner $lifecycleObserver;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DreamTooltipHelper$tooltip$2(Context context, LifecycleOwner lifecycleOwner) {
        super(0);
        this.$context = context;
        this.$lifecycleObserver = lifecycleOwner;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final Dream11ToolTipManager invoke() {
        return new Dream11ToolTipManager(this.$context, this.$lifecycleObserver);
    }
}
