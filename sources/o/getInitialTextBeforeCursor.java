package o;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.task.Task;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* loaded from: classes4.dex */
public class getInitialTextBeforeCursor {
    public final setInitialSurroundingSubText ag$a;
    private final HashMap<String, setContentMimeTypes> ah$a;
    public final setInitialSurroundingSubText toString;
    protected final CleverTapInstanceConfig valueOf;
    public final getInitialTextAfterCursor values = new getInitialTextAfterCursor();

    /* JADX INFO: Access modifiers changed from: package-private */
    public getInitialTextBeforeCursor(CleverTapInstanceConfig cleverTapInstanceConfig) {
        setInitialSurroundingSubText setinitialsurroundingsubtext = new setInitialSurroundingSubText();
        this.ag$a = setinitialsurroundingsubtext;
        this.toString = setinitialsurroundingsubtext;
        this.ah$a = new HashMap<>();
        this.valueOf = cleverTapInstanceConfig;
    }

    public <TResult> Task<TResult> ah$a() {
        return values(this.values, this.toString, "ioTask");
    }

    public <TResult> Task<TResult> valueOf() {
        return values(this.ag$a, this.toString, "Main");
    }

    public <TResult> Task<TResult> valueOf(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Tag can't be null");
        }
        setContentMimeTypes setcontentmimetypes = this.ah$a.get(str);
        if (setcontentmimetypes == null) {
            setcontentmimetypes = new setContentMimeTypes();
            this.ah$a.put(str, setcontentmimetypes);
        }
        return values(setcontentmimetypes, this.toString, "PostAsyncSafely");
    }

    public <TResult> Task<TResult> ag$a() {
        return valueOf(this.valueOf.valueOf());
    }

    public <TResult> Task<TResult> values(Executor executor, Executor executor2, String str) {
        if (executor == null || executor2 == null) {
            throw new IllegalArgumentException("Can't create task " + str + " with null executors");
        }
        return new Task<>(this.valueOf, executor, executor2, str);
    }
}
