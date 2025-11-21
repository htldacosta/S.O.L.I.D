import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UserService {

    private final List<User> database = List.of(
            new User(1L, "alice@email.com"),
            new User(2L, "bob@email.com")
    );

    public List<User> findUsers(Specification<User> specification) {

        return database.stream()
                .filter(specification::isSatisfieldBy)
                .collect(Collectors.toList());
    }
}
