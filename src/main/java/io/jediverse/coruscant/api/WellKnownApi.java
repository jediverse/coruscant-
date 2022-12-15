/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.jediverse.coruscant.api;

import io.jediverse.coruscant.model.WellKnownResponse;
import io.micronaut.http.*;
import io.micronaut.http.annotation.*;
import io.reactivex.Single;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.responses.*;


@Controller
public interface WellKnownApi {


    @Operation(summary = "Directs callers to /nodeinfo/2.0.", operationId = "nodeInfoWellKnownGet", description = "eg. `{\"links\":[{\"rel\":\"http://nodeinfo.diaspora.software/ns/schema/2.0\",\"href\":\"http://example.org/nodeinfo/2.0\"}]}` See: https://nodeinfo.diaspora.software/protocol.html" , tags = {"nodeinfo"})
    @ApiResponse(responseCode = "200", description = "")
    @Get(value = "/.well-known/nodeinfo", produces = { "application/json" })
    default Single<HttpResponse<WellKnownResponse>> nodeInfoWellKnownGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }


    @Operation(summary = "Handles webfinger account lookup requests.", operationId = "webfingerGet", description = "For example, a GET to `https://goblin.technology/.well-known/webfinger?resource=acct:tobi@goblin.technology` would return:  ```  {\"subject\":\"acct:tobi@goblin.technology\",\"aliases\":[\"https://goblin.technology/users/tobi\",\"https://goblin.technology/@tobi\"],\"links\":[{\"rel\":\"http://webfinger.net/rel/profile-page\",\"type\":\"text/html\",\"href\":\"https://goblin.technology/@tobi\"},{\"rel\":\"self\",\"type\":\"application/activity+json\",\"href\":\"https://goblin.technology/users/tobi\"}]}  ```  See: https://webfinger.net/" , tags = {"webfinger"})
    @ApiResponse(responseCode = "200", description = "")
    @Get(value = "/.well-known/webfinger", produces = { "application/json" })
    default Single<HttpResponse<WellKnownResponse>> webfingerGet() {
        return Single.fromCallable(() -> {
            throw new UnsupportedOperationException();
        });
    }

}