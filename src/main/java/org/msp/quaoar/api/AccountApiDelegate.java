package org.msp.quaoar.api;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.msp.quaoar.api.model.AccountDto;
import org.msp.quaoar.api.model.ResultDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

/**
 * A delegate to be called by the {@link AccountApiController}}.
 * Implement this interface with a {@link
 * org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
           date = "2024-11-28T15:28:22.418319539-05:00[America/Toronto]")
public interface AccountApiDelegate {

  default Optional<NativeWebRequest> getRequest() { return Optional.empty(); }

  /**
   * GET /Account/{accountId}
   *
   * @param accountId Id du compte (required)
   * @return OK (status code 200)
   *         or not authorized (status code 400)
   * @see AccountApi#accountAccountIdGet
   */
  default ResponseEntity<AccountDto> accountAccountIdGet(Integer accountId) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType :
           MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString =
              "{ \"owner\" : { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"address\" : { \"number\" : 1, \"country\" : \"country\", \"province\" : \"province\", \"city\" : \"city\", \"street\" : \"street\", \"secondLine\" : \"secondLine\", \"codePostal\" : \"codePostal\" }, \"gender\" : \"gender\", \"phone\" : [ { \"number\" : \"438-508-2271\" }, { \"number\" : \"438-508-2271\" } ], \"id\" : 6, \"lastModifDate\" : \"17-02-2010\", \"birthDate\" : \"17-02-2010\" }, \"comembers\" : [ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"address\" : { \"number\" : 1, \"country\" : \"country\", \"province\" : \"province\", \"city\" : \"city\", \"street\" : \"street\", \"secondLine\" : \"secondLine\", \"codePostal\" : \"codePostal\" }, \"gender\" : \"gender\", \"phone\" : [ { \"number\" : \"438-508-2271\" }, { \"number\" : \"438-508-2271\" } ], \"id\" : 6, \"lastModifDate\" : \"17-02-2010\", \"birthDate\" : \"17-02-2010\" }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"address\" : { \"number\" : 1, \"country\" : \"country\", \"province\" : \"province\", \"city\" : \"city\", \"street\" : \"street\", \"secondLine\" : \"secondLine\", \"codePostal\" : \"codePostal\" }, \"gender\" : \"gender\", \"phone\" : [ { \"number\" : \"438-508-2271\" }, { \"number\" : \"438-508-2271\" } ], \"id\" : 6, \"lastModifDate\" : \"17-02-2010\", \"birthDate\" : \"17-02-2010\" } ], \"id\" : 0, \"lastModifDate\" : \"17-02-2010\", \"email\" : \"email\", \"token\" : \"token\" }";
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