package o;

import java.io.Closeable;
import java.io.IOException;
import o.ChangeImageTransform;
/* JADX INFO: Access modifiers changed from: package-private */
@ChangeImageTransform.AnonymousClass1
/* loaded from: classes7.dex */
public abstract class createAdapter implements Closeable {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract getOnBindEditTextListener ag$a();

    abstract getDependency values();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        values().close();
    }
}
