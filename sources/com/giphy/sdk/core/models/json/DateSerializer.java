package com.giphy.sdk.core.models.json;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import o.StaggeredGridLayoutManager;
import o.invalidateSpanAssignments;
import o.runAnimators;
import o.saveSpanReferenceLines;
import o.updateMeasureSpecs;
/* loaded from: classes4.dex */
public final class DateSerializer implements updateMeasureSpecs<Date> {
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    @Override // o.updateMeasureSpecs
    public invalidateSpanAssignments serialize(Date date, Type type, saveSpanReferenceLines savespanreferencelines) {
        runAnimators.ag$a(date, "src");
        runAnimators.ag$a(type, "typeOfSrc");
        runAnimators.ag$a(savespanreferencelines, "context");
        return new StaggeredGridLayoutManager.AnonymousClass1(this.dateFormat.format(date));
    }
}
