package o;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.appsamurai.storyly.exoplayer2.common.drm.DrmInitData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes3.dex */
public interface postDelayed {

    /* loaded from: classes3.dex */
    public interface values {
        void ah$a(postDelayed postdelayed, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    Map<String, String> ag$a(byte[] bArr);

    void ag$a();

    void ag$a(byte[] bArr, sendUrgentData sendurgentdata);

    void ag$a(byte[] bArr, byte[] bArr2);

    byte[] ah$a() throws MediaDrmException;

    void toString(byte[] bArr) throws DeniedByServerException;

    byte[] toString(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    getSplashScreenView valueOf(byte[] bArr) throws MediaCryptoException;

    toString valueOf();

    int values();

    postDelayed$ag$a values(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException;

    void values(values valuesVar);

    void values(byte[] bArr);

    boolean values(byte[] bArr, String str);

    /* renamed from: o.postDelayed$default  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class Cdefault implements getSplashScreenView {
        public static final boolean ah$a;
        public final byte[] ag$a;
        public final UUID toString;
        public final boolean valueOf;

        static {
            ah$a = "Amazon".equals(getElevationDegrees.toString) && ("AFTM".equals(getElevationDegrees.valueOf) || "AFTB".equals(getElevationDegrees.valueOf));
        }

        public Cdefault(UUID uuid, byte[] bArr, boolean z) {
            this.toString = uuid;
            this.ag$a = bArr;
            this.valueOf = z;
        }
    }

    /* loaded from: classes3.dex */
    public static final class toString {
        private final byte[] ag$a;
        private final String valueOf;

        public toString(byte[] bArr, String str) {
            this.ag$a = bArr;
            this.valueOf = str;
        }

        public byte[] ah$a() {
            return this.ag$a;
        }

        public String values() {
            return this.valueOf;
        }
    }
}
