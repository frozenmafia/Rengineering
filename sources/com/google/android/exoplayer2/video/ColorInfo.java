package com.google.android.exoplayer2.video;

import android.os.Bundle;
import androidx.databinding.library.baseAdapters.BR;
import com.google.android.exoplayer2.Bundleable;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;
/* loaded from: classes5.dex */
public final class ColorInfo implements Bundleable {
    public static final Bundleable.Creator<ColorInfo> CREATOR = ColorInfo$$ExternalSyntheticLambda0.INSTANCE;
    private static final int FIELD_COLOR_RANGE = 1;
    private static final int FIELD_COLOR_SPACE = 0;
    private static final int FIELD_COLOR_TRANSFER = 2;
    private static final int FIELD_HDR_STATIC_INFO = 3;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    private int hashCode;
    public final byte[] hdrStaticInfo;

    @Pure
    public static int isoColorPrimariesToColorSpace(int i) {
        if (i != 1) {
            if (i != 9) {
                return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    @Pure
    public static int isoTransferCharacteristicsToColorTransfer(int i) {
        if (i != 1) {
            if (i != 16) {
                if (i != 18) {
                    return (i == 6 || i == 7) ? 3 : -1;
                }
                return 7;
            }
            return 6;
        }
        return 3;
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.colorSpace = i;
        this.colorRange = i2;
        this.colorTransfer = i3;
        this.hdrStaticInfo = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        return this.colorSpace == colorInfo.colorSpace && this.colorRange == colorInfo.colorRange && this.colorTransfer == colorInfo.colorTransfer && Arrays.equals(this.hdrStaticInfo, colorInfo.hdrStaticInfo);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.colorSpace);
        sb.append(", ");
        sb.append(this.colorRange);
        sb.append(", ");
        sb.append(this.colorTransfer);
        sb.append(", ");
        sb.append(this.hdrStaticInfo != null);
        sb.append(")");
        return sb.toString();
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            int i = this.colorSpace;
            int i2 = this.colorRange;
            int i3 = this.colorTransfer;
            this.hashCode = ((((((i + BR.userTeamVM) * 31) + i2) * 31) + i3) * 31) + Arrays.hashCode(this.hdrStaticInfo);
        }
        return this.hashCode;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(keyForField(0), this.colorSpace);
        bundle.putInt(keyForField(1), this.colorRange);
        bundle.putInt(keyForField(2), this.colorTransfer);
        bundle.putByteArray(keyForField(3), this.hdrStaticInfo);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ColorInfo lambda$static$0(Bundle bundle) {
        return new ColorInfo(bundle.getInt(keyForField(0), -1), bundle.getInt(keyForField(1), -1), bundle.getInt(keyForField(2), -1), bundle.getByteArray(keyForField(3)));
    }

    private static String keyForField(int i) {
        return Integer.toString(i, 36);
    }
}
