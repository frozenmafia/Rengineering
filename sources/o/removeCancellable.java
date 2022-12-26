package o;

import com.apollographql.apollo.api.ResponseField;
import java.util.List;
import o.Styleable;
/* loaded from: classes.dex */
public interface removeCancellable {

    /* loaded from: classes.dex */
    public interface toString<T> {
        T values(removeCancellable removecancellable);
    }

    /* loaded from: classes.dex */
    public interface valueOf<T> {
        T toString(values valuesVar);
    }

    <T> T ag$a(ResponseField responseField, toString<T> tostring);

    String ag$a(ResponseField responseField);

    <T> List<T> ag$a(ResponseField responseField, Styleable.ChangeBounds<? super values, ? extends T> changeBounds);

    Double ah$a(ResponseField responseField);

    <T> T ah$a(ResponseField.valueOf valueof);

    <T> T ah$a(ResponseField responseField, Styleable.ChangeBounds<? super removeCancellable, ? extends T> changeBounds);

    <T> List<T> toString(ResponseField responseField, valueOf<T> valueof);

    Integer valueOf(ResponseField responseField);

    <T> T valueOf(ResponseField responseField, Styleable.ChangeBounds<? super removeCancellable, ? extends T> changeBounds);

    <T> T valueOf(ResponseField responseField, toString<T> tostring);

    Boolean values(ResponseField responseField);

    /* loaded from: classes.dex */
    public interface values {
        <T> T ag$a(Styleable.ChangeBounds<? super removeCancellable, ? extends T> changeBounds);

        String ah$a();

        <T> List<T> valueOf(valueOf<T> valueof);

        int values();

        <T> T values(toString<T> tostring);

        <T> List<T> values(Styleable.ChangeBounds<? super values, ? extends T> changeBounds);

        /* loaded from: classes.dex */
        public static final class toString {
            public static <T> T toString(values valuesVar, final Styleable.ChangeBounds<? super removeCancellable, ? extends T> changeBounds) {
                runAnimators.valueOf(changeBounds, "block");
                return (T) valuesVar.values(new toString<T>() { // from class: o.removeCancellable$values$toString$ah$a
                    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
                    @Override // o.removeCancellable.toString
                    public T values(removeCancellable removecancellable) {
                        runAnimators.valueOf(removecancellable, "reader");
                        return Styleable.ChangeBounds.this.invoke(removecancellable);
                    }
                });
            }

            /* renamed from: o.removeCancellable$values$toString$values  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0351values implements valueOf<T> {
                final /* synthetic */ Styleable.ChangeBounds valueOf;

                C0351values(Styleable.ChangeBounds changeBounds) {
                    this.valueOf = changeBounds;
                }

                /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
                @Override // o.removeCancellable.valueOf
                public T toString(values valuesVar) {
                    runAnimators.valueOf(valuesVar, "reader");
                    return this.valueOf.invoke(valuesVar);
                }
            }

            public static <T> List<T> values(values valuesVar, Styleable.ChangeBounds<? super values, ? extends T> changeBounds) {
                runAnimators.valueOf(changeBounds, "block");
                return valuesVar.valueOf(new C0351values(changeBounds));
            }
        }
    }
}
