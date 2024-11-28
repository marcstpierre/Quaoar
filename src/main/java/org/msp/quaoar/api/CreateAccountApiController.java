package org.msp.quaoar.api;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.msp.quaoar.api.model.AccountResetDto;
import org.msp.quaoar.api.model.Authentication;
import org.msp.quaoar.api.model.AuthenticationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
           date = "2024-09-12T23:11:33.948822308-04:00[America/Toronto]")
@Controller
@RequestMapping("${openapi.aPITitle.base-path:/v1}")
public class CreateAccountApiController implements CreateAccountApi {

  private final CreateAccountApiDelegate delegate;

  public CreateAccountApiController(@Autowired(required = false)
                                    CreateAccountApiDelegate delegate) {
    this.delegate =
        Optional.ofNullable(delegate).orElse(new CreateAccountApiDelegateImpl() {});
  }

  @Override
  public CreateAccountApiDelegate getDelegate() {
    return delegate;
  }
}
