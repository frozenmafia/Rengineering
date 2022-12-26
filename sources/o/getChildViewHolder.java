package o;

import com.google.common.hash.Funnel;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* loaded from: classes7.dex */
public abstract class getChildViewHolder implements ConcatAdapter {
    @Override // o.findRelativeAdapterPositionIn
    /* renamed from: ah$a */
    public ConcatAdapter ag$a(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            toString(charSequence.charAt(i));
        }
        return this;
    }

    @Override // o.findRelativeAdapterPositionIn
    /* renamed from: ag$a */
    public ConcatAdapter toString(CharSequence charSequence, Charset charset) {
        return values(charSequence.toString().getBytes(charset));
    }

    @Override // o.findRelativeAdapterPositionIn
    /* renamed from: ag$a */
    public ConcatAdapter values(byte[] bArr) {
        return toString(bArr, 0, bArr.length);
    }

    @Override // o.ConcatAdapter
    public ConcatAdapter toString(byte[] bArr, int i, int i2) {
        markViewHoldersUpdated.ag$a(i, i + i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            valueOf(bArr[i + i3]);
        }
        return this;
    }

    @Override // o.ConcatAdapter
    public ConcatAdapter ah$a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            toString(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.limit());
        } else {
            for (int remaining = byteBuffer.remaining(); remaining > 0; remaining--) {
                valueOf(byteBuffer.get());
            }
        }
        return this;
    }

    @Override // o.findRelativeAdapterPositionIn
    /* renamed from: ag$a */
    public ConcatAdapter values(int i) {
        valueOf((byte) i);
        valueOf((byte) (i >>> 8));
        valueOf((byte) (i >>> 16));
        valueOf((byte) (i >>> 24));
        return this;
    }

    @Override // o.findRelativeAdapterPositionIn
    /* renamed from: ag$a */
    public ConcatAdapter valueOf(long j) {
        for (int i = 0; i < 64; i += 8) {
            valueOf((byte) (j >>> i));
        }
        return this;
    }

    public ConcatAdapter toString(char c) {
        valueOf((byte) c);
        valueOf((byte) (c >>> '\b'));
        return this;
    }

    @Override // o.ConcatAdapter
    public <T> ConcatAdapter valueOf(T t, Funnel<? super T> funnel) {
        funnel.funnel(t, this);
        return this;
    }
}
