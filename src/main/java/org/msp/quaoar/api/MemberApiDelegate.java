package org.msp.quaoar.api;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.msp.quaoar.api.model.MemberDto;
import org.msp.quaoar.api.model.ResultDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

/**
 * A delegate to be called by the {@link MemberApiController}}.
 * Implement this interface with a {@link
 * org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
           date = "2024-11-28T15:28:22.418319539-05:00[America/Toronto]")
public interface MemberApiDelegate {

  default Optional<NativeWebRequest> getRequest() { return Optional.empty(); }

  /**
   * GET /member/{memberId}
   *
   * @param memberId id du membre (required)
   * @return OK (status code 200)
   *         or Not authorized (status code 400)
   * @see MemberApi#memberMemberIdGet
   */
  default ResponseEntity<MemberDto> memberMemberIdGet(Integer memberId) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType :
           MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString =
              "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"address\" : { \"number\" : 1, \"country\" : \"country\", \"province\" : \"province\", \"city\" : \"city\", \"street\" : \"street\", \"secondLine\" : \"secondLine\", \"codePostal\" : \"codePostal\" }, \"gender\" : \"gender\", \"phone\" : [ { \"number\" : \"438-508-2271\" }, { \"number\" : \"438-508-2271\" } ], \"id\" : 6, \"lastModifDate\" : \"17-02-2010\", \"birthDate\" : \"17-02-2010\" }";
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

  /**
   * POST /member/{memberId}/save
   *
   * @param memberId Id du memmbre (required)
   * @param memberDto  (required)
   * @return OK (status code 200)
   * @see MemberApi#memberMemberIdSavePost
   */
  default ResponseEntity<MemberDto>
  memberMemberIdSavePost(Integer memberId, MemberDto memberDto) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType :
           MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString =
              "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"address\" : { \"number\" : 1, \"country\" : \"country\", \"province\" : \"province\", \"city\" : \"city\", \"street\" : \"street\", \"secondLine\" : \"secondLine\", \"codePostal\" : \"codePostal\" }, \"gender\" : \"gender\", \"phone\" : [ { \"number\" : \"438-508-2271\" }, { \"number\" : \"438-508-2271\" } ], \"id\" : 6, \"lastModifDate\" : \"17-02-2010\", \"birthDate\" : \"17-02-2010\" }";
          ApiUtil.setExampleResponse(request, "application/json",
                                     exampleString);
          break;
        }
      }
    });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
