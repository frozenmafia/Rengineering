package com.giphy.sdk.core.models.json;

import android.text.TextUtils;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import o.StaggeredGridLayoutManager;
import o.getLastChildPosition;
import o.hasGapsToFix;
import o.invalidateSpanAssignments;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class IntDeserializer implements hasGapsToFix<Integer> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.hasGapsToFix
    public Integer deserialize(invalidateSpanAssignments invalidatespanassignments, Type type, getLastChildPosition getlastchildposition) throws JsonParseException {
        runAnimators.ag$a(invalidatespanassignments, "json");
        runAnimators.ag$a(type, "typeOfT");
        runAnimators.ag$a(getlastchildposition, "context");
        StaggeredGridLayoutManager.AnonymousClass1 HaptikSDK$c = invalidatespanassignments.HaptikSDK$c();
        runAnimators.ah$a(HaptikSDK$c, "jsonPrimitive");
        if (HaptikSDK$c.aj$a()) {
            String HaptikSDK$a = invalidatespanassignments.HaptikSDK$a();
            if (!TextUtils.isEmpty(HaptikSDK$a)) {
                return Integer.valueOf(Integer.parseInt(HaptikSDK$a));
            }
            return 0;
        } else if (HaptikSDK$c.onXdkEvent()) {
            return Integer.valueOf(invalidatespanassignments.ah$a());
        } else {
            return 0;
        }
    }
}
