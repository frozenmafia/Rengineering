package io.reactivex.internal.util;

import java.io.Serializable;
import o.FrameworkSQLiteDatabase;
import o.SupportSQLiteOpenHelper;
import o.discoverAndInitialize;
import o.getSidecarVersion;
import o.registerConfigurationChangeListener;
/* loaded from: classes.dex */
public enum NotificationLite {
    COMPLETE;

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static <T> Object next(T t) {
        return t;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;
        final Throwable e;

        ErrorNotification(Throwable th) {
            this.e = th;
        }

        public String toString() {
            return "NotificationLite.Error[" + this.e + "]";
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return discoverAndInitialize.values(this.e, ((ErrorNotification) obj).e);
            }
            return false;
        }
    }

    /* loaded from: classes7.dex */
    static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final getSidecarVersion upstream;

        SubscriptionNotification(getSidecarVersion getsidecarversion) {
            this.upstream = getsidecarversion;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.upstream + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final FrameworkSQLiteDatabase.AnonymousClass2 upstream;

        DisposableNotification(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
            this.upstream = anonymousClass2;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.upstream + "]";
        }
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object error(Throwable th) {
        return new ErrorNotification(th);
    }

    public static Object subscription(getSidecarVersion getsidecarversion) {
        return new SubscriptionNotification(getsidecarversion);
    }

    public static Object disposable(FrameworkSQLiteDatabase.AnonymousClass2 anonymousClass2) {
        return new DisposableNotification(anonymousClass2);
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isError(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof SubscriptionNotification;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof DisposableNotification;
    }

    public static Throwable getError(Object obj) {
        return ((ErrorNotification) obj).e;
    }

    public static getSidecarVersion getSubscription(Object obj) {
        return ((SubscriptionNotification) obj).upstream;
    }

    public static FrameworkSQLiteDatabase.AnonymousClass2 getDisposable(Object obj) {
        return ((DisposableNotification) obj).upstream;
    }

    public static <T> boolean accept(Object obj, registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        if (obj == COMPLETE) {
            registerconfigurationchangelistener.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            registerconfigurationchangelistener.onError(((ErrorNotification) obj).e);
            return true;
        } else {
            registerconfigurationchangelistener.onNext(obj);
            return false;
        }
    }

    public static <T> boolean accept(Object obj, SupportSQLiteOpenHelper.Factory<? super T> factory) {
        if (obj == COMPLETE) {
            factory.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            factory.onError(((ErrorNotification) obj).e);
            return true;
        } else {
            factory.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, registerConfigurationChangeListener<? super T> registerconfigurationchangelistener) {
        if (obj == COMPLETE) {
            registerconfigurationchangelistener.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            registerconfigurationchangelistener.onError(((ErrorNotification) obj).e);
            return true;
        } else if (obj instanceof SubscriptionNotification) {
            registerconfigurationchangelistener.onSubscribe(((SubscriptionNotification) obj).upstream);
            return false;
        } else {
            registerconfigurationchangelistener.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, SupportSQLiteOpenHelper.Factory<? super T> factory) {
        if (obj == COMPLETE) {
            factory.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            factory.onError(((ErrorNotification) obj).e);
            return true;
        } else if (obj instanceof DisposableNotification) {
            factory.onSubscribe(((DisposableNotification) obj).upstream);
            return false;
        } else {
            factory.onNext(obj);
            return false;
        }
    }
}
