package config;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class DataConfig {
    private String username;
    private String password;

}
