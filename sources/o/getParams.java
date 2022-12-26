package o;

import com.appsamurai.storyly.exoplayer2.extractor.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class getParams {
    public final long toString;
    public final List<values> values;

    /* loaded from: classes3.dex */
    public static final class values {
        public final String ag$a;
        public final long ah$a;
        public final long valueOf;
        public final String values;

        public values(String str, String str2, long j, long j2) {
            this.values = str;
            this.ag$a = str2;
            this.ah$a = j;
            this.valueOf = j2;
        }
    }

    public getParams(long j, List<values> list) {
        this.toString = j;
        this.values = list;
    }

    public MotionPhotoMetadata ag$a(long j) {
        long j2;
        if (this.values.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.values.size() - 1; size >= 0; size--) {
            values valuesVar = this.values.get(size);
            boolean equals = MimeTypes.VIDEO_MP4.equals(valuesVar.values) | z;
            if (size == 0) {
                j3 -= valuesVar.valueOf;
                j2 = 0;
            } else {
                j2 = j3 - valuesVar.ah$a;
            }
            long j8 = j3;
            j3 = j2;
            if (!equals || j3 == j8) {
                z = equals;
            } else {
                j7 = j8 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j8;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j4, j5, this.toString, j6, j7);
    }
}
