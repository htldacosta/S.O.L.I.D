public interface Specification<T> {

    boolean isSatisfiedBy(T item);

}

class User {
    private Long id;
    private String email;
    public User(Long id, String email) { this.id = id; this.email = email;}
    public Long getId() { return id; }
    public String getEmail() { return email; }
}
