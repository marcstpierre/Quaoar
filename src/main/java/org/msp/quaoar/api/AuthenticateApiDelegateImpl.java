package org.msp.quaoar.api;

import org.msp.quaoar.api.model.Authentication;
import org.msp.quaoar.api.model.AuthenticationDto;
import org.msp.quaoar.dao.AuthentificationRepository;
import org.msp.quaoar.domain.Authentification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class AuthenticateApiDelegateImpl implements AuthenticateApiDelegate {

    @Autowired
    AuthentificationRepository authentificationRepository;

    public ResponseEntity<AuthenticationDto>
    authenticatePost(Authentication authentication) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType :
                    MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0, \"token\" : \"token\" }";
                    ApiUtil.setExampleResponse(request, "application/json",
                            exampleString);
                    break;
                }
            }
        });

        Authentification auth = authentificationRepository
                .getAuthentificationDetailsFromCredentials(
                        authentication.getUsername(),
                        authentication.getPassword());
        if (auth != null) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
