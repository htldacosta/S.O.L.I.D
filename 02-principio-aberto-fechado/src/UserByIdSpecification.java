public class UserByIdSpecification implements Specification<User>{
    private final Long id;

    public UserByIdSpecification(Long id) {this.id = id; }
}
