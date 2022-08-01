package anno;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class DataConfig {
    @Value("111")
    private String username;
    @Value("222")
    private String password;
}
