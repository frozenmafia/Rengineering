package o;

import com.appsamurai.storyly.exoplayer2.common.ParserException;
import com.appsamurai.storyly.exoplayer2.extractor.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;
import o.ThemeUtils;
/* loaded from: classes3.dex */
final class charAt extends TagPayloadReader {
    private static final int[] toString = {5512, 11025, 22050, 44100};
    private int ag$a;
    private boolean valueOf;
    private boolean values;

    public charAt(dirTypeForward dirtypeforward) {
        super(dirtypeforward);
    }

    @Override // com.appsamurai.storyly.exoplayer2.extractor.extractor.flv.TagPayloadReader
    public boolean ah$a(C$default$setContentDescription c$default$setContentDescription) throws TagPayloadReader.UnsupportedFormatException {
        if (!this.valueOf) {
            int extraCallbackWithResult = c$default$setContentDescription.extraCallbackWithResult();
            int i = (extraCallbackWithResult >> 4) & 15;
            this.ag$a = i;
            if (i == 2) {
                this.ah$a.ag$a(new createFromIcon$ag$a().invoke(MimeTypes.AUDIO_MPEG).values(1).getInitSettings(toString[(extraCallbackWithResult >> 2) & 3]).valueOf());
                this.values = true;
            } else if (i == 7 || i == 8) {
                this.ah$a.ag$a(new createFromIcon$ag$a().invoke(i == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW).values(1).getInitSettings(8000).valueOf());
                this.values = true;
            } else if (i != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.ag$a);
            }
            this.valueOf = true;
        } else {
            c$default$setContentDescription.HaptikSDK$a(1);
        }
        return true;
    }

    @Override // com.appsamurai.storyly.exoplayer2.extractor.extractor.flv.TagPayloadReader
    public boolean valueOf(C$default$setContentDescription c$default$setContentDescription, long j) throws ParserException {
        if (this.ag$a == 2) {
            int ag$a = c$default$setContentDescription.ag$a();
            this.ah$a.toString(c$default$setContentDescription, ag$a);
            this.ah$a.valueOf(j, 1, ag$a, 0, null);
            return true;
        }
        int extraCallbackWithResult = c$default$setContentDescription.extraCallbackWithResult();
        if (extraCallbackWithResult == 0 && !this.values) {
            int ag$a2 = c$default$setContentDescription.ag$a();
            byte[] bArr = new byte[ag$a2];
            c$default$setContentDescription.valueOf(bArr, 0, ag$a2);
            ThemeUtils.Api31.toString api31 = ThemeUtils.Api31.toString(bArr);
            this.ah$a.ag$a(new createFromIcon$ag$a().invoke(MimeTypes.AUDIO_AAC).toString(api31.ah$a).values(api31.ag$a).getInitSettings(api31.valueOf).ah$a(Collections.singletonList(bArr)).valueOf());
            this.values = true;
            return false;
        } else if (this.ag$a != 10 || extraCallbackWithResult == 1) {
            int ag$a3 = c$default$setContentDescription.ag$a();
            this.ah$a.toString(c$default$setContentDescription, ag$a3);
            this.ah$a.valueOf(j, 1, ag$a3, 0, null);
            return true;
        } else {
            return false;
        }
    }
}
