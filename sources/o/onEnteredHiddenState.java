package o;

import com.google.common.hash.Funnel;
import com.google.common.hash.HashCode;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import o.ChildHelper;
/* loaded from: classes7.dex */
public abstract class onEnteredHiddenState implements ChildHelper.Callback {
    @Override // o.ChildHelper.Callback
    public <T> HashCode hashObject(T t, Funnel<? super T> funnel) {
        return newHasher().valueOf(t, funnel).ag$a();
    }

    public HashCode hashUnencodedChars(CharSequence charSequence) {
        return newHasher(charSequence.length() * 2).ah$a(charSequence).ag$a();
    }

    public HashCode hashString(CharSequence charSequence, Charset charset) {
        return newHasher().ag$a(charSequence, charset).ag$a();
    }

    public HashCode hashInt(int i) {
        return newHasher(4).ag$a(i).ag$a();
    }

    public HashCode hashLong(long j) {
        return newHasher(8).ag$a(j).ag$a();
    }

    public HashCode hashBytes(byte[] bArr) {
        return hashBytes(bArr, 0, bArr.length);
    }

    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        markViewHoldersUpdated.ag$a(i, i + i2, bArr.length);
        return newHasher(i2).toString(bArr, i, i2).ag$a();
    }

    public HashCode hashBytes(ByteBuffer byteBuffer) {
        return newHasher(byteBuffer.remaining()).ah$a(byteBuffer).ag$a();
    }

    public ConcatAdapter newHasher(int i) {
        markViewHoldersUpdated.values(i >= 0, "expectedInputSize must be >= 0 but was %s", i);
        return newHasher();
    }
}
