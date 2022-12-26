package com.google.ads.interactivemedia.v3.internal;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
/* loaded from: classes4.dex */
public final class axf implements FilenameFilter {
    private final Pattern a;

    public axf(Pattern pattern) {
        atc.k(pattern);
        this.a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.a.matcher(str).matches();
    }
}
