package o;

import com.google.common.hash.HashCode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes7.dex */
public abstract class countOnesBefore extends getChildViewHolder {
    private final ByteBuffer ag$a;
    private final int ah$a;
    private final int values;

    protected abstract HashCode ah$a();

    protected abstract void valueOf(ByteBuffer byteBuffer);

    public countOnesBefore(int i) {
        this(i, i);
    }

    protected countOnesBefore(int i, int i2) {
        markViewHoldersUpdated.values(i2 % i == 0);
        this.ag$a = ByteBuffer.allocate(i2 + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.values = i2;
        this.ah$a = i;
    }

    protected void ag$a(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.limit());
        removeAllViews.values(byteBuffer, this.ah$a + 7);
        while (true) {
            int position = byteBuffer.position();
            int i = this.ah$a;
            if (position < i) {
                byteBuffer.putLong(0L);
            } else {
                removeAllViews.values(byteBuffer, i);
                removeAllViews.toString(byteBuffer);
                valueOf(byteBuffer);
                return;
            }
        }
    }

    @Override // o.getChildViewHolder, o.ConcatAdapter
    public final ConcatAdapter toString(byte[] bArr, int i, int i2) {
        return values(ByteBuffer.wrap(bArr, i, i2).order(ByteOrder.LITTLE_ENDIAN));
    }

    @Override // o.getChildViewHolder, o.ConcatAdapter
    public final ConcatAdapter ah$a(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        try {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return values(byteBuffer);
        } finally {
            byteBuffer.order(order);
        }
    }

    private ConcatAdapter values(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.ag$a.remaining()) {
            this.ag$a.put(byteBuffer);
            values();
            return this;
        }
        int i = this.values;
        int position = this.ag$a.position();
        for (int i2 = 0; i2 < i - position; i2++) {
            this.ag$a.put(byteBuffer.get());
        }
        valueOf();
        while (byteBuffer.remaining() >= this.ah$a) {
            valueOf(byteBuffer);
        }
        this.ag$a.put(byteBuffer);
        return this;
    }

    @Override // o.ConcatAdapter
    public final ConcatAdapter valueOf(byte b2) {
        this.ag$a.put(b2);
        values();
        return this;
    }

    @Override // o.getChildViewHolder
    public final ConcatAdapter toString(char c) {
        this.ag$a.putChar(c);
        values();
        return this;
    }

    @Override // o.getChildViewHolder, o.findRelativeAdapterPositionIn
    /* renamed from: ag$a */
    public final ConcatAdapter values(int i) {
        this.ag$a.putInt(i);
        values();
        return this;
    }

    @Override // o.getChildViewHolder, o.findRelativeAdapterPositionIn
    /* renamed from: ag$a */
    public final ConcatAdapter valueOf(long j) {
        this.ag$a.putLong(j);
        values();
        return this;
    }

    @Override // o.ConcatAdapter
    public final HashCode ag$a() {
        valueOf();
        removeAllViews.toString(this.ag$a);
        if (this.ag$a.remaining() > 0) {
            ag$a(this.ag$a);
            ByteBuffer byteBuffer = this.ag$a;
            byteBuffer.position(byteBuffer.limit());
        }
        return ah$a();
    }

    private void values() {
        if (this.ag$a.remaining() < 8) {
            valueOf();
        }
    }

    private void valueOf() {
        removeAllViews.toString(this.ag$a);
        while (this.ag$a.remaining() >= this.ah$a) {
            valueOf(this.ag$a);
        }
        this.ag$a.compact();
    }
}
