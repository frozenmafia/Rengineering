package com.clevertap.android.sdk.task;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import o.getProtocol;
import o.isPasswordInputType;
import o.setBoundsInScreen;
import o.setInitialSurroundingText;
import o.setSurroundingText;
/* loaded from: classes4.dex */
public class Task<TResult> {
    private final String HaptikSDK$c;
    protected final Executor ag$a;
    protected TResult ah$a;
    protected final Executor toString;
    protected final CleverTapInstanceConfig values;
    protected final List<getProtocol<Exception>> valueOf = new ArrayList();
    protected final List<isPasswordInputType<TResult>> invoke = new ArrayList();
    protected STATE HaptikSDK$b = STATE.READY_TO_RUN;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public enum STATE {
        FAILED,
        SUCCESS,
        READY_TO_RUN,
        RUNNING
    }

    public Task(CleverTapInstanceConfig cleverTapInstanceConfig, Executor executor, Executor executor2, String str) {
        this.toString = executor;
        this.ag$a = executor2;
        this.values = cleverTapInstanceConfig;
        this.HaptikSDK$c = str;
    }

    public Task<TResult> ah$a(Executor executor, setSurroundingText<Exception> setsurroundingtext) {
        synchronized (this) {
            if (setsurroundingtext != null) {
                this.valueOf.add(new getProtocol<>(executor, setsurroundingtext));
            }
        }
        return this;
    }

    public Task<TResult> toString(setSurroundingText<Exception> setsurroundingtext) {
        return ah$a(this.ag$a, setsurroundingtext);
    }

    public Task<TResult> values(Executor executor, setInitialSurroundingText<TResult> setinitialsurroundingtext) {
        if (setinitialsurroundingtext != null) {
            this.invoke.add(new isPasswordInputType<>(executor, setinitialsurroundingtext, this.values));
        }
        return this;
    }

    public Task<TResult> toString(setInitialSurroundingText<TResult> setinitialsurroundingtext) {
        return values(this.ag$a, setinitialsurroundingtext);
    }

    public void ah$a(String str, Callable<TResult> callable) {
        this.toString.execute(valueOf(str, callable));
    }

    public Future<?> toString(String str, Callable<TResult> callable) {
        Executor executor = this.toString;
        if (!(executor instanceof ExecutorService)) {
            throw new UnsupportedOperationException("Can't use this method without ExecutorService, Use Execute alternatively ");
        }
        return ((ExecutorService) executor).submit(valueOf(str, callable));
    }

    void values(Exception exc) {
        ah$a(STATE.FAILED);
        for (getProtocol<Exception> getprotocol : this.valueOf) {
            getprotocol.values((getProtocol<Exception>) exc);
        }
    }

    void toString(TResult tresult) {
        ah$a(STATE.SUCCESS);
        values((Task<TResult>) tresult);
        for (isPasswordInputType<TResult> ispasswordinputtype : this.invoke) {
            ispasswordinputtype.values(this.ah$a);
        }
    }

    void values(TResult tresult) {
        this.ah$a = tresult;
    }

    void ah$a(STATE state) {
        this.HaptikSDK$b = state;
    }

    private Runnable valueOf(final String str, final Callable<TResult> callable) {
        return new Runnable() { // from class: com.clevertap.android.sdk.task.Task.5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    setBoundsInScreen HaptikSDK$c = Task.this.values.HaptikSDK$c();
                    HaptikSDK$c.HaptikSDK$b(Task.this.HaptikSDK$c + " Task: " + str + " starting on..." + Thread.currentThread().getName());
                    Object call = callable.call();
                    setBoundsInScreen HaptikSDK$c2 = Task.this.values.HaptikSDK$c();
                    HaptikSDK$c2.HaptikSDK$b(Task.this.HaptikSDK$c + " Task: " + str + " executed successfully on..." + Thread.currentThread().getName());
                    Task.this.toString((Task) call);
                } catch (Exception e) {
                    Task.this.values(e);
                    setBoundsInScreen HaptikSDK$c3 = Task.this.values.HaptikSDK$c();
                    HaptikSDK$c3.toString(Task.this.HaptikSDK$c + " Task: " + str + " failed to execute on..." + Thread.currentThread().getName(), e);
                    e.printStackTrace();
                }
            }
        };
    }
}
