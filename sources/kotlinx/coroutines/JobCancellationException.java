package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import o.ArgbEvaluator;
import o.getPathName;
import o.getPixelSize;
import o.runAnimators;
/* loaded from: classes5.dex */
public final class JobCancellationException extends CancellationException implements ArgbEvaluator<JobCancellationException> {
    public final transient getPathName job;

    public JobCancellationException(String str, Throwable th, getPathName getpathname) {
        super(str);
        this.job = getpathname;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        boolean z;
        z = getPixelSize.ag$a;
        if (z) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // o.ArgbEvaluator
    public JobCancellationException createCopy() {
        boolean z;
        z = getPixelSize.ag$a;
        if (z) {
            String message = getMessage();
            runAnimators.toString((Object) message);
            return new JobCancellationException(message, this, this.job);
        }
        return null;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.job;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!runAnimators.values((Object) jobCancellationException.getMessage(), (Object) getMessage()) || !runAnimators.values(jobCancellationException.job, this.job) || !runAnimators.values(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String message = getMessage();
        runAnimators.toString((Object) message);
        int hashCode = message.hashCode();
        int hashCode2 = this.job.hashCode();
        Throwable cause = getCause();
        return (((hashCode * 31) + hashCode2) * 31) + (cause != null ? cause.hashCode() : 0);
    }
}
