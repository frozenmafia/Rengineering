package com.google.ads.interactivemedia.v3.impl.data;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class o extends ax {
    private int height;
    private int left;
    private byte set$0;
    private int top;
    private int width;

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ay build() {
        if (this.set$0 != 15) {
            StringBuilder sb = new StringBuilder();
            if ((this.set$0 & 1) == 0) {
                sb.append(" left");
            }
            if ((this.set$0 & 2) == 0) {
                sb.append(" top");
            }
            if ((this.set$0 & 4) == 0) {
                sb.append(" height");
            }
            if ((this.set$0 & 8) == 0) {
                sb.append(" width");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new q(this.left, this.top, this.height, this.width, null);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax height(int i) {
        this.height = i;
        this.set$0 = (byte) (this.set$0 | 4);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax left(int i) {
        this.left = i;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax top(int i) {
        this.top = i;
        this.set$0 = (byte) (this.set$0 | 2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ax
    public ax width(int i) {
        this.width = i;
        this.set$0 = (byte) (this.set$0 | 8);
        return this;
    }
}
