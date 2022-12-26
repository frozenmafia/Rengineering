package o;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes4.dex */
public interface onPrepareOptionsPanel {
    PooledByteBuffer newByteBuffer(InputStream inputStream) throws IOException;

    PooledByteBuffer newByteBuffer(InputStream inputStream, int i) throws IOException;

    PooledByteBuffer newByteBuffer(byte[] bArr);

    startActivityFromFragment newOutputStream();

    startActivityFromFragment newOutputStream(int i);
}
