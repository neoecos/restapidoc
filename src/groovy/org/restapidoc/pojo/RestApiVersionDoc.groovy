package org.restapidoc.pojo

import org.jsondoc.core.pojo.ApiVersionDoc
import org.restapidoc.annotation.RestApiVersion

/**
 * Created by sortiz on 15/10/14.
 */
class RestApiVersionDoc extends ApiVersionDoc {

    public static RestApiVersionDoc buildFromAnnotation(RestApiVersion annotation) {
        RestApiVersionDoc apiVersionDoc = new RestApiVersionDoc();
        apiVersionDoc.setSince(annotation.since());
        apiVersionDoc.setUntil(annotation.until());
        return apiVersionDoc;
    }

    public RestApiVersionDoc(){
        super();
    }
}
