package o;

import com.google.android.exoplayer2.extractor.avi.AviExtractor;
import o.parseAsHtml;
/* loaded from: classes3.dex */
final class getScript implements parseAsHtml.Cdefault {
    public final String ag$a;

    @Override // o.parseAsHtml.Cdefault
    public int ah$a() {
        return AviExtractor.FOURCC_strn;
    }

    public static getScript ah$a(C$default$setContentDescription c$default$setContentDescription) {
        return new getScript(c$default$setContentDescription.ag$a(c$default$setContentDescription.ag$a()));
    }

    private getScript(String str) {
        this.ag$a = str;
    }
}
