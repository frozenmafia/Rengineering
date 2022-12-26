package com.appsamurai.storyly.exoplayer2.decoder;

import java.nio.ByteBuffer;
import o.getIconView;
import o.get_splashScreenView;
import o.updateBounds;
/* loaded from: classes3.dex */
public class DecoderInputBuffer extends get_splashScreenView {
    private final int HaptikSDK$b;
    private final int HaptikSDK$c;
    public boolean ag$a;
    public final getIconView ah$a;
    public ByteBuffer toString;
    public ByteBuffer valueOf;
    public long values;

    static {
        updateBounds.Cdefault.valueOf("goog.exo.decoder");
    }

    /* loaded from: classes3.dex */
    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.currentCapacity = i;
            this.requiredCapacity = i2;
        }
    }

    public static DecoderInputBuffer HaptikSDK$d() {
        return new DecoderInputBuffer(0);
    }

    public DecoderInputBuffer(int i) {
        this(i, 0);
    }

    public DecoderInputBuffer(int i, int i2) {
        this.ah$a = new getIconView();
        this.HaptikSDK$c = i;
        this.HaptikSDK$b = i2;
    }

    public void invoke(int i) {
        ByteBuffer byteBuffer = this.valueOf;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.valueOf = ByteBuffer.allocate(i);
        } else {
            this.valueOf.clear();
        }
    }

    public void toString(int i) {
        int i2 = i + this.HaptikSDK$b;
        ByteBuffer byteBuffer = this.toString;
        if (byteBuffer == null) {
            this.toString = valueOf(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.toString = byteBuffer;
            return;
        }
        ByteBuffer valueOf = valueOf(i3);
        valueOf.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            valueOf.put(byteBuffer);
        }
        this.toString = valueOf;
    }

    public final boolean HaptikWebView() {
        return values(1073741824);
    }

    public final void getSignupData() {
        ByteBuffer byteBuffer = this.toString;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.valueOf;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @Override // o.get_splashScreenView
    public void values() {
        super.values();
        ByteBuffer byteBuffer = this.toString;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.valueOf;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.ag$a = false;
    }

    private ByteBuffer valueOf(int i) {
        int i2 = this.HaptikSDK$c;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.toString;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }
}
