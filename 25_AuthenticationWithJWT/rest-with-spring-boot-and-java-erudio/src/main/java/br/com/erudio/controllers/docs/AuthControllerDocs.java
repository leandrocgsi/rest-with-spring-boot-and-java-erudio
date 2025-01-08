package br.com.erudio.controllers.docs;

import br.com.erudio.data.dto.security.AccountCredentialsDTO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface AuthControllerDocs {

    @Operation(summary = "Authenticates an user and returns a token")
    ResponseEntity<?> signin(AccountCredentialsDTO credentials);

    @Operation(summary = "Refresh token for authenticated user and returns a token")
    ResponseEntity<?> refreshToken(
        String username,
        String refreshToken);

    @Operation(summary = "Create a new User")
    AccountCredentialsDTO create(AccountCredentialsDTO credentials);
}
