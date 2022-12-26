package com.dreampay.commons.constants;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* loaded from: classes4.dex */
final class Constants$CURRENT_DATE$2 extends Lambda implements Styleable.ArcMotion<String> {
    public static final Constants$CURRENT_DATE$2 INSTANCE = new Constants$CURRENT_DATE$2();

    Constants$CURRENT_DATE$2() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public final String invoke() {
        return new SimpleDateFormat("ddMMyyyy", Locale.getDefault()).format(Calendar.getInstance().getTime());
    }
}
