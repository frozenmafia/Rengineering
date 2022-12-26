package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzrc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes7.dex */
public class zzqp {
    private static volatile boolean zzaxh = false;
    private static volatile zzqp zzaxj;
    private final Map<zza, zzrc.zzd<?, ?>> zzaxl;
    private static final Class<?> zzaxi = zzop();
    static final zzqp zzaxk = new zzqp(true);

    private static Class<?> zzop() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* loaded from: classes7.dex */
    static final class zza {
        private final int number;
        private final Object object;

        zza(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                return this.object == zzaVar.object && this.number == zzaVar.number;
            }
            return false;
        }
    }

    public static zzqp zzoq() {
        return zzqo.zzon();
    }

    public static zzqp zzor() {
        zzqp zzqpVar = zzaxj;
        if (zzqpVar == null) {
            synchronized (zzqp.class) {
                zzqpVar = zzaxj;
                if (zzqpVar == null) {
                    zzqpVar = zzqo.zzoo();
                    zzaxj = zzqpVar;
                }
            }
        }
        return zzqpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzqp zzoo() {
        return zzra.zzd(zzqp.class);
    }

    public final <ContainingType extends zzsk> zzrc.zzd<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzrc.zzd<ContainingType, ?>) this.zzaxl.get(new zza(containingtype, i));
    }

    zzqp() {
        this.zzaxl = new HashMap();
    }

    private zzqp(boolean z) {
        this.zzaxl = Collections.emptyMap();
    }
}
