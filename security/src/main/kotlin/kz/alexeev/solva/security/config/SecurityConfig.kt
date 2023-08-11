package kz.alexeev.solva.security.config

import kz.alexeev.solva.security.handler.KeycloakLogoutHandler
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity

@Configuration
@EnableWebSecurity
class SecurityConfig(
    private val keyCloakLogoutHandler: KeycloakLogoutHandler
) {

}