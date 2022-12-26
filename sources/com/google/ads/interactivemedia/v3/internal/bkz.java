package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes7.dex */
public final class bkz extends bne {
    private static final Writer a = new bky();

    /* renamed from: b  reason: collision with root package name */
    private static final bix f872b = new bix("closed");
    private final List c;
    private String d;
    private bis e;

    public bkz() {
        super(a);
        this.c = new ArrayList();
        this.e = biu.a;
    }

    private final bis s() {
        List list = this.c;
        return (bis) list.get(list.size() - 1);
    }

    private final void t(bis bisVar) {
        if (this.d != null) {
            if (!(bisVar instanceof biu) || p()) {
                ((biv) s()).b(this.d, bisVar);
            }
            this.d = null;
        } else if (this.c.isEmpty()) {
            this.e = bisVar;
        } else {
            bis s = s();
            if (s instanceof biq) {
                ((biq) s).a(bisVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final bis a() {
        if (this.c.isEmpty()) {
            return this.e;
        }
        List list = this.c;
        Objects.toString(list);
        throw new IllegalStateException("Expected one JSON element but was ".concat(list.toString()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bne
    public final void b() throws IOException {
        biq biqVar = new biq();
        t(biqVar);
        this.c.add(biqVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bne
    public final void c() throws IOException {
        biv bivVar = new biv();
        t(bivVar);
        this.c.add(bivVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bne, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.c.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.c.add(f872b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bne
    public final void d() throws IOException {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        }
        if (s() instanceof biq) {
            List list = this.c;
            list.remove(list.size() - 1);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bne
    public final void e() throws IOException {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        }
        if (s() instanceof biv) {
            List list = this.c;
            list.remove(list.size() - 1);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bne
    public final void f(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        }
        if (!(s() instanceof biv)) {
            throw new IllegalStateException();
        }
        this.d = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bne, java.io.Flushable
    public final void flush() throws IOException {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bne
    public final void g() throws IOException {
        t(biu.a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bne
    public final void h(long j) throws IOException {
        t(new bix(Long.valueOf(j)));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bne
    public final void i(Boolean bool) throws IOException {
        if (bool == null) {
            g();
        } else {
            t(new bix(bool));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bne
    public final void j(Number number) throws IOException {
        if (number == null) {
            g();
            return;
        }
        if (!r()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                Objects.toString(number);
                throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(number.toString()));
            }
        }
        t(new bix(number));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bne
    public final void k(String str) throws IOException {
        if (str == null) {
            g();
        } else {
            t(new bix(str));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bne
    public final void l(boolean z) throws IOException {
        t(new bix(Boolean.valueOf(z)));
    }
}
