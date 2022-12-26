package o;

import java.io.Closeable;
import java.io.IOException;
import o.ClassesInfoCache;
/* JADX INFO: Access modifiers changed from: protected */
/* loaded from: classes4.dex */
public abstract class ClassesInfoCache$MethodReference$ah$a implements Closeable {
    public abstract boolean ag$a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public abstract ClassesInfoCache.MethodReference.valueOf valueOf() throws IOException;
}
