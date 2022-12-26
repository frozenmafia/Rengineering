package o;

import o.Visibility;
/* loaded from: classes5.dex */
public final class SidePropagation {
    public static final setEnterAction ah$a;

    static {
        setEnterAction setenteraction;
        Object newInstance;
        Object newInstance2;
        int ag$a = ag$a();
        if (ag$a >= 65544 || ag$a < 65536) {
            try {
                try {
                    newInstance = Class.forName("o.getMaxDistance").newInstance();
                    runAnimators.ah$a(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                    } catch (ClassCastException e) {
                        ClassLoader classLoader = newInstance.getClass().getClassLoader();
                        ClassLoader classLoader2 = setEnterAction.class.getClassLoader();
                        if (runAnimators.values(classLoader, classLoader2)) {
                            throw e;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                    }
                } catch (ClassNotFoundException unused) {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    runAnimators.ah$a(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        if (newInstance3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        setenteraction = (setEnterAction) newInstance3;
                    } catch (ClassCastException e2) {
                        ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                        ClassLoader classLoader4 = setEnterAction.class.getClassLoader();
                        if (runAnimators.values(classLoader3, classLoader4)) {
                            throw e2;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                    }
                }
            } catch (ClassNotFoundException unused2) {
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            setenteraction = (setEnterAction) newInstance;
            ah$a = setenteraction;
        }
        if (ag$a >= 65543 || ag$a < 65536) {
            try {
                try {
                    newInstance2 = Class.forName("o.Slide").newInstance();
                    runAnimators.ah$a(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                } catch (ClassNotFoundException unused3) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    runAnimators.ah$a(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        if (newInstance4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        setenteraction = (setEnterAction) newInstance4;
                    } catch (ClassCastException e3) {
                        ClassLoader classLoader5 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = setEnterAction.class.getClassLoader();
                        if (runAnimators.values(classLoader5, classLoader6)) {
                            throw e3;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                    }
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                if (newInstance2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
                setenteraction = (setEnterAction) newInstance2;
                ah$a = setenteraction;
            } catch (ClassCastException e4) {
                ClassLoader classLoader7 = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader8 = setEnterAction.class.getClassLoader();
                if (runAnimators.values(classLoader7, classLoader8)) {
                    throw e4;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
            }
        }
        setenteraction = new setEnterAction();
        ah$a = setenteraction;
    }

    private static final int ag$a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        String str = property;
        int ah$a2 = Visibility.Mode.ah$a((CharSequence) str, '.', 0, false, 6, (Object) null);
        if (ah$a2 < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i = ah$a2 + 1;
        int ah$a3 = Visibility.Mode.ah$a((CharSequence) str, '.', i, false, 4, (Object) null);
        if (ah$a3 < 0) {
            ah$a3 = property.length();
        }
        String substring = property.substring(0, ah$a2);
        runAnimators.ah$a(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = property.substring(i, ah$a3);
        runAnimators.ah$a(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        try {
            return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}
