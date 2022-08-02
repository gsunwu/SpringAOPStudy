package anno;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component //@Component： 类似于 xml 中的 bean 标签
public class DataConfig {
    @Value("111") // @Value： 类似于 bean 中的 property 标签
    private String username;
    @Value("222")
    private String password;
}
