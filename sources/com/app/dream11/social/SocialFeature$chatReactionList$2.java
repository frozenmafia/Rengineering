package com.app.dream11.social;

import com.app.dream11.chat.ChatFeatureContantsKt;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.reserveEndViewTransition;
import o.setAlarmClock;
/* loaded from: classes3.dex */
public final class SocialFeature$chatReactionList$2 extends Lambda implements Styleable.ArcMotion<ArrayList<setAlarmClock>> {
    public static final SocialFeature$chatReactionList$2 INSTANCE = new SocialFeature$chatReactionList$2();

    SocialFeature$chatReactionList$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final ArrayList<setAlarmClock> invoke() {
        ArrayList<setAlarmClock> arrayList = new ArrayList<>();
        int i = 0;
        for (Object obj : ChatFeatureContantsKt.getChatReactionMap().entrySet()) {
            if (i < 0) {
                reserveEndViewTransition.ag$a();
            }
            Map.Entry entry = (Map.Entry) obj;
            arrayList.add(new setAlarmClock(i, "", "", (String) entry.getKey(), ((Number) entry.getValue()).intValue()));
            i++;
        }
        return arrayList;
    }
}
