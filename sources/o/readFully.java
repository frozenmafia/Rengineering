package o;

import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import com.appsamurai.storyly.exoplayer2.extractor.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
public final class readFully extends AtomicFile {
    private static final Pattern valueOf = Pattern.compile("(.+?)='(.*?)';", 32);
    private final CharsetDecoder ah$a = addUpdateOp.HaptikSDK$a.newDecoder();
    private final CharsetDecoder toString = addUpdateOp.ag$a.newDecoder();

    @Override // o.AtomicFile
    protected Metadata ag$a(sync syncVar, ByteBuffer byteBuffer) {
        String ah$a = ah$a(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (ah$a == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = valueOf.matcher(ah$a);
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String valueOf2 = postponeAndUpdateViewHolders.valueOf(group);
                valueOf2.hashCode();
                if (valueOf2.equals("streamurl")) {
                    str2 = group2;
                } else if (valueOf2.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }

    private String ah$a(ByteBuffer byteBuffer) {
        try {
            return this.ah$a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.toString.decode(byteBuffer).toString();
                this.toString.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.toString.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.toString.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.ah$a.reset();
            byteBuffer.rewind();
        }
    }
}
