package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import o.onStopLoading;
/* loaded from: classes6.dex */
public abstract class OutputDecorator implements Serializable {
    public abstract OutputStream decorate(onStopLoading onstoploading, OutputStream outputStream) throws IOException;

    public abstract Writer decorate(onStopLoading onstoploading, Writer writer) throws IOException;
}
