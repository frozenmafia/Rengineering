package o;

import com.squareup.sqldelight.internal.FunctionsJvmKt$threadLocalRef$1;
import com.squareup.sqldelight.logs.LogSqliteDriver$newTransaction$1;
import com.squareup.sqldelight.logs.LogSqliteDriver$newTransaction$2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.Styleable;
import o.dispatchOnOpenPrepackagedDatabase;
import org.apache.http.message.TokenParser;
/* loaded from: classes7.dex */
public final class AutoMigrationCallback implements TransactionExecutor {
    private final TransactionExecutor ah$a;
    private final Styleable.ChangeBounds<String, setAnimationMatrix> values;

    /* renamed from: o.AutoMigrationCallback$-CC */
    /* loaded from: classes7.dex */
    public final class CC {
        public static final <T> Styleable.ArcMotion<T> toString(T t) {
            ThreadLocal threadLocal = new ThreadLocal();
            threadLocal.set(t);
            return new FunctionsJvmKt$threadLocalRef$1(threadLocal);
        }

        public static final <T> Set<T> values() {
            return new LinkedHashSet();
        }

        public static final <T, R> Map<T, R> ag$a() {
            return new LinkedHashMap();
        }
    }

    @Override // o.TransactionExecutor
    public dispatchOnOpenPrepackagedDatabase.values valueOf() {
        return this.ah$a.valueOf();
    }

    @Override // o.TransactionExecutor
    public void ag$a(Integer num, String str, int i, Styleable.ChangeBounds<? super scheduleNext, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(str, "sql");
        Styleable.ChangeBounds<String, setAnimationMatrix> changeBounds2 = this.values;
        changeBounds2.invoke("EXECUTE\n " + str);
        valueOf(changeBounds);
        this.ah$a.ag$a(num, str, i, changeBounds);
    }

    @Override // o.TransactionExecutor
    public Transaction toString(Integer num, String str, int i, Styleable.ChangeBounds<? super scheduleNext, setAnimationMatrix> changeBounds) {
        runAnimators.ag$a(str, "sql");
        Styleable.ChangeBounds<String, setAnimationMatrix> changeBounds2 = this.values;
        changeBounds2.invoke("QUERY\n " + str);
        valueOf(changeBounds);
        return this.ah$a.toString(num, str, i, changeBounds);
    }

    @Override // o.TransactionExecutor
    public dispatchOnOpenPrepackagedDatabase.values ah$a() {
        this.values.invoke("TRANSACTION BEGIN");
        dispatchOnOpenPrepackagedDatabase.values ah$a = this.ah$a.ah$a();
        ah$a.valueOf(new LogSqliteDriver$newTransaction$1(this));
        ah$a.ah$a(new LogSqliteDriver$newTransaction$2(this));
        return ah$a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.values.invoke("CLOSE CONNECTION");
        this.ah$a.close();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.$default$onPostMigrate] */
    private final void valueOf(Styleable.ChangeBounds<? super scheduleNext, setAnimationMatrix> changeBounds) {
        if (changeBounds != null) {
            ?? r0 = new scheduleNext() { // from class: o.$default$onPostMigrate
                private final List<Object> toString = new ArrayList();

                @Override // o.scheduleNext
                public void valueOf(int i, String str) {
                    this.toString.add(str);
                }

                public final List<Object> ag$a() {
                    List<Object> ak = reserveEndViewTransition.ak(this.toString);
                    this.toString.clear();
                    return ak;
                }
            };
            changeBounds.invoke(r0);
            List<Object> ag$a = r0.ag$a();
            if (!ag$a.isEmpty()) {
                Styleable.ChangeBounds<String, setAnimationMatrix> changeBounds2 = this.values;
                StringBuilder sb = new StringBuilder();
                sb.append(TokenParser.SP);
                sb.append(ag$a);
                changeBounds2.invoke(sb.toString());
            }
        }
    }
}
