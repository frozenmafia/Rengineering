package o;

import com.apollographql.apollo.api.ResponseField;
import java.util.List;
import o.Styleable;
import o.removeCancellable;
/* loaded from: classes.dex */
public final class removeCancellable$ag$a {

    /* loaded from: classes.dex */
    public static final class toString implements removeCancellable.toString<T> {
        final /* synthetic */ Styleable.ChangeBounds values;

        toString(Styleable.ChangeBounds changeBounds) {
            this.values = changeBounds;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // o.removeCancellable.toString
        public T values(removeCancellable removecancellable) {
            runAnimators.valueOf(removecancellable, "reader");
            return this.values.invoke(removecancellable);
        }
    }

    public static <T> T valueOf(removeCancellable removecancellable, ResponseField responseField, Styleable.ChangeBounds<? super removeCancellable, ? extends T> changeBounds) {
        runAnimators.valueOf(responseField, "field");
        runAnimators.valueOf(changeBounds, "block");
        return (T) removecancellable.valueOf(responseField, new toString(changeBounds));
    }

    public static <T> T values(removeCancellable removecancellable, ResponseField responseField, final Styleable.ChangeBounds<? super removeCancellable, ? extends T> changeBounds) {
        runAnimators.valueOf(responseField, "field");
        runAnimators.valueOf(changeBounds, "block");
        return (T) removecancellable.ag$a(responseField, new removeCancellable.toString<T>() { // from class: o.removeCancellable$ag$a.1
            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
            @Override // o.removeCancellable.toString
            public T values(removeCancellable removecancellable2) {
                runAnimators.valueOf(removecancellable2, "reader");
                return Styleable.ChangeBounds.this.invoke(removecancellable2);
            }
        });
    }

    /* loaded from: classes.dex */
    public static final class values implements removeCancellable.valueOf<T> {
        final /* synthetic */ Styleable.ChangeBounds ag$a;

        values(Styleable.ChangeBounds changeBounds) {
            this.ag$a = changeBounds;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // o.removeCancellable.valueOf
        public T toString(removeCancellable.values valuesVar) {
            runAnimators.valueOf(valuesVar, "reader");
            return this.ag$a.invoke(valuesVar);
        }
    }

    public static <T> List<T> ag$a(removeCancellable removecancellable, ResponseField responseField, Styleable.ChangeBounds<? super removeCancellable.values, ? extends T> changeBounds) {
        runAnimators.valueOf(responseField, "field");
        runAnimators.valueOf(changeBounds, "block");
        return removecancellable.toString(responseField, new values(changeBounds));
    }
}
