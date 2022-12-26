package o;

import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import java.nio.ByteBuffer;
/* loaded from: classes3.dex */
public abstract class AtomicFile implements TransitionKt$doOnPause$$inlined$addListener$default$1 {
    protected abstract Metadata ag$a(sync syncVar, ByteBuffer byteBuffer);

    @Override // o.TransitionKt$doOnPause$$inlined$addListener$default$1
    public final Metadata ah$a(sync syncVar) {
        ByteBuffer byteBuffer = (ByteBuffer) FingerprintManagerCompat.toString(syncVar.toString);
        FingerprintManagerCompat.toString(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (syncVar.HaptikSDK$b()) {
            return null;
        }
        return ag$a(syncVar, byteBuffer);
    }
}
