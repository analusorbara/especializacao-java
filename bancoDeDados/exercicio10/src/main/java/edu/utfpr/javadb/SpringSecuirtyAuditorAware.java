package edu.utfpr.javadb;

import org.springframework.data.domain.AuditorAware;
import java.util.Optional;

public class SpringSecuirtyAuditorAware implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("public");
    }
}
