package org.msp.quaoar.api;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.msp.quaoar.api.model.ResultDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

/**
 * A delegate to be called by the {@link ConfirmMemberApiController}}.
 * Implement this interface with a {@link
 * org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
           date = "2024-11-28T15:28:22.418319539-05:00[America/Toronto]")
public interface ConfirmMemberApiDelegate {

  default Optional<NativeWebRequest> getRequest() { return Optional.empty(); }

  /**
   * GET /confirmMember/{token}
   *
   * @param token Token qui permet l&#39;action (required)
   * @return OK (status code 200)
   *         or Not authorized (status code 400)
   * @see ConfirmMemberApi#confirmMemberTokenGet
   */
  default ResponseEntity<ResultDto> confirmMemberTokenGet(String token) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType :
           MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString =
              "{ \"code\" : \"code\", \"topic\" : \"topic\", \"message\" : \"message\", \"url\" : \"url\" }";
          ApiUtil.setExampleResponse(request, "application/json",
                                     exampleString);
          break;
        }
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString =
              "{ \"code\" : \"code\", \"topic\" : \"topic\", \"message\" : \"message\", \"url\" : \"url\" }";
          ApiUtil.setExampleResponse(request, "application/json",
                                     exampleString);
          break;
        }
      }
    });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
