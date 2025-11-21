public class UserByIdSpecification implements Specification<User>{
    private final Long id;

    public UserByIdSpecification(Long id) {this.id = id; }

    @Override
    public boolean isSatisfiedBy(User user) {
        return id != null && id.equals(user.getId());
    }
}

