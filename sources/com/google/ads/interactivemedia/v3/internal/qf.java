package com.google.ads.interactivemedia.v3.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Queue;
/* loaded from: classes4.dex */
final class qf {
    private final BufferedReader a;

    /* renamed from: b  reason: collision with root package name */
    private final Queue f1229b;
    private String c;

    public qf(Queue queue, BufferedReader bufferedReader) {
        this.f1229b = queue;
        this.a = bufferedReader;
    }

    public final String a() throws IOException {
        if (b()) {
            String str = this.c;
            this.c = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final boolean b() throws IOException {
        String trim;
        if (this.c != null) {
            return true;
        }
        if (this.f1229b.isEmpty()) {
            do {
                String readLine = this.a.readLine();
                this.c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.c = trim;
            } while (trim.isEmpty());
            return true;
        }
        String str = (String) this.f1229b.poll();
        af.s(str);
        this.c = str;
        return true;
    }
}
