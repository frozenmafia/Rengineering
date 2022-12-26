package com.appsamurai.storyly;

import o.AnimateLayoutChangeDetector;
import o.FragmentStateAdapter;
import o.containsItem;
import o.getStartAlpha;
import o.inferViewPager;
import o.runAnimators;
/* loaded from: classes3.dex */
public enum StoryType {
    Unknown,
    Image,
    Video,
    Vod,
    Ad;
    
    public static final toString StoryTypeDeserializer = new toString();

    /* loaded from: classes3.dex */
    public static final class toString implements containsItem<StoryType> {
        @Override // o.scheduleGracePeriodEnd
        public Object ah$a(AnimateLayoutChangeDetector animateLayoutChangeDetector) {
            runAnimators.ag$a(animateLayoutChangeDetector, "decoder");
            StoryType[] values = StoryType.values();
            int HaptikSDK$a = animateLayoutChangeDetector.HaptikSDK$a();
            return (HaptikSDK$a < 0 || HaptikSDK$a > getStartAlpha.invoke(values)) ? StoryType.Unknown : values[HaptikSDK$a];
        }

        @Override // o.containsItem, o.scheduleGracePeriodEnd
        public FragmentStateAdapter.DataSetChangeObserver values() {
            return FragmentStateAdapter.FragmentMaxLifecycleEnforcer.AnonymousClass3.ag$a("StoryType", inferViewPager.invoke.toString);
        }
    }
}
