package com.app.dream11.dream11;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.model.EventCategory;
import com.app.dream11.model.NewEvents;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.onGetSmallIconBitmap;
import o.setAnimationMatrix;
/* loaded from: classes6.dex */
public final class EventsTracking$Companion$setScreenNameWithTab$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ Map<String, Object> $map;
    final /* synthetic */ String $screenName;
    final /* synthetic */ String $selectedTab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventsTracking$Companion$setScreenNameWithTab$1(String str, String str2, Map<String, ? extends Object> map) {
        super(0);
        this.$selectedTab = str;
        this.$screenName = str2;
        this.$map = map;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NewEvents newEvents = new NewEvents("ScreenLoaded", EventCategory.$UNKNOWN);
        String str = this.$selectedTab;
        NewEvents addProperty = newEvents.addProperty("TabSelected", str).addProperty("ScreenName", this.$screenName);
        Map<String, Object> map = this.$map;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                addProperty.addProperty(entry.getKey(), (Serializable) entry.getValue());
            }
        }
        onGetSmallIconBitmap.ag$a.ah$a().values(addProperty, EventTracker.IN_HOUSE);
    }
}
