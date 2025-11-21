public class UserByEmailSpecification implements Specification<User> {
    private final String email;

    public UserByEmailSpecification(String email) { this.email = email;}

    @Override
    public boolean isSatisfiedBy(User user) {
        return email != null && email.equals(user.getEmail());
    }
}
