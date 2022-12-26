package o;

import android.media.MediaDrmException;
import com.appsamurai.storyly.exoplayer2.common.drm.DrmInitData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.postDelayed;
/* loaded from: classes3.dex */
public final class HandlerKt implements postDelayed {
    @Override // o.postDelayed
    public void ag$a() {
    }

    @Override // o.postDelayed
    public /* synthetic */ void ag$a(byte[] bArr, sendUrgentData sendurgentdata) {
        HandlerKt$postDelayed$runnable$1.values(this, bArr, sendurgentdata);
    }

    @Override // o.postDelayed
    public int values() {
        return 1;
    }

    @Override // o.postDelayed
    public void values(postDelayed.values valuesVar) {
    }

    @Override // o.postDelayed
    public void values(byte[] bArr) {
    }

    @Override // o.postDelayed
    public byte[] ah$a() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // o.postDelayed
    public postDelayed$ag$a values(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    @Override // o.postDelayed
    public byte[] toString(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // o.postDelayed
    public postDelayed.toString valueOf() {
        throw new IllegalStateException();
    }

    @Override // o.postDelayed
    public void toString(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // o.postDelayed
    public Map<String, String> ag$a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // o.postDelayed
    public boolean values(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // o.postDelayed
    public void ag$a(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // o.postDelayed
    public getSplashScreenView valueOf(byte[] bArr) {
        throw new IllegalStateException();
    }
}
