package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzqp;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class zzra<T extends zzqp> {
    private static final Logger logger = Logger.getLogger(zzqj.class.getName());
    private static String zzbai = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    zzra() {
    }

    protected abstract T zzpb();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzqp> T zzd(Class<T> cls) {
        String format;
        ClassLoader classLoader = zzra.class.getClassLoader();
        if (cls.equals(zzqp.class)) {
            format = zzbai;
        } else if (!cls.getPackage().equals(zzra.class.getPackage())) {
            throw new IllegalArgumentException(cls.getName());
        } else {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((zzra) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zzpb());
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (InstantiationException e3) {
                throw new IllegalStateException(e3);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzra.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((zzra) it.next()).zzpb()));
                } catch (ServiceConfigurationError e5) {
                    Logger logger2 = logger;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger2.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() != 0 ? "Unable to load ".concat(valueOf) : new String("Unable to load "), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }
}
