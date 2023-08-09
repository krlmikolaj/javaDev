package zajavka.service;


import org.springframework.stereotype.Service;
import zajavka.domain.User;
@Service
public class StringPreparationService {

    public String prepare(final User user) {
        return String.format("%s;%s", user.getBirth_date(), user.getEmail());
    }
}
