package com.facebook.imagepipeline.memory;
/* loaded from: classes6.dex */
public class BitmapCounterConfig {
    public static final int DEFAULT_MAX_BITMAP_COUNT = 384;
    private int mMaxBitmapCount;

    public BitmapCounterConfig(Builder builder) {
        this.mMaxBitmapCount = 384;
        this.mMaxBitmapCount = builder.getMaxBitmapCount();
    }

    public int getMaxBitmapCount() {
        return this.mMaxBitmapCount;
    }

    public void setMaxBitmapCount(int i) {
        this.mMaxBitmapCount = i;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /* loaded from: classes6.dex */
    public static class Builder {
        private int mMaxBitmapCount;

        private Builder() {
            this.mMaxBitmapCount = 384;
        }

        public Builder setMaxBitmapCount(int i) {
            this.mMaxBitmapCount = i;
            return this;
        }

        public int getMaxBitmapCount() {
            return this.mMaxBitmapCount;
        }

        public BitmapCounterConfig build() {
            return new BitmapCounterConfig(this);
        }
    }
}
