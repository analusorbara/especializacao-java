import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

import java.util.Optional;

public class SpringSecuirtyAuditorAware implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        Authentication auth = SecurityContextHolder
                .getContext()
                .getAuthentication();
        if (auth == null || ! auth.isAuthenticated()){
            return Optional.empty();
        }
        return Optional.of(((User) auth.getPrincipal()).getUsername());
    }
}
