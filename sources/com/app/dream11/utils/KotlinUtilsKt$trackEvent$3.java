package com.app.dream11.utils;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.model.EventCategory;
import com.app.dream11.model.NewEvents;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.TrustedWebActivityCallbackRemote;
import o.setAnimationMatrix;
/* loaded from: classes.dex */
public final class KotlinUtilsKt$trackEvent$3 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ EventCategory $category;
    final /* synthetic */ String $name;
    final /* synthetic */ Map<String, Serializable> $properties;
    final /* synthetic */ TrustedWebActivityCallbackRemote $this_trackEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KotlinUtilsKt$trackEvent$3(TrustedWebActivityCallbackRemote trustedWebActivityCallbackRemote, String str, EventCategory eventCategory, Map<String, ? extends Serializable> map) {
        super(0);
        this.$this_trackEvent = trustedWebActivityCallbackRemote;
        this.$name = str;
        this.$category = eventCategory;
        this.$properties = map;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TrustedWebActivityCallbackRemote trustedWebActivityCallbackRemote = this.$this_trackEvent;
        NewEvents newEvents = new NewEvents(this.$name, this.$category);
        Map<String, Serializable> map = this.$properties;
        if (map != null) {
            for (Map.Entry<String, Serializable> entry : map.entrySet()) {
                newEvents.addProperty(entry.getKey(), entry.getValue());
            }
        }
        trustedWebActivityCallbackRemote.trackEvent(newEvents, new EventTracker[0]);
    }
}
