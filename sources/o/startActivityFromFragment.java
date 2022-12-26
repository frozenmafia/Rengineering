package o;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.OutputStream;
import o.Fragment;
/* loaded from: classes4.dex */
public abstract class startActivityFromFragment extends OutputStream {
    public abstract int size();

    public abstract PooledByteBuffer toByteBuffer();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            Fragment.OnPreAttachedListener.ag$a(e);
        }
    }
}
