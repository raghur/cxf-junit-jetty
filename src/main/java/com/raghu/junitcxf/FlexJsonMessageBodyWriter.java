package com.raghu.junitcxf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;

import flexjson.JSONSerializer;

public class FlexJsonMessageBodyWriter implements MessageBodyWriter<Object> {

    public long getSize(Object arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4) {
        return 0;
    }

    public boolean isWriteable(Class<?> arg0, Type arg1, Annotation[] arg2, MediaType arg3) {
        return Object.class.isAssignableFrom(arg0);
    }

    public void writeTo(Object arg0, Class<?> arg1, Type arg2, Annotation[] arg3, MediaType arg4,
            MultivaluedMap<String, Object> arg5, OutputStream os) throws IOException, WebApplicationException {
        os.write(new JSONSerializer().serialize(arg0).getBytes());
    }

}
