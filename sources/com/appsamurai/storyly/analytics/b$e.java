package com.appsamurai.storyly.analytics;

import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class b$e extends Lambda implements Styleable.ArcMotion<String> {
    public static final b$e a = new b$e();

    public b$e() {
        super(0);
    }

    @Override // o.Styleable.ArcMotion
    public String invoke() {
        String uuid = UUID.randomUUID().toString();
        runAnimators.ah$a(uuid, "randomUUID().toString()");
        Locale locale = Locale.ENGLISH;
        runAnimators.ah$a(locale, "ENGLISH");
        String upperCase = uuid.toUpperCase(locale);
        runAnimators.ah$a(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
