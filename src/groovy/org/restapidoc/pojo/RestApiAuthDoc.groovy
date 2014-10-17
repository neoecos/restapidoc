package org.restapidoc.pojo

import org.jsondoc.core.pojo.ApiAuthDoc
import org.jsondoc.core.util.JSONDocUtils
import org.restapidoc.annotation.RestApiAuthBasicUser
import org.restapidoc.annotation.RestApiAuthNone
import org.restapidoc.annotation.RestApiAuthBasic

/**
 * Created by sortiz on 15/10/14.
 */
class RestApiAuthDoc extends ApiAuthDoc {


    public static RestApiAuthDoc buildFromUndefined() {
        RestApiAuthDoc apiAuthDoc = new RestApiAuthDoc();
        apiAuthDoc.setType(JSONDocUtils.UNDEFINED);
        return apiAuthDoc;
    }
    public static RestApiAuthDoc buildFromApiAuthNoneAnnotation(RestApiAuthNone annotation) {
        RestApiAuthDoc apiAuthDoc = new RestApiAuthDoc();
        apiAuthDoc.setType(RestApiAuthType.NONE.name());
        apiAuthDoc.addRole(JSONDocUtils.ANONYMOUS);
        return apiAuthDoc;
    }
    public static RestApiAuthDoc buildFromApiAuthBasicAnnotation(RestApiAuthBasic annotation) {
        RestApiAuthDoc apiAuthDoc = new RestApiAuthDoc();
        apiAuthDoc.setType(RestApiAuthType.BASIC_AUTH.name());
        apiAuthDoc.setRoles(Arrays.asList(annotation.roles()));
        for (RestApiAuthBasicUser testuser : annotation.testusers()) {
            apiAuthDoc.addTestUser(testuser.username(), testuser.password());
        }
        return apiAuthDoc;
    }

    public RestApiAuthDoc(){
        super();
    }

}
