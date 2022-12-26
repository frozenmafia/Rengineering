package o;

import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.CommentFrame;
import com.appsamurai.storyly.exoplayer2.extractor.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
public final class stereoReset {
    private static final Pattern toString = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int values = -1;
    public int ah$a = -1;

    public boolean ah$a(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 > 0 || i3 > 0) {
            this.values = i2;
            this.ah$a = i3;
            return true;
        }
        return false;
    }

    public boolean values(Metadata metadata) {
        for (int i = 0; i < metadata.values(); i++) {
            Metadata.Entry valueOf = metadata.valueOf(i);
            if (valueOf instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) valueOf;
                if ("iTunSMPB".equals(commentFrame.ag$a) && ah$a(commentFrame.ah$a)) {
                    return true;
                }
            } else if (valueOf instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) valueOf;
                if ("com.apple.iTunes".equals(internalFrame.toString) && "iTunSMPB".equals(internalFrame.ah$a) && ah$a(internalFrame.values)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private boolean ah$a(String str) {
        Matcher matcher = toString.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt((String) getElevationDegrees.ah$a(matcher.group(1)), 16);
                int parseInt2 = Integer.parseInt((String) getElevationDegrees.ah$a(matcher.group(2)), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.values = parseInt;
                    this.ah$a = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public boolean values() {
        return (this.values == -1 || this.ah$a == -1) ? false : true;
    }
}
