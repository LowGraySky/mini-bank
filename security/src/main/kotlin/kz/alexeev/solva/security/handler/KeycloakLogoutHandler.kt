package kz.alexeev.solva.security.handler

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import lombok.extern.slf4j.Slf4j
import org.springframework.security.core.Authentication
import org.springframework.security.oauth2.core.oidc.user.OidcUser
import org.springframework.security.web.authentication.logout.LogoutHandler
import org.springframework.stereotype.Component

@Slf4j
@Component
class KeycloakLogoutHandler: LogoutHandler(
    private val
) {
    override fun logout(
        request: HttpServletRequest?,
        response: HttpServletResponse?,
        authentication: Authentication?) =
        logoutFromKeycloak(authentication.principal as OidcUser)

    private fun logoutFromKeycloak(user: OidcUser) =

}