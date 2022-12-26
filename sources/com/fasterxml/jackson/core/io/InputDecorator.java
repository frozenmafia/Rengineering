package com.fasterxml.jackson.core.io;

import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import o.onStopLoading;
/* loaded from: classes6.dex */
public abstract class InputDecorator implements Serializable {
    private static final long serialVersionUID = 1;

    public abstract InputStream decorate(onStopLoading onstoploading, InputStream inputStream) throws IOException;

    public abstract InputStream decorate(onStopLoading onstoploading, byte[] bArr, int i, int i2) throws IOException;

    public abstract Reader decorate(onStopLoading onstoploading, Reader reader) throws IOException;

    public DataInput decorate(onStopLoading onstoploading, DataInput dataInput) throws IOException {
        throw new UnsupportedOperationException();
    }
}
