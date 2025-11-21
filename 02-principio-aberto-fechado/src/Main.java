public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();

        Specification<User> filtroId = new UserByIdSpecification(1L);
        System.out.println("Buscar por ID 1: " + service.findUsers(filtroId).size());

        Specification<User> filtroEmail = new UserByEmailSpecification("bob@email.com");
        System.out.println("Buscar por Email bob: " + service.findUsers(filtroEmail).size());
    }
}