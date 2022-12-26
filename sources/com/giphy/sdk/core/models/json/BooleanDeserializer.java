package com.giphy.sdk.core.models.json;

import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import o.StaggeredGridLayoutManager;
import o.getLastChildPosition;
import o.hasGapsToFix;
import o.invalidateSpanAssignments;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class BooleanDeserializer implements hasGapsToFix<Boolean> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.hasGapsToFix
    public Boolean deserialize(invalidateSpanAssignments invalidatespanassignments, Type type, getLastChildPosition getlastchildposition) throws JsonParseException {
        runAnimators.ag$a(invalidatespanassignments, "json");
        runAnimators.ag$a(type, "typeOfT");
        runAnimators.ag$a(getlastchildposition, "context");
        StaggeredGridLayoutManager.AnonymousClass1 HaptikSDK$c = invalidatespanassignments.HaptikSDK$c();
        runAnimators.ah$a(HaptikSDK$c, "jsonPrimitive");
        if (HaptikSDK$c.HaptikSDK$d()) {
            return Boolean.valueOf(invalidatespanassignments.values());
        }
        if (HaptikSDK$c.onXdkEvent()) {
            return Boolean.valueOf(invalidatespanassignments.ah$a() != 0);
        }
        return false;
    }
}
