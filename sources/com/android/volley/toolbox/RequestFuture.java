package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes6.dex */
public class RequestFuture<T> implements Future<T>, Response.Listener<T>, Response.ErrorListener {
    private VolleyError mException;
    private Request<?> mRequest;
    private T mResult;
    private boolean mResultReceived = false;

    public static <E> RequestFuture<E> newFuture() {
        return new RequestFuture<>();
    }

    private RequestFuture() {
    }

    public void setRequest(Request<?> request) {
        this.mRequest = request;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            if (this.mRequest == null) {
                return false;
            }
            if (isDone()) {
                return false;
            }
            this.mRequest.cancel();
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        try {
            return doGet(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return doGet(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }

    private T doGet(Long l) throws InterruptedException, ExecutionException, TimeoutException {
        synchronized (this) {
            if (this.mException != null) {
                throw new ExecutionException(this.mException);
            }
            if (this.mResultReceived) {
                return this.mResult;
            }
            if (l == null) {
                while (!isDone()) {
                    wait(0L);
                }
            } else if (l.longValue() > 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long longValue = l.longValue() + uptimeMillis;
                while (!isDone() && uptimeMillis < longValue) {
                    wait(longValue - uptimeMillis);
                    uptimeMillis = SystemClock.uptimeMillis();
                }
            }
            if (this.mException != null) {
                throw new ExecutionException(this.mException);
            }
            if (!this.mResultReceived) {
                throw new TimeoutException();
            }
            return this.mResult;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        Request<?> request = this.mRequest;
        if (request == null) {
            return false;
        }
        return request.isCanceled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        boolean z;
        synchronized (this) {
            if (!this.mResultReceived && this.mException == null) {
                z = isCancelled();
            }
        }
        return z;
    }

    @Override // com.android.volley.Response.Listener
    public void onResponse(T t) {
        synchronized (this) {
            this.mResultReceived = true;
            this.mResult = t;
            notifyAll();
        }
    }

    @Override // com.android.volley.Response.ErrorListener
    public void onErrorResponse(VolleyError volleyError) {
        synchronized (this) {
            this.mException = volleyError;
            notifyAll();
        }
    }
}
