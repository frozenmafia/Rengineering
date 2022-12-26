package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class bpf {
    private static final Logger a = Logger.getLogger(boh.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final String f930b = "com.google.ads.interactivemedia.v3.internal.bnp";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boy b(Class cls) {
        String format;
        ClassLoader classLoader = bpf.class.getClassLoader();
        if (cls.equals(boy.class)) {
            format = f930b;
        } else if (!cls.getPackage().equals(bpf.class.getPackage())) {
            throw new IllegalArgumentException(cls.getName());
        } else {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return (boy) cls.cast(((bpf) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
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
            Iterator it = ServiceLoader.load(bpf.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((bpf) it.next()).a()));
                } catch (ServiceConfigurationError e5) {
                    a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(cls.getSimpleName())), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (boy) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (boy) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    protected abstract boy a();
}
