package com.appsamurai.storyly.data;

import o.AnimateLayoutChangeDetector;
import o.FragmentStateAdapter;
import o.containsItem;
import o.getStartAlpha;
import o.inferViewPager;
import o.runAnimators;
/* loaded from: classes3.dex */
public enum n0 {
    UpRight,
    UpMiddle,
    UpLeft,
    DownLeft,
    DownMiddle,
    DownRight;
    
    public static final values a = new values();

    /* renamed from: b  reason: collision with root package name */
    public static final FragmentStateAdapter.DataSetChangeObserver f97b = FragmentStateAdapter.FragmentMaxLifecycleEnforcer.AnonymousClass3.ag$a("TooltipPlacement", inferViewPager.invoke.toString);

    /* loaded from: classes3.dex */
    public static final class values implements containsItem<n0> {
        @Override // o.scheduleGracePeriodEnd
        public Object ah$a(AnimateLayoutChangeDetector animateLayoutChangeDetector) {
            runAnimators.ag$a(animateLayoutChangeDetector, "decoder");
            n0[] values = n0.values();
            int HaptikSDK$a = animateLayoutChangeDetector.HaptikSDK$a();
            return (HaptikSDK$a < 0 || HaptikSDK$a > getStartAlpha.invoke(values)) ? n0.UpMiddle : values[HaptikSDK$a];
        }

        @Override // o.containsItem, o.scheduleGracePeriodEnd
        public FragmentStateAdapter.DataSetChangeObserver values() {
            return n0.f97b;
        }
    }

    public final boolean a() {
        return getStartAlpha.toString(new n0[]{DownRight, DownMiddle, DownLeft}, this);
    }
}
