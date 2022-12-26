package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes7.dex */
public abstract class onLeftHiddenState extends getChildViewHolder {
    private final ByteBuffer valueOf = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    protected abstract void ag$a(byte b2);

    protected void toString(byte[] bArr) {
        valueOf(bArr, 0, bArr.length);
    }

    protected void valueOf(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            ag$a(bArr[i3]);
        }
    }

    protected void toString(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            valueOf(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        for (int remaining = byteBuffer.remaining(); remaining > 0; remaining--) {
            ag$a(byteBuffer.get());
        }
    }

    private ConcatAdapter ah$a(int i) {
        try {
            valueOf(this.valueOf.array(), 0, i);
            return this;
        } finally {
            this.valueOf.clear();
        }
    }

    @Override // o.ConcatAdapter
    public ConcatAdapter valueOf(byte b2) {
        ag$a(b2);
        return this;
    }

    @Override // o.getChildViewHolder, o.findRelativeAdapterPositionIn
    /* renamed from: ag$a */
    public ConcatAdapter values(byte[] bArr) {
        markViewHoldersUpdated.toString(bArr);
        toString(bArr);
        return this;
    }

    @Override // o.getChildViewHolder, o.ConcatAdapter
    public ConcatAdapter toString(byte[] bArr, int i, int i2) {
        markViewHoldersUpdated.ag$a(i, i + i2, bArr.length);
        valueOf(bArr, i, i2);
        return this;
    }

    @Override // o.getChildViewHolder, o.ConcatAdapter
    public ConcatAdapter ah$a(ByteBuffer byteBuffer) {
        toString(byteBuffer);
        return this;
    }

    @Override // o.getChildViewHolder, o.findRelativeAdapterPositionIn
    /* renamed from: ag$a */
    public ConcatAdapter values(int i) {
        this.valueOf.putInt(i);
        return ah$a(4);
    }

    @Override // o.getChildViewHolder, o.findRelativeAdapterPositionIn
    /* renamed from: ag$a */
    public ConcatAdapter valueOf(long j) {
        this.valueOf.putLong(j);
        return ah$a(8);
    }

    @Override // o.getChildViewHolder
    public ConcatAdapter toString(char c) {
        this.valueOf.putChar(c);
        return ah$a(2);
    }
}
