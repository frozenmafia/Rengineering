package com.google.ads.interactivemedia.v3.internal;

import java.nio.charset.Charset;
import org.apache.commons.codec.CharEncoding;
/* loaded from: classes4.dex */
public final class asu {
    public static final Charset a = Charset.forName("US-ASCII");

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f704b;
    public static final Charset c;

    static {
        Charset.forName("ISO-8859-1");
        f704b = Charset.forName("UTF-8");
        Charset.forName(CharEncoding.UTF_16BE);
        c = Charset.forName("UTF-16LE");
        Charset.forName("UTF-16");
    }
}
