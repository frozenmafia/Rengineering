package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
/* loaded from: classes4.dex */
public abstract class bjf<T> {
    public final T fromJson(Reader reader) throws IOException {
        return read(new bnc(reader));
    }

    public final T fromJsonTree(bis bisVar) {
        try {
            return read(new bkx(bisVar));
        } catch (IOException e) {
            throw new bit(e);
        }
    }

    public final bjf<T> nullSafe() {
        return new bje(this);
    }

    public abstract T read(bnc bncVar) throws IOException;

    public final void toJson(Writer writer, T t) throws IOException {
        write(new bne(writer), t);
    }

    public final bis toJsonTree(T t) {
        try {
            bkz bkzVar = new bkz();
            write(bkzVar, t);
            return bkzVar.a();
        } catch (IOException e) {
            throw new bit(e);
        }
    }

    public abstract void write(bne bneVar, T t) throws IOException;

    public final T fromJson(String str) throws IOException {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
