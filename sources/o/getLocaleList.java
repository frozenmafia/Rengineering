package o;

import com.appsamurai.storyly.exoplayer2.core.mediacodec.MediaCodecUtil;
import java.util.List;
/* loaded from: classes3.dex */
public final /* synthetic */ class getLocaleList implements LocaleListInterface {
    public static final /* synthetic */ getLocaleList valueOf = new getLocaleList();

    private /* synthetic */ getLocaleList() {
    }

    @Override // o.LocaleListInterface
    public final List toString(String str, boolean z, boolean z2) {
        return MediaCodecUtil.toString(str, z, z2);
    }
}
