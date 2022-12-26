package o;

import com.appsamurai.storyly.exoplayer2.core.mediacodec.MediaCodecUtil;
import java.util.List;
/* loaded from: classes3.dex */
public interface LocaleListInterface {
    public static final LocaleListInterface ag$a = getLocaleList.valueOf;

    List<MessageCompat> toString(String str, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException;
}
