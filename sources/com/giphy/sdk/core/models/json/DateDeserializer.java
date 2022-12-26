package com.giphy.sdk.core.models.json;

import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import o.StaggeredGridLayoutManager;
import o.getLastChildPosition;
import o.hasGapsToFix;
import o.invalidateSpanAssignments;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class DateDeserializer implements hasGapsToFix<Date> {
    private final SimpleDateFormat dateFormat;
    private final SimpleDateFormat dateFormatStories;

    public DateDeserializer() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        this.dateFormat = simpleDateFormat;
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        this.dateFormatStories = simpleDateFormat2;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // o.hasGapsToFix
    public Date deserialize(invalidateSpanAssignments invalidatespanassignments, Type type, getLastChildPosition getlastchildposition) throws JsonParseException {
        runAnimators.ag$a(invalidatespanassignments, "json");
        runAnimators.ag$a(type, "typeOfT");
        runAnimators.ag$a(getlastchildposition, "context");
        Date date = null;
        try {
            try {
                SimpleDateFormat simpleDateFormat = this.dateFormat;
                StaggeredGridLayoutManager.AnonymousClass1 HaptikSDK$c = invalidatespanassignments.HaptikSDK$c();
                runAnimators.ah$a(HaptikSDK$c, "json.asJsonPrimitive");
                return simpleDateFormat.parse(HaptikSDK$c.HaptikSDK$a());
            } catch (Exception unused) {
                return date;
            }
        } catch (Exception unused2) {
            SimpleDateFormat simpleDateFormat2 = this.dateFormatStories;
            StaggeredGridLayoutManager.AnonymousClass1 HaptikSDK$c2 = invalidatespanassignments.HaptikSDK$c();
            runAnimators.ah$a(HaptikSDK$c2, "json.asJsonPrimitive");
            return simpleDateFormat2.parse(HaptikSDK$c2.HaptikSDK$a());
        }
    }
}
