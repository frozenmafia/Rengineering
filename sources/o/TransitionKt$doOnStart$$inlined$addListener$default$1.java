package o;

import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import com.appsamurai.storyly.exoplayer2.extractor.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes3.dex */
public final class TransitionKt$doOnStart$$inlined$addListener$default$1 extends AtomicFile {
    @Override // o.AtomicFile
    protected Metadata ag$a(sync syncVar, ByteBuffer byteBuffer) {
        return new Metadata(ag$a(new C$default$setContentDescription(byteBuffer.array(), byteBuffer.limit())));
    }

    public EventMessage ag$a(C$default$setContentDescription c$default$setContentDescription) {
        return new EventMessage((String) FingerprintManagerCompat.toString(c$default$setContentDescription.extraCallback()), (String) FingerprintManagerCompat.toString(c$default$setContentDescription.extraCallback()), c$default$setContentDescription.isLogoutPending(), c$default$setContentDescription.isLogoutPending(), Arrays.copyOfRange(c$default$setContentDescription.ah$a(), c$default$setContentDescription.valueOf(), c$default$setContentDescription.HaptikSDK$a()));
    }
}
